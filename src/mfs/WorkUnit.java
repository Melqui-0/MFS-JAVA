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
public class WorkUnit extends javax.swing.JFrame {

    public static String work = "3BDTB6H1";

    
    public WorkUnit() {
        initComponents();
    }

            public int orden ;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Work = new javax.swing.JTextField();
        Enter = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Work Unit Control Number");

        Work.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Work.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkActionPerformed(evt);
            }
        });
        Work.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                WorkKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                WorkKeyTyped(evt);
            }
        });

        Enter.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Enter.setText("Enter");
        Enter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        Cancelar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Cancelar.setText("Cancel");
        Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(Work, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(Work, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enter)
                    .addComponent(Cancelar))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        String scan = Work.getText();
        if (scan.toUpperCase().equals(work) && orden == 0){
            Work.setText("");
            this.setVisible(false);
            all.dificultad.setVisible(true);
        } else if (scan.toUpperCase().equals(work) && orden == 1){//Creo que era para ver la orden en View
            all.view.setVisible(true);
        } else if (scan.toUpperCase().equals(work) && orden == 2){//Creo que era para ver la orden en View
            all.view.setVisible(true); //2
        }
    }//GEN-LAST:event_EnterActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_CancelarActionPerformed

    private void WorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkActionPerformed

    }//GEN-LAST:event_WorkActionPerformed

    private void WorkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WorkKeyPressed
        char enter = evt.getKeyChar();
        if (enter == KeyEvent.VK_ENTER){
            EnterActionPerformed(null);
        }
    }//GEN-LAST:event_WorkKeyPressed

    private void WorkKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WorkKeyTyped
        char enter = evt.getKeyChar();
        if (enter == KeyEvent.VK_ENTER){
            EnterActionPerformed(null);
        } else if (enter == KeyEvent.VK_ESCAPE){
            CancelarActionPerformed(null);
        }
    }//GEN-LAST:event_WorkKeyTyped

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
            java.util.logging.Logger.getLogger(WorkUnit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkUnit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkUnit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkUnit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkUnit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Cancelar;
    public javax.swing.JButton Enter;
    public javax.swing.JTextField Work;
    // End of variables declaration//GEN-END:variables
}
