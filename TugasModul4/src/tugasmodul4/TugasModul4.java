/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul4;

import javax.swing.JOptionPane;

/**
 * Nama: Leo Wahata.
 * Kelas: XII RPL.
 * NO Absen: 21.
 * @author L
 */
public class TugasModul4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input_1;
        String input_2;
        
        int nilai_1;
        int nilai_2;
        int jumlah;
        
        input_1 = JOptionPane.showInputDialog("Masukkan angka pertama");
        input_2 = JOptionPane.showInputDialog("Masukkan angka kedua");
        
        nilai_1 = Integer.parseInt(input_1);
        nilai_2 = Integer.parseInt(input_2);
        
        jumlah = nilai_1 + nilai_2;
        JOptionPane.showMessageDialog(null, +nilai_1+ "Ditambah" +nilai_2+ " = " +jumlah);
    }
    
}
