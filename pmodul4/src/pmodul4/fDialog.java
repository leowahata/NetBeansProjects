/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmodul4;

import javax.swing.JOptionPane;

/**
 * Nama: Leo Wahata.
 * Kelas: XII RPL.
 * NO Absen: 21.
 * @author L
 */
public class fDialog extends javax.swing.JFrame {

    /**
     * Creates new form fDialog
     */
    public fDialog() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnOK = new javax.swing.JButton();
        btnError = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnYNC = new javax.swing.JButton();
        btnYN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnPilihList = new javax.swing.JButton();
        btnCustom = new javax.swing.JButton();
        btnPilihIsi = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOK.setText("OK Dialog");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnError.setText("Error Dialog");
        btnError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnErrorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnError)
                    .addComponent(btnOK))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnOK)
                .addGap(18, 18, 18)
                .addComponent(btnError)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Simple Dialog", jPanel1);

        btnYNC.setText("Yes/ No/ Cancle Konfirmasi");
        btnYNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYNCActionPerformed(evt);
            }
        });

        btnYN.setText("Yes/ No Konfirmasi");
        btnYN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnYNC)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(105, Short.MAX_VALUE)
                    .addComponent(btnYN)
                    .addGap(103, 103, 103)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(btnYNC)
                .addGap(64, 64, 64))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(btnYN)
                    .addContainerGap(118, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Konfirmasi Dialog", jPanel2);

        btnPilihList.setText("Pilihan List");
        btnPilihList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihListActionPerformed(evt);
            }
        });

        btnCustom.setText("Custom Yes/ No/Cancle");
        btnCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomActionPerformed(evt);
            }
        });

        btnPilihIsi.setText("Pilihan Isian");
        btnPilihIsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihIsiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPilihIsi)
                            .addComponent(btnPilihList)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnCustom)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnCustom)
                .addGap(18, 18, 18)
                .addComponent(btnPilihList)
                .addGap(18, 18, 18)
                .addComponent(btnPilihIsi)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Option Dialog", jPanel3);

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnKeluar)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKeluar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Mudahnya Belajar Java");
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnErrorActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,
            "Belajar Java Harus Seriuss!!",
            "Peringatan",
        JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnErrorActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnYNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYNActionPerformed
        // TODO add your handling code here:
        int jwb = JOptionPane.showConfirmDialog(this,
        "Belajar Java itu Mudah\nSetujukah Anda ?",
        "Konfirmasi",
        JOptionPane.YES_NO_OPTION);
        if (jwb == 0)
        JOptionPane.showMessageDialog(this,
        "Anda Memilih Yes");
        else
        JOptionPane.showMessageDialog(this,
        "NO adalah Pilihan Anda");
    }//GEN-LAST:event_btnYNActionPerformed

    private void btnYNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYNCActionPerformed
        // TODO add your handling code here:
        int jwb = JOptionPane.showConfirmDialog(this,
        "Akan Menghapus Data"+"\nAnda Yakin ?",
        "Konfirmasi",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE);
        switch (jwb){
            case 0: JOptionPane.showMessageDialog(this,"Jawab Yes");
                break;
            case 1: JOptionPane.showMessageDialog(this,"Jawab NO");
                break;
            case 2: JOptionPane.showMessageDialog(this,"Jawab Cancel");
                break;
            default :
        JOptionPane.showMessageDialog(this,"Koq Gak Jawab?");
}
    }//GEN-LAST:event_btnYNCActionPerformed

    private void btnCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomActionPerformed
        // TODO add your handling code here:
        Object[] options = {"Ya, Siip","Tidak, Trims","Krim Saja!"};
        int jwb = JOptionPane.showOptionDialog(this,
            "Anda mau minum Kopi dengan Gula ?",
            "Pertanyaan",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[2]);
        String respon;
        switch (jwb){
            case 0 : respon = "Ini Kopi plus Gulanya";break;
            case 1 : respon = "OK, Kopi Saja ya";break;
            case 2 : respon = "Kopi dan Krim Siap";break;
            default : respon = "Koq gak Jawab Siy?";
        }
        JOptionPane.showMessageDialog(this,respon);

    }//GEN-LAST:event_btnCustomActionPerformed

    private void btnPilihListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihListActionPerformed
        // TODO add your handling code here:
        Object[] jawaban = {"Perut", "Kaki", "Hidung"};
        String s = (String)JOptionPane.showInputDialog(this,
        "Lengkapi Kalimat Berikut:\n"+
        "\"Kepala,Pundak,Lutut, ...\"",
        "Custom Dialog",
        JOptionPane.PLAIN_MESSAGE,
            null,
        jawaban,
        "Perut");
        //kalau s ada isinya,maka...
        if ((s != null) && (s.length() > 0)) {
        JOptionPane.showMessageDialog(this,
        "Kepala,Pundak,Lutut, " + s + "!");
}
    }//GEN-LAST:event_btnPilihListActionPerformed

    private void btnPilihIsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihIsiActionPerformed
        // TODO add your handling code here:
        String s = (String)JOptionPane.showInputDialog(this,
            "Lengkapi Kalimat Berikut:\n"+
            "\"Kepala,Pundak,Lutut, ...\"",
            "Custom Dialog",
            JOptionPane.PLAIN_MESSAGE,
            null,
            null,
            "");
    //kalau s ada isinya,maka...
        if ((s != null) && (s.length() > 0)) {
            JOptionPane.showMessageDialog(this,
                "Kepala,Pundak,Lutut, " + s + "!");
            }        
    }//GEN-LAST:event_btnPilihIsiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustom;
    private javax.swing.JButton btnError;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnPilihIsi;
    private javax.swing.JButton btnPilihList;
    private javax.swing.JButton btnYN;
    private javax.swing.JButton btnYNC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}