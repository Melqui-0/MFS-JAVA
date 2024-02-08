/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mfs;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import static mfs.Empty.pn;
import static mfs.Empty.nm;
/**
 *
 * @author 102976781
 */
public class Barcode_8 extends javax.swing.JFrame {

    /**
     *
     */
    
    String npescaneado, npingresado;
    

    
    public Barcode_8() {
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
        sequence = new javax.swing.JLabel();
        secfinal = new javax.swing.JLabel();

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

        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton4.setText("F6 = Country");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Scan in Barcode...");

        npfinal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        sequence.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        sequence.setText("Sequence Number");

        secfinal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(partnumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(npfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sequence)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(secfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(npscan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Logpart)
                    .addComponent(Cancel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(partnumber)
                    .addComponent(npfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(secfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sequence))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    npscan.setText("");
                    secfinal.setText(npescaneado.substring(10).toUpperCase());
                } else{
                    JOptionPane.showMessageDialog(null, "INVALID BARCODE - no matching rule");   
                    npscan.setText("");
                }
            } else{
                JOptionPane.showMessageDialog(null, "INVALID BARCODE - no matching rule");   
                npscan.setText("");
            }
        } else if (enter == KeyEvent.VK_ESCAPE){
            CancelActionPerformed(null);
        }
    }//GEN-LAST:event_npscanKeyTyped

