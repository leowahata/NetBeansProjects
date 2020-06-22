/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bendera;
import javax.swing.*;
import java.awt.*;
import javax.swing.UIManager.*;
/**
 *
 * @author L
 */
public class frameBendera extends JFrame
{
Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();
private Container konten = getContentPane();
private gambarBendera bendera = new gambarBendera();
//Membuat Konstruktor
public frameBendera()
{
super("Gambar Bendera");
setVisible(true);
setSize(500,300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setResizable(false);
setLocation(dimensi.width/2 - getWidth()/2,dimensi.height/2 - getHeight()/2); //Mengatur Frame tampil di tengah layar monitor
konten.add(bendera); //Memasukkan object bendera ke dalam Container
}//Akhir Konstruktor
public static void main(String[] ar)
{
//Membuat Look and Feel Java Nimbus
try{
UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
} catch (UnsupportedLookAndFeelException e)
{
}
catch (ClassNotFoundException e)
{
}
catch (InstantiationException e)
{
}
catch (IllegalAccessException e)
{
}
new frameBendera();
}
}
