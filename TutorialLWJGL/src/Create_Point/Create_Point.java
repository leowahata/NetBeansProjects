/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Create_Point;

import java.util.logging.Level;
import java.util.logging.Logger;
import static komgraf01.KomGraf01.DISPLAY_HEIGHT;
import static komgraf01.KomGraf01.DISPLAY_WIDTH;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.util.glu.GLU.gluOrtho2D;
/**
 *
 * @author L
 */
public class Create_Point {
    public void render(){
        glClear(GL_COLOR_BUFFER_BIT);
        glLoadIndentity();
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
        Create_Point main = null;
        try{
            System.out.println("keys:");
            System.out.println("esc -exit");
            main = new Create_Point();
            main.create();
            main.run();
        } catch (Exception ex){
            LOGGER.log(Level.SEVERE, ex.toString(), ex);
        } finally{
            if(main != null){
                main.destroy();
            }
        }
    }
    private void cretae() throws LWGJLEception {
        Display.setDisplayMode(new DisplayMode(DISPLAY_WIDTH, DISPLAY_HEIGHT));
        Display.setFullscreen(false);
        Display.setTitle("Create Point");
        Display.create();
        //keyboard
        Keyboard.create();
        //Mouse
        Mouse.setGrabbed(false);
        Mouse.create();
        //OpenGL
        initGL();
        resizeGL(); //To change body of generated methods, chose tools | Templates.
    }
    private void run() {
        while (!Display.isCloseRequested()!keyboard.isKeyDown(keyboard.KEY_ESCAPE){
        if (Display.isVisible()){
            render();
        }else{
            if(Display.isDirty()){
                render();
            }
            try {
                Thread.sleep(100);
            } catch (InteruptedException ex) {
        }
    } 
        Display.update();
        Display.sync(60);
    }
}
    private void destroy(){
        Mouse.destroy();
        Keyboard.destroy();
        Display.destroy();
    }
    private void initGL() {
        //2DInitialization
        glClearCOlor(0.0f, 0.0f, 0.0f, 0.0f);
        glDisable(GL_DEPTH_TEST);
        glDisable(GL_LIGHTING);
    }
    private void resizeGL() {
        //2D Scane
        glViewport(0, 0, DISPLAY_WIDTH, DISPLAY_HEIGHT);
        
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        gluOrtho2D(0.0f, DISPLAY_WIDTH, 0.0f, DIPSLAY_HEIGHT);
        glPushMatrix();
        glMatrixMode(GL_MODELVIEW);
        glLoadIdentity();
        glPushMatrix();
    }
}
