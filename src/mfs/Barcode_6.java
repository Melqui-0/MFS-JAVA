/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mfs;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import static mfs.Barcode_3.jkl;
import static mfs.Barcode_3.qwe;
import static mfs.Empty.nps;
import static mfs.Empty.pn;

/**
 *
 * @author 102976781
 */
public class Barcode_6 extends javax.swing.JFrame {

    /**
     *
     */
    public String npescaneado, npingresado, msingresado, ecescaneado;   
    final String FP534 [] = {
        "10000P45202"
        };

    
    public Barcode_6() {
        //this.npescaneado = npscan.getText();
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

        npscan = new javax.swing.JTextField();
        partnumber = new javax.swing.JLabel();
        Logpart = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        npfinal = new javax.swing.JLabel();
        ecfinal = new javax.swing.JLabel();
        ecnumber = new javax.swing.JLabel();
        machinefinal = new javax.swing.JLabel();
        machine = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        npscan.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        npscan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npscanActionPerformed(evt);
            }
        });
        npscan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                npscanKeyTyped(evt);
            }
        });

        partnumber.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        partnumber.setText("Part Number:");

        Logpart.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Logpart.setText("F2 = Log Part");
        Logpart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logpart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogpartActionPerformed(evt);
            }
        });

        Cancel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Cancel.setText("Esc = Cancel");
        Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton3.setText("F4 = Sustitute");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setEnabled(false);

        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton4.setText("F6 = Country");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Scan in Barcode...");

        npfinal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        ecfinal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        ecnumber.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ecnumber.setText("Ec Number:");

        machinefinal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        machine.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        machine.setText("Machine Serial:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(npscan, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Logpart)
                            .addComponent(jButton3))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(partnumber)
                            .addComponent(ecnumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(npfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ecfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(machinefinal, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(machine)
                        .addGap(222, 222, 222)))
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(npscan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(partnumber)
                            .addComponent(npfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ecnumber)
                            .addComponent(ecfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Logpart)
                            .addComponent(Cancel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(machine)
                            .addComponent(machinefinal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void npscanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npscanActionPerformed
 
    }//GEN-LAST:event_npscanActionPerformed

    private void npscanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_npscanKeyTyped
        char enter = evt.getKeyChar();
        if (enter == KeyEvent.VK_ENTER){
            this.npescaneado = npscan.getText();
            if (npescaneado.startsWith("p") | npescaneado.startsWith("P")){
                if (npescaneado.length() == 8){    
                npfinal.setText("00000" + npescaneado.substring(1).toUpperCase());
                npingresado = npescaneado.substring(1);
                npscan.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "INVALID BARCODE - no matching rule");   
                    npscan.setText("");
                }
            } else if (npescaneado.startsWith("11s") | npescaneado.startsWith("11S")){
                if (npescaneado.length() == 22){   
                    npfinal.setText("00000" + npescaneado.substring(3, 10).toUpperCase());
                    npingresado = npescaneado.substring(3, 10);
                    if (npescaneado.substring(3, 10).equals("01KL468")){
                    ecfinal.setText("10000P45486");
                    }
                    npscan.setText("");
                } else{
                    JOptionPane.showMessageDialog(null, "INVALID BARCODE - no matching rule");   
                    npscan.setText("");
                }
            } else if (npescaneado.startsWith("ec") | npescaneado.startsWith("EC") | npescaneado.startsWith("2P") | npescaneado.startsWith("2p")){
                if (npescaneado.length() == 8){    
                    int i = 0;
                    ecfinal.setText("10000" + npescaneado.substring(2).toUpperCase());
                    ecescaneado = npescaneado.substring(1);
                    jkl = ecfinal.getText();
                    qwe[i]=jkl;
                    npscan.setText("");
                } else{
                    JOptionPane.showMessageDialog(null, "INVALID BARCODE - no matching rule");   
                    npscan.setText("");
                }
            } else if (npescaneado.startsWith("1s") | npescaneado.startsWith("1S")){
                if (npescaneado.length() == 16){   
                    machinefinal.setText("00" + npescaneado.substring(11).toUpperCase());
                    msingresado = npescaneado.substring(11).toUpperCase();
                    npscan.setText("");
                } else{
                    JOptionPane.showMessageDialog(null, "INVALID BARCODE - no matching rule");   
                    npscan.setText("");
                }
        }
        } else if (enter == KeyEvent.VK_ESCAPE){
            CancelActionPerformed(null);
        }
    }//GEN-LAST:event_npscanKeyTyped

    private void LogpartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogpartActionPerformed
        Map<String, String[]> agency = new HashMap <>();
        agency.put("03FP534", FP534);
        nps = agency.get(pn);
        if (nps == FP534){
        if (this.npingresado.toUpperCase().equals(all.empty.npaescanear4.getText())){
            if (Arrays.equals(qwe, FP534)){
                all.empty.npaescanear4.setText("000" + npingresado.toUpperCase());
                all.empty.idsp4.setText("I");
                all.empty.npecaneado4.setText("000" + npingresado.toUpperCase());
                all.empty.cantidadfinal4.setText(all.empty.cantidadrequerida4.getText());
                all.empty.serial4.setText(msingresado);
                all.empty.NPS4.setBackground(Color.BLUE);
                all.empty.npaescanear4.setForeground(Color.WHITE);
                all.empty.QT4.setForeground(Color.WHITE);
                all.empty.cantidadrequerida4.setForeground(Color.WHITE);
                all.empty.FQT4.setForeground(Color.WHITE);
                all.empty.cantidadfinal4.setForeground(Color.WHITE);
                all.empty.DISP4.setForeground(Color.WHITE);
                all.empty.idsp4.setForeground(Color.WHITE);
                all.empty.descripcion4.setForeground(Color.WHITE);
                all.empty.npecaneado4.setForeground(Color.WHITE);
                all.empty.serial4.setForeground(Color.WHITE);
                npfinal.setText("");
                ecfinal.setText("");
                machinefinal.setText("");
                npscan.requestFocus();
                this.setVisible(false);
            }
        }   else if (this.npingresado.toUpperCase().equals(all.empty.npaescanear4.getText().substring(3))){
            if (Arrays.equals(qwe, FP534)){
                all.empty.npaescanear4.setText("000" + npingresado.toUpperCase());
                all.empty.idsp4.setText("I");
                all.empty.npecaneado4.setText("000" + npingresado.toUpperCase());
                all.empty.cantidadfinal4.setText(all.empty.cantidadrequerida4.getText());
                all.empty.serial4.setText(msingresado);
                all.empty.NPS4.setBackground(Color.BLUE);
                all.empty.npaescanear4.setForeground(Color.WHITE);
                all.empty.QT4.setForeground(Color.WHITE);
                all.empty.cantidadrequerida4.setForeground(Color.WHITE);
                all.empty.FQT4.setForeground(Color.WHITE);
                all.empty.cantidadfinal4.setForeground(Color.WHITE);
                all.empty.DISP4.setForeground(Color.WHITE);
                all.empty.idsp4.setForeground(Color.WHITE);
                all.empty.descripcion4.setForeground(Color.WHITE);
                all.empty.npecaneado4.setForeground(Color.WHITE);
                all.empty.serial4.setForeground(Color.WHITE);
                npfinal.setText("");
                ecfinal.setText("");
                machinefinal.setText("");
                npscan.requestFocus();
            this.setVisible(false);
            }
        } else {   
            JOptionPane.showMessageDialog(null, "FC15 ");
        }
        }
    }//GEN-LAST:event_LogpartActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_CancelActionPerformed

    /**
     * @param args the command line arguments
     *         boolean min=entradaTeclado.substring(0).startsWith("a");
        boolean may=entradaTeclado.substring(0).startsWith("A");
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
            java.util.logging.Logger.getLogger(Barcode_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barcode_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barcode_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barcode_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barcode_6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Logpart;
    public javax.swing.JLabel ecfinal;
    public javax.swing.JLabel ecnumber;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel machine;
    public javax.swing.JLabel machinefinal;
    public javax.swing.JLabel npfinal;
    public javax.swing.JTextField npscan;
    public javax.swing.JLabel partnumber;
    // End of variables declaration//GEN-END:variables
}
