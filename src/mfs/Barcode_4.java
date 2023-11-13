/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mfs;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import static mfs.Empty.nm;

/**
 *
 * @author 102976781
 */
public class Barcode_4 extends javax.swing.JFrame {

    /**
     *
     */
    String npescaneado, npingresado;

    
    public Barcode_4() {
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
        Sustituto = new javax.swing.JButton();
        Country = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        npfinal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        npscan.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        npscan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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

        Cancel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Cancel.setText("Esc = Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        Sustituto.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Sustituto.setText("F4 = Sustitute");

        Country.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Country.setText("F6 = Country");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Scan in Barcode...");

        npfinal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

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
                            .addComponent(Sustituto))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Country, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(partnumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(npfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(npfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Logpart)
                    .addComponent(Cancel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Country)
                    .addComponent(Sustituto))
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
                npingresado = npescaneado.substring(3,10);
                //ecfinal.setText("10000P45486");
                //secfinal.setText(npescaneado.substring(10));
                npscan.setText("");
            } else{
                    JOptionPane.showMessageDialog(null, "INVALID BARCODE - no matching rule");   
                    npscan.setText("");
                }
            } else{
            JOptionPane.showMessageDialog(null, "INVALID BARCODE - no matching rule");   
            npscan.setText("");
            }
        }
    }//GEN-LAST:event_npscanKeyTyped

    private void LogpartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogpartActionPerformed
