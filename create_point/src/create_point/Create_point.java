/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package create_point;
import javax.swing.*;
import java.awt.*;
import javax.swing.UIManager.*;
/**
 *
 * @author L
 */
public class Create_point {

    /**
     * @param args the command line arguments
     */

     public void render() {
glClear(GL_COLOR_BUFFER_BIT);
glLoadIdentity();
glColor3f(0.0f, 1.0f, 0.0f);
glPointSize(10);
glBegin(GL_POINTS);
glVertex2f(100, 100);
glVertex2f(200, 100);
glVertex2f(200, 300);
glVertex2f(100, 300);
glVertex2f(150, 375);
glVertex2f(375, 375);
glVertex2f(425, 300);
glVertex2f(425, 100);
glEnd();
}
    public static void main(String[] args) {
        // TODO code application logic here
        Create_Point main = null;
try {
System.out.println("Keys:");
System.out.println("esc - Exit");
main = new Create_Point();
main.create();
main.run();
} catch (Exception ex) {
LOGGER.log(Level.SEVERE, ex.toString(), ex);
} finally {
if (main != null) {
main.destroy();
}
}
    }
    private void create() throws LWJGLException {
Display.setDisplayMode(new DisplayMode(DISPLAY_WIDTH,
DISPLAY_HEIGHT));
Display.setFullscreen(false);
Display.setTitle("Create Point");
Display.create();
//Keyboard
Keyboard.create();
//Mouse
Mouse.setGrabbed(false);
Mouse.create();
//OpenGL
initGL();
resizeGL(); //To change body of generated methods, choose
Tools | Templates.
}
private void run() {
while (!Display.isCloseRequested() &&
!Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)) {
if (Display.isVisible()) {
render();
} else {
if (Display.isDirty()) {
render();
}
try {
Thread.sleep(100);
} catch (InterruptedException ex) {
}
}
Display.update();
Display.sync(60);
}
}
private void destroy() {
Mouse.destroy();
Keyboard.destroy();
Display.destroy();
}
private void initGL() {
//2D Initialization
glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
glDisable(GL_DEPTH_TEST);
glDisable(GL_LIGHTING);
}
private void resizeGL() {
//2D Scene
glViewport(0, 0, DISPLAY_WIDTH, DISPLAY_HEIGHT);
glMatrixMode(GL_PROJECTION);
glLoadIdentity();
gluOrtho2D(0.0f, DISPLAY_WIDTH, 0.0f, DISPLAY_HEIGHT);
glPushMatrix();
glMatrixMode(GL_MODELVIEW);
glLoadIdentity();
glPushMatrix();
}
}
    
}
