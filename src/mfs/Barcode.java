/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mfs;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author 102976781
 */
public class Barcode extends javax.swing.JFrame {

    /**
     *
     */
    public String npescaneado;

    
    public Barcode() {
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        npfinal = new javax.swing.JLabel();
        ecfinal = new javax.swing.JLabel();
        sequence = new javax.swing.JLabel();
        secfinal = new javax.swing.JLabel();
        ecnumber = new javax.swing.JLabel();
        machinefinal = new javax.swing.JLabel();
        machine = new javax.swing.JLabel();
        countryfinal = new javax.swing.JLabel();
        country = new javax.swing.JLabel();

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
        Logpart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogpartActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton2.setText("Esc = Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton3.setText("F4 = Sustitute");

        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton4.setText("F6 = Country");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Scan in Barcode...");

        npfinal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        ecfinal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        sequence.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        sequence.setText("Sequence Number");

        secfinal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        ecnumber.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ecnumber.setText("Ec Number:");

        machinefinal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        machine.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        machine.setText("Machine Serial:");

        countryfinal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        country.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        country.setText("Country:");

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
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(partnumber)
                            .addComponent(ecnumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(npfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ecfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(machine, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sequence, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(machinefinal, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(country)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(countryfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(secfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sequence))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(machine)
                            .addComponent(machinefinal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(country)
                            .addComponent(countryfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                npscan.setText("");
            }else{
            JOptionPane.showMessageDialog(null, "INVALID BARCODE - no matching rule");   
            npscan.setText("");
            }
            } else if (npescaneado.startsWith("11s") | npescaneado.startsWith("11S")){
                if (npescaneado.length() == 22){    
                npfinal.setText("00000" + npescaneado.substring(3, 10).toUpperCase());
                ecfinal.setText("10000P45486");
                secfinal.setText(npescaneado.substring(10));
                npscan.setText("");
            }
                    }
            else{
            JOptionPane.showMessageDialog(null, "INVALID BARCODE - no matching rule");   
            npscan.setText("");
            }
        }
    }//GEN-LAST:event_npscanKeyTyped

    private void LogpartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogpartActionPerformed
        if (this.npescaneado.substring(1).toUpperCase().equals(all.empty.npaescanear)){
            all.empty.npaescanear.setText("000" + npescaneado.substring(1).toUpperCase());
            all.empty.idsp.setText("I");
            all.empty.npecaneado.setText("000" + npescaneado.substring(1).toUpperCase());
            all.empty.cantidadfinal.setText(all.empty.cantidadrequerida.getText());
            all.empty.NPS.setBackground(Color.CYAN);
            all.empty.npaescanear.setForeground(Color.WHITE);
            all.empty.QT.setForeground(Color.WHITE);
            all.empty.cantidadrequerida.setForeground(Color.WHITE);
            all.empty.FQT.setForeground(Color.WHITE);
            all.empty.cantidadfinal.setForeground(Color.WHITE);
            all.empty.DISP.setForeground(Color.WHITE);
            all.empty.idsp.setForeground(Color.WHITE);
            all.empty.descripcion.setForeground(Color.WHITE);
            all.empty.npecaneado.setForeground(Color.WHITE);
            all.empty.serial.setForeground(Color.WHITE);
            this.setVisible(false);
        }   else if (this.npescaneado.substring(3, 10).toUpperCase().equals(all.empty.npaescanear.getText())){
            all.empty.npaescanear.setText("000" + npescaneado.substring(3, 10).toUpperCase());
            all.empty.idsp.setText("I");
            all.empty.npecaneado.setText("000" + npescaneado.substring(3, 10).toUpperCase());
            all.empty.cantidadfinal.setText(all.empty.cantidadrequerida.getText());
            all.empty.serial.setText(npescaneado.substring(10));
            all.empty.NPS.setBackground(Color.CYAN);
            all.empty.npaescanear.setForeground(Color.WHITE);
            all.empty.QT.setForeground(Color.WHITE);
            all.empty.cantidadrequerida.setForeground(Color.WHITE);
            all.empty.FQT.setForeground(Color.WHITE);
            all.empty.cantidadfinal.setForeground(Color.WHITE);
            all.empty.DISP.setForeground(Color.WHITE);
            all.empty.idsp.setForeground(Color.WHITE);
            all.empty.descripcion.setForeground(Color.WHITE);
            all.empty.npecaneado.setForeground(Color.WHITE);
            all.empty.serial.setForeground(Color.WHITE);
            this.setVisible(false);
        }else {   
            JOptionPane.showMessageDialog(null, "FC15 ");
        }
    }//GEN-LAST:event_LogpartActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Barcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barcode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logpart;
    public javax.swing.JLabel country;
    public javax.swing.JLabel countryfinal;
    public javax.swing.JLabel ecfinal;
    public javax.swing.JLabel ecnumber;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel machine;
    public javax.swing.JLabel machinefinal;
    public javax.swing.JLabel npfinal;
    public javax.swing.JTextField npscan;
    public javax.swing.JLabel partnumber;
    public javax.swing.JLabel secfinal;
    public javax.swing.JLabel sequence;
    // End of variables declaration//GEN-END:variables
}