switch (nm) {
            case 3:
                if (this.npingresado.toUpperCase().equals(all.empty.npaescanear3.getText())){
                    all.empty.npaescanear3.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp3.setText("I");
                    all.empty.npecaneado3.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal3.setText(all.empty.cantidadrequerida3.getText());
                    all.empty.NPS3.setBackground(Color.BLUE);
                    all.empty.npaescanear3.setForeground(Color.WHITE);
                    all.empty.QT13.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida3.setForeground(Color.WHITE);
                    all.empty.FQT3.setForeground(Color.WHITE);
                    all.empty.cantidadfinal3.setForeground(Color.WHITE);
                    all.empty.DISP3.setForeground(Color.WHITE);
                    all.empty.idsp3.setForeground(Color.WHITE);
                    all.empty.descripcion3.setForeground(Color.WHITE);
                    all.empty.npecaneado3.setForeground(Color.WHITE);
                    all.empty.serial3.setForeground(Color.WHITE);
                    npfinal.setText("");
                    this.setVisible(false);
                }       break;
            case 1:
                if (this.npingresado.toUpperCase().equals(all.empty.npaescanear1.getText())){
                    all.empty.npaescanear1.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp1.setText("I");
                    all.empty.npecaneado1.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal1.setText(all.empty.cantidadrequerida1.getText());
                    all.empty.NPS1.setBackground(Color.BLUE);
                    all.empty.npaescanear1.setForeground(Color.WHITE);
                    all.empty.QT1.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida1.setForeground(Color.WHITE);
                    all.empty.FQT1.setForeground(Color.WHITE);
                    all.empty.cantidadfinal1.setForeground(Color.WHITE);
                    all.empty.DISP1.setForeground(Color.WHITE);
                    all.empty.idsp1.setForeground(Color.WHITE);
                    all.empty.descripcion1.setForeground(Color.WHITE);
                    all.empty.npecaneado1.setForeground(Color.WHITE);
                    all.empty.serial1.setForeground(Color.WHITE);
                    npfinal.setText("");
                    this.setVisible(false);
                }       break;
            case 2:
                if (this.npingresado.toUpperCase().equals(all.empty.npaescanear2.getText())){
                    all.empty.npaescanear2.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp2.setText("I");
                    all.empty.npecaneado2.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal2.setText(all.empty.cantidadrequerida2.getText());
                    all.empty.NPS2.setBackground(Color.BLUE);
                    all.empty.npaescanear2.setForeground(Color.WHITE);
                    all.empty.QT2.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida2.setForeground(Color.WHITE);
                    all.empty.FQT2.setForeground(Color.WHITE);
                    all.empty.cantidadfinal2.setForeground(Color.WHITE);
                    all.empty.DISP2.setForeground(Color.WHITE);
                    all.empty.idsp2.setForeground(Color.WHITE);
                    all.empty.descripcion2.setForeground(Color.WHITE);
                    all.empty.npecaneado2.setForeground(Color.WHITE);
                    all.empty.serial2.setForeground(Color.WHITE);
                    npfinal.setText("");
                    this.setVisible(false);
                }       break;
            case 5:
                if (this.npingresado.toUpperCase().equals(all.empty.npaescanear5.getText())){
                    all.empty.npaescanear5.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp5.setText("I");
                    all.empty.npecaneado5.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal5.setText(all.empty.cantidadrequerida5.getText());
                    all.empty.NPS5.setBackground(Color.BLUE);
                    all.empty.npaescanear5.setForeground(Color.WHITE);
                    all.empty.QT5.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida5.setForeground(Color.WHITE);
                    all.empty.FQT5.setForeground(Color.WHITE);
                    all.empty.cantidadfinal5.setForeground(Color.WHITE);
                    all.empty.DISP5.setForeground(Color.WHITE);
                    all.empty.idsp5.setForeground(Color.WHITE);
                    all.empty.descripcion5.setForeground(Color.WHITE);
                    all.empty.npecaneado5.setForeground(Color.WHITE);
                    all.empty.serial5.setForeground(Color.WHITE);
                    npfinal.setText("");
                    this.setVisible(false);
                }       break;
            case 7:
                if (this.npingresado.toUpperCase().equals(all.empty.npaescanear7.getText())){
                    all.empty.npaescanear7.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp7.setText("I");
                    all.empty.npecaneado7.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal7.setText(all.empty.cantidadrequerida7.getText());
                    all.empty.NPS7.setBackground(Color.BLUE);
                    all.empty.npaescanear7.setForeground(Color.WHITE);
                    all.empty.QT7.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida7.setForeground(Color.WHITE);
                    all.empty.FQT7.setForeground(Color.WHITE);
                    all.empty.cantidadfinal7.setForeground(Color.WHITE);
                    all.empty.DISP7.setForeground(Color.WHITE);
                    all.empty.idsp7.setForeground(Color.WHITE);
                    all.empty.descripcion7.setForeground(Color.WHITE);
                    all.empty.npecaneado7.setForeground(Color.WHITE);
                    all.empty.serial7.setForeground(Color.WHITE);
                    npfinal.setText("");
                    this.setVisible(false);
                }       break;
            case 31:
                if (this.npingresado.toUpperCase().equals(all.empty.npaescanear31.getText())){
                    all.empty.npaescanear31.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp31.setText("I");
                    all.empty.npecaneado31.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal31.setText(all.empty.cantidadrequerida31.getText());
                    all.empty.NPS31.setBackground(Color.BLUE);
                    all.empty.npaescanear31.setForeground(Color.WHITE);
                    all.empty.QT31.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida31.setForeground(Color.WHITE);
                    all.empty.FQT31.setForeground(Color.WHITE);
                    all.empty.cantidadfinal31.setForeground(Color.WHITE);
                    all.empty.DISP31.setForeground(Color.WHITE);
                    all.empty.idsp31.setForeground(Color.WHITE);
                    all.empty.descripcion31.setForeground(Color.WHITE);
                    all.empty.npecaneado31.setForeground(Color.WHITE);
                    all.empty.serial31.setForeground(Color.WHITE);
                    npfinal.setText("");
                    this.setVisible(false);
                }       break;
            case 13:
                if (this.npingresado.toUpperCase().equals(all.empty.npaescanear13.getText())){
                    all.empty.npaescanear13.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp13.setText("I");
                    all.empty.npecaneado13.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal13.setText(all.empty.cantidadrequerida13.getText());
                    all.empty.NPS13.setBackground(Color.BLUE);
                    all.empty.npaescanear13.setForeground(Color.WHITE);
                    all.empty.QT13.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida13.setForeground(Color.WHITE);
                    all.empty.FQT13.setForeground(Color.WHITE);
                    all.empty.cantidadfinal13.setForeground(Color.WHITE);
                    all.empty.DISP13.setForeground(Color.WHITE);
                    all.empty.idsp13.setForeground(Color.WHITE);
                    all.empty.descripcion13.setForeground(Color.WHITE);
                    all.empty.npecaneado13.setForeground(Color.WHITE);
                    all.empty.serial13.setForeground(Color.WHITE);
                    npfinal.setText("");
                    this.setVisible(false);
                }       break;
            case 16:
                if (this.npingresado.toUpperCase().equals(all.empty.npaescanear16.getText())){
                    all.empty.npaescanear16.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp16.setText("I");
                    all.empty.npecaneado16.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal16.setText(all.empty.cantidadrequerida16.getText());
                    all.empty.NPS16.setBackground(Color.BLUE);
                    all.empty.npaescanear16.setForeground(Color.WHITE);
                    all.empty.QT16.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida16.setForeground(Color.WHITE);
                    all.empty.FQT16.setForeground(Color.WHITE);
                    all.empty.cantidadfinal16.setForeground(Color.WHITE);
                    all.empty.DISP16.setForeground(Color.WHITE);
                    all.empty.idsp16.setForeground(Color.WHITE);
                    all.empty.descripcion16.setForeground(Color.WHITE);
                    all.empty.npecaneado16.setForeground(Color.WHITE);
                    all.empty.serial16.setForeground(Color.WHITE);
                    npfinal.setText("");
                    this.setVisible(false);
                }       break;
            case 19:
                if (this.npingresado.toUpperCase().equals(all.empty.npaescanear19.getText())){
                    all.empty.npaescanear19.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp19.setText("I");
                    all.empty.npecaneado19.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal19.setText(all.empty.cantidadrequerida19.getText());
                    all.empty.NPS19.setBackground(Color.BLUE);
                    all.empty.npaescanear19.setForeground(Color.WHITE);
                    all.empty.QT19.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida19.setForeground(Color.WHITE);
                    all.empty.FQT19.setForeground(Color.WHITE);
                    all.empty.cantidadfinal19.setForeground(Color.WHITE);
                    all.empty.DISP19.setForeground(Color.WHITE);
                    all.empty.idsp19.setForeground(Color.WHITE);
                    all.empty.descripcion19.setForeground(Color.WHITE);
                    all.empty.npecaneado19.setForeground(Color.WHITE);
                    all.empty.serial19.setForeground(Color.WHITE);
                    npfinal.setText("");
                    this.setVisible(false);
                }       break;
            case 22:
                if (this.npingresado.toUpperCase().equals(all.empty.npaescanear22.getText())){
                    all.empty.npaescanear22.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp22.setText("I");
                    all.empty.npecaneado22.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal22.setText(all.empty.cantidadrequerida22.getText());
                    all.empty.NPS22.setBackground(Color.BLUE);
                    all.empty.npaescanear22.setForeground(Color.WHITE);
                    all.empty.QT22.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida22.setForeground(Color.WHITE);
                    all.empty.FQT22.setForeground(Color.WHITE);
                    all.empty.cantidadfinal22.setForeground(Color.WHITE);
                    all.empty.DISP22.setForeground(Color.WHITE);
                    all.empty.idsp22.setForeground(Color.WHITE);
                    all.empty.descripcion22.setForeground(Color.WHITE);
                    all.empty.npecaneado22.setForeground(Color.WHITE);
                    all.empty.serial22.setForeground(Color.WHITE);
                    npfinal.setText("");
                    this.setVisible(false);
                }       break;
            case 24:
                if (this.npingresado.toUpperCase().equals(all.empty.npaescanear24.getText())){
                    all.empty.npaescanear24.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp24.setText("I");
                    all.empty.npecaneado24.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal24.setText(all.empty.cantidadrequerida24.getText());
                    all.empty.NPS24.setBackground(Color.BLUE);
                    all.empty.npaescanear24.setForeground(Color.WHITE);
                    all.empty.QT24.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida24.setForeground(Color.WHITE);
                    all.empty.FQT24.setForeground(Color.WHITE);
                    all.empty.cantidadfinal24.setForeground(Color.WHITE);
                    all.empty.DISP24.setForeground(Color.WHITE);
                    all.empty.idsp24.setForeground(Color.WHITE);
                    all.empty.descripcion24.setForeground(Color.WHITE);
                    all.empty.npecaneado24.setForeground(Color.WHITE);
                    all.empty.serial24.setForeground(Color.WHITE);
                    npfinal.setText("");
                    this.setVisible(false);
                }       break;
            case 25:
                if (this.npingresado.toUpperCase().equals(all.empty.npaescanear25.getText())){
                    all.empty.npaescanear25.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp25.setText("I");
                    all.empty.npecaneado25.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal25.setText(all.empty.cantidadrequerida25.getText());
                    all.empty.NPS25.setBackground(Color.BLUE);
                    all.empty.npaescanear25.setForeground(Color.WHITE);
                    all.empty.QT25.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida25.setForeground(Color.WHITE);
                    all.empty.FQT25.setForeground(Color.WHITE);
                    all.empty.cantidadfinal25.setForeground(Color.WHITE);
                    all.empty.DISP25.setForeground(Color.WHITE);
                    all.empty.idsp25.setForeground(Color.WHITE);
                    all.empty.descripcion25.setForeground(Color.WHITE);
                    all.empty.npecaneado25.setForeground(Color.WHITE);
                    all.empty.serial25.setForeground(Color.WHITE);
                    npfinal.setText("");
                    this.setVisible(false);
                }       break;
            case 26:
                if (this.npingresado.toUpperCase().equals(all.empty.npaescanear26.getText())){
                    all.empty.npaescanear26.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp26.setText("I");
                    all.empty.npecaneado26.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal26.setText(all.empty.cantidadrequerida26.getText());
                    all.empty.NPS26.setBackground(Color.BLUE);
                    all.empty.npaescanear26.setForeground(Color.WHITE);
                    all.empty.QT26.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida26.setForeground(Color.WHITE);
                    all.empty.FQT26.setForeground(Color.WHITE);
                    all.empty.cantidadfinal26.setForeground(Color.WHITE);
                    all.empty.DISP26.setForeground(Color.WHITE);
                    all.empty.idsp26.setForeground(Color.WHITE);
                    all.empty.descripcion26.setForeground(Color.WHITE);
                    all.empty.npecaneado26.setForeground(Color.WHITE);
                    all.empty.serial26.setForeground(Color.WHITE);
                    npfinal.setText("");
                    this.setVisible(false);
                }       break;
            case 27:
                if (this.npingresado.toUpperCase().equals(all.empty.npaescanear27.getText())){
                    all.empty.npaescanear27.setText("000" + npingresado.toUpperCase());
                    all.empty.idsp27.setText("I");
                    all.empty.npecaneado27.setText("000" + npingresado.toUpperCase());
                    all.empty.cantidadfinal27.setText(all.empty.cantidadrequerida27.getText());
                    all.empty.NPS27.setBackground(Color.BLUE);
                    all.empty.npaescanear27.setForeground(Color.WHITE);
                    all.empty.QT27.setForeground(Color.WHITE);
                    all.empty.cantidadrequerida27.setForeground(Color.WHITE);
                    all.empty.FQT27.setForeground(Color.WHITE);
                    all.empty.cantidadfinal27.setForeground(Color.WHITE);
                    all.empty.DISP27.setForeground(Color.WHITE);
                    all.empty.idsp27.setForeground(Color.WHITE);
                    all.empty.descripcion27.setForeground(Color.WHITE);
                    all.empty.npecaneado27.setForeground(Color.WHITE);
                    all.empty.serial27.setForeground(Color.WHITE);
                    npfinal.setText("");
                    this.setVisible(false);
                }       break;
                
            default:
                JOptionPane.showMessageDialog(null, "FC15 ");
                break;
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
            java.util.logging.Logger.getLogger(Barcode_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barcode_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barcode_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barcode_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barcode_4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Country;
    private javax.swing.JButton Logpart;
    private javax.swing.JButton Sustituto;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel npfinal;
    public javax.swing.JTextField npscan;
    public javax.swing.JLabel partnumber;
    // End of variables declaration//GEN-END:variables
}