    private void LogpartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogpartActionPerformed
    if (pn.equals("03JG485")){
        switch (nm) {
            case 10:
                if (this.npingresado.toUpperCase().equals(all.empty.npaescanear10.getText()) || this.npingresado.toUpperCase().equals("03JG489")){
                    all.empty.npaescanear10.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp10.setText("I");
                    all.empty.npecaneado10.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal10.setText(all.empty.cantidadrequerida10.getText());
                    all.empty.serial10.setText(npescaneado.substring(10).toUpperCase());
                    all.empty.NPS10.setBackground(Color.BLUE);
                    all.empty.npaescanear10.setForeground(Color.WHITE);
                    all.empty.QT10.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida10.setForeground(Color.WHITE);
                    all.empty.FQT10.setForeground(Color.WHITE);
                    all.empty.cantidadfinal10.setForeground(Color.WHITE);
                    all.empty.DISP10.setForeground(Color.WHITE);
                    all.empty.idsp10.setForeground(Color.WHITE);
                    all.empty.descripcion10.setForeground(Color.WHITE);
                    all.empty.npecaneado10.setForeground(Color.WHITE);
                    all.empty.serial10.setForeground(Color.WHITE);
                    npfinal.setText("");
                    secfinal.setText("");
                    npscan.requestFocus();
                    this.setVisible(false);
                } else if (this.npingresado.toUpperCase().equals(all.empty.npaescanear10.getText().substring(3))){
                    all.empty.npaescanear10.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp10.setText("I");
                    all.empty.npecaneado10.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal10.setText(all.empty.cantidadrequerida10.getText());
                    all.empty.serial10.setText(npescaneado.substring(10).toUpperCase());
                    all.empty.NPS10.setBackground(Color.BLUE);
                    all.empty.npaescanear10.setForeground(Color.WHITE);
                    all.empty.QT10.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida10.setForeground(Color.WHITE);
                    all.empty.FQT10.setForeground(Color.WHITE);
                    all.empty.cantidadfinal10.setForeground(Color.WHITE);
                    all.empty.DISP10.setForeground(Color.WHITE);
                    all.empty.idsp10.setForeground(Color.WHITE);
                    all.empty.descripcion10.setForeground(Color.WHITE);
                    all.empty.npecaneado10.setForeground(Color.WHITE);
                    all.empty.serial10.setForeground(Color.WHITE);
                    npfinal.setText("");
                    secfinal.setText("");
                    npscan.requestFocus();
                    this.setVisible(false);
                }
                break;
            case 15:
                if (this.npingresado.toUpperCase().equals(all.empty.npaescanear15.getText()) || this.npingresado.toUpperCase().equals("03JG489")){
                    all.empty.npaescanear10.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp15.setText("I");
                    all.empty.npecaneado15.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal15.setText(all.empty.cantidadrequerida15.getText());
                    all.empty.serial15.setText(npescaneado.substring(10).toUpperCase());
                    all.empty.NPS15.setBackground(Color.BLUE);
                    all.empty.npaescanear15.setForeground(Color.WHITE);
                    all.empty.QT15.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida15.setForeground(Color.WHITE);
                    all.empty.FQT15.setForeground(Color.WHITE);
                    all.empty.cantidadfinal15.setForeground(Color.WHITE);
                    all.empty.DISP15.setForeground(Color.WHITE);
                    all.empty.idsp15.setForeground(Color.WHITE);
                    all.empty.descripcion15.setForeground(Color.WHITE);
                    all.empty.npecaneado15.setForeground(Color.WHITE);
                    all.empty.serial15.setForeground(Color.WHITE);
                    npfinal.setText("");
                    secfinal.setText("");
                    npscan.requestFocus();
                    this.setVisible(false);
                } else if (this.npingresado.toUpperCase().equals(all.empty.npaescanear15.getText().substring(3))){
                    all.empty.npaescanear10.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp15.setText("I");
                    all.empty.npecaneado15.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal15.setText(all.empty.cantidadrequerida15.getText());
                    all.empty.serial15.setText(npescaneado.substring(10).toUpperCase());
                    all.empty.NPS15.setBackground(Color.BLUE);
                    all.empty.npaescanear15.setForeground(Color.WHITE);
                    all.empty.QT15.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida15.setForeground(Color.WHITE);
                    all.empty.FQT15.setForeground(Color.WHITE);
                    all.empty.cantidadfinal15.setForeground(Color.WHITE);
                    all.empty.DISP15.setForeground(Color.WHITE);
                    all.empty.idsp15.setForeground(Color.WHITE);
                    all.empty.descripcion15.setForeground(Color.WHITE);
                    all.empty.npecaneado15.setForeground(Color.WHITE);
                    all.empty.serial15.setForeground(Color.WHITE);
                    npfinal.setText("");
                    secfinal.setText("");
                    npscan.requestFocus();
                    this.setVisible(false);
                }
                break;
            case 18:
                if (this.npingresado.toUpperCase().equals(all.empty.npaescanear18.getText()) || this.npingresado.toUpperCase().equals("03JG489")){
                    all.empty.npaescanear18.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp18.setText("I");
                    all.empty.npecaneado18.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal18.setText(all.empty.cantidadrequerida18.getText());
                    all.empty.serial18.setText(npescaneado.substring(10).toUpperCase());
                    all.empty.NPS18.setBackground(Color.BLUE);
                    all.empty.npaescanear18.setForeground(Color.WHITE);
                    all.empty.QT18.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida18.setForeground(Color.WHITE);
                    all.empty.FQT18.setForeground(Color.WHITE);
                    all.empty.cantidadfinal18.setForeground(Color.WHITE);
                    all.empty.DISP18.setForeground(Color.WHITE);
                    all.empty.idsp18.setForeground(Color.WHITE);
                    all.empty.descripcion18.setForeground(Color.WHITE);
                    all.empty.npecaneado18.setForeground(Color.WHITE);
                    all.empty.serial18.setForeground(Color.WHITE);
                    npfinal.setText("");
                    secfinal.setText("");
                    npscan.requestFocus();
                    this.setVisible(false);
                } else if (this.npingresado.toUpperCase().equals(all.empty.npaescanear18.getText().substring(3))){
                    all.empty.npaescanear18.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp18.setText("I");
                    all.empty.npecaneado18.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal18.setText(all.empty.cantidadrequerida18.getText());
                    all.empty.serial18.setText(npescaneado.substring(10).toUpperCase());
                    all.empty.NPS18.setBackground(Color.BLUE);
                    all.empty.npaescanear18.setForeground(Color.WHITE);
                    all.empty.QT18.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida18.setForeground(Color.WHITE);
                    all.empty.FQT18.setForeground(Color.WHITE);
                    all.empty.cantidadfinal18.setForeground(Color.WHITE);
                    all.empty.DISP18.setForeground(Color.WHITE);
                    all.empty.idsp18.setForeground(Color.WHITE);
                    all.empty.descripcion18.setForeground(Color.WHITE);
                    all.empty.npecaneado18.setForeground(Color.WHITE);
                    all.empty.serial18.setForeground(Color.WHITE);
                    npfinal.setText("");
                    secfinal.setText("");
                    npscan.requestFocus();
                    this.setVisible(false);
                } 
                break;
            case 21:
                if (this.npingresado.toUpperCase().equals(all.empty.npaescanear21.getText()) || this.npingresado.toUpperCase().equals("03JG489")){
                    all.empty.npaescanear21.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp21.setText("I");
                    all.empty.npecaneado21.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal21.setText(all.empty.cantidadrequerida21.getText());
                    all.empty.serial21.setText(npescaneado.substring(10).toUpperCase());
                    all.empty.NPS21.setBackground(Color.BLUE);
                    all.empty.npaescanear21.setForeground(Color.WHITE);
                    all.empty.QT21.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida21.setForeground(Color.WHITE);
                    all.empty.FQT21.setForeground(Color.WHITE);
                    all.empty.cantidadfinal21.setForeground(Color.WHITE);
                    all.empty.DISP21.setForeground(Color.WHITE);
                    all.empty.idsp21.setForeground(Color.WHITE);
                    all.empty.descripcion21.setForeground(Color.WHITE);
                    all.empty.npecaneado21.setForeground(Color.WHITE);
                    all.empty.serial21.setForeground(Color.WHITE);
                    npfinal.setText("");
                    secfinal.setText("");
                    npscan.requestFocus();
                    this.setVisible(false);
                } else if (this.npingresado.toUpperCase().equals(all.empty.npaescanear21.getText().substring(3))){
                    all.empty.npaescanear21.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp21.setText("I");
                    all.empty.npecaneado21.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal21.setText(all.empty.cantidadrequerida21.getText());
                    all.empty.serial21.setText(npescaneado.substring(10).toUpperCase());
                    all.empty.NPS21.setBackground(Color.BLUE);
                    all.empty.npaescanear21.setForeground(Color.WHITE);
                    all.empty.QT21.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida21.setForeground(Color.WHITE);
                    all.empty.FQT21.setForeground(Color.WHITE);
                    all.empty.cantidadfinal21.setForeground(Color.WHITE);
                    all.empty.DISP21.setForeground(Color.WHITE);
                    all.empty.idsp21.setForeground(Color.WHITE);
                    all.empty.descripcion21.setForeground(Color.WHITE);
                    all.empty.npecaneado21.setForeground(Color.WHITE);
                    all.empty.serial21.setForeground(Color.WHITE);
                    npfinal.setText("");
                    secfinal.setText("");
                    npscan.requestFocus();
                    this.setVisible(false);
                }       break;
            default:
                JOptionPane.showMessageDialog(null, "FC15 ");
                break;
        }
    } // Queda pendiente colocar las opciones para el sutituto (03JG489)
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
            java.util.logging.Logger.getLogger(Barcode_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barcode_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barcode_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barcode_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Barcode_8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Logpart;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel npfinal;
    public javax.swing.JTextField npscan;
    public javax.swing.JLabel partnumber;
    public javax.swing.JLabel secfinal;
    public javax.swing.JLabel sequence;
    // End of variables declaration//GEN-END:variables
}
