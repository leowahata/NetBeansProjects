/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bendera;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author L
 */
public class gambarBendera extends Canvas
{
public void paint(Graphics graph)
{
graph.setColor(Color.RED);
graph.fill3DRect(60, 50, 150, 50, true); //x/y/width/height/raised
graph.setColor(Color.WHITE);
graph.fill3DRect(60, 100, 150, 50,true); //x/y/width/height/raised
graph.setColor(Color.GREEN);
graph.fillOval(52, 46, 8, 8); // /x/y/width/height
graph.fill3DRect(52,50, 8, 180, true); // x/y/width/height/raised
graph.setColor(Color.YELLOW);
graph.fill3DRect(47, 230, 20, 20, true); //x/y/width/height/raised {
graph.setFont(new Font("Calibri",Font.BOLD,15)); // JenisFont/Tebal/Ukuran Font
graph.setColor(Color.BLACK);
graph.drawString("Indonesia Raya", 220, 200); // Text/x/y
graph.setColor(Color.GRAY);
graph.draw3DRect(208, 202, 150, 2,true); //x/y/width/height/raised
graph.setFont(new Font("Comic Sans MS",Font.BOLD,12)); //JenisFont/Tebal/Ukuran
graph.setColor(Color.BLUE);
graph.drawString("Design by : Leo Wahata", 275,260);//Text/x/y
} //Akhir Method
}
