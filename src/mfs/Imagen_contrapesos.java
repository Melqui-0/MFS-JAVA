/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mfs;

/**
 *
 * @author MelquiAzarelRamirezR
 */
public class Imagen_contrapesos extends javax.swing.JPanel {

    /**
     * Creates new form Imagen_contrapesos
     */
    public Imagen_contrapesos() {
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

        Imagen_contrapesos = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        change10 = new javax.swing.JCheckBox();

        Imagen_contrapesos.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_contrapesos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/BRICKMX_NEW.jpg"))); // NOI18N

        change10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        change10.setText("Incompleto");
        change10.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                change10StateChanged(evt);
            }
        });
        change10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Imagen_contrapesosLayout = new javax.swing.GroupLayout(Imagen_contrapesos);
        Imagen_contrapesos.setLayout(Imagen_contrapesosLayout);
        Imagen_contrapesosLayout.setHorizontalGroup(
            Imagen_contrapesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Imagen_contrapesosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Imagen_contrapesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(change10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Imagen_contrapesosLayout.setVerticalGroup(
            Imagen_contrapesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Imagen_contrapesosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(change10)
                .addContainerGap(377, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Imagen_contrapesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Imagen_contrapesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void change10StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_change10StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_change10StateChanged

    private void change10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_change10ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Imagen_contrapesos;
    public javax.swing.JCheckBox change10;
    public javax.swing.JCheckBox change9;
    private javax.swing.JLabel jLabel10;
    // End of variables declaration//GEN-END:variables
}
