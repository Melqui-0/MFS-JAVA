/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mfs;

import java.awt.event.KeyEvent;

/**
 *
 * @author 102976781
 */
public class Opcioneseasy extends javax.swing.JFrame {

    
    public Dificult dificultad = new Dificult();
    
    public Opcioneseasy() {
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

        jLabel1 = new javax.swing.JLabel();
        PDU231 = new javax.swing.JButton();
        PDU485 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel1.setText("Selecciona los PDU's");

        PDU231.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        PDU231.setText("03FP231");
        PDU231.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PDU231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDU231ActionPerformed(evt);
            }
        });
        PDU231.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PDU231KeyTyped(evt);
            }
        });

        PDU485.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        PDU485.setText("03JG485");
        PDU485.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PDU485.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDU485ActionPerformed(evt);
            }
        });
        PDU485.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PDU485KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(PDU231)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PDU485)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PDU231)
                    .addComponent(PDU485))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PDU231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDU231ActionPerformed
        all.empty_231.setVisible(true);
        this.setVisible(false);
        all.abrir.setVisible(false);
        all.empty.NPS.requestFocus();
        all.crono.mTimer.start();
    }//GEN-LAST:event_PDU231ActionPerformed

    private void PDU485ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDU485ActionPerformed
        all.empty.setVisible(true);
        this.setVisible(false);
        all.abrir.setVisible(false);
        all.empty.NPS.requestFocus();
        all.crono.mTimer.start();
    }//GEN-LAST:event_PDU485ActionPerformed

    private void PDU231KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PDU231KeyTyped
        char enter = evt.getKeyChar();
        if (enter == KeyEvent.VK_ESCAPE){
            this.setVisible(false);
        }
    }//GEN-LAST:event_PDU231KeyTyped

    private void PDU485KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PDU485KeyTyped
        char enter = evt.getKeyChar();
        if (enter == KeyEvent.VK_ESCAPE){
            this.setVisible(false);
        }
    }//GEN-LAST:event_PDU485KeyTyped

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
            java.util.logging.Logger.getLogger(Opcioneseasy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opcioneseasy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opcioneseasy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opcioneseasy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opcioneseasy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton PDU231;
    public javax.swing.JButton PDU485;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}