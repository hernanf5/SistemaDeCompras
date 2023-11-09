/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import AccesoADatos.ProveedorData;
import Entidades.Proveedor;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian
 */
public class Proveedores extends javax.swing.JInternalFrame {
    
    private ProveedorData prove = new ProveedorData();
    private Proveedor proveActual = null;

    /**
     * Creates new form Proveedores
     */
    public Proveedores() {
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTDomicilio = new javax.swing.JTextField();
        jTRazonSocial = new javax.swing.JTextField();
        jTTelefono = new javax.swing.JTextField();
        jREstado = new javax.swing.JRadioButton();
        jBGuardar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Agregar Proveedores");

        jLabel3.setText("Razón Social :");

        jLabel4.setText("Domicilio :");

        jLabel5.setText("Teléfono :");

        jLabel6.setText("Estado :");

        jTRazonSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTRazonSocialActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBGuardar, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTDomicilio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(jTTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jREstado, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTRazonSocial))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jBLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addComponent(jBSalir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jREstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBLimpiar)
                    .addComponent(jBSalir))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTRazonSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTRazonSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTRazonSocialActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiarCampos();
        proveActual = null;
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            
            String razon = jTRazonSocial.getText();
            if (razon.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
                return;
            }
            String domi = jTDomicilio.getText();
            String tel = jTTelefono.getText();
            boolean estado = jREstado.isSelected();
            
            if (proveActual == null) {
                proveActual = new Proveedor( razon, domi, tel, estado);
                prove.guardarProveedor(proveActual);
            } else {
                
                proveActual.setRazonSocial(razon);
                proveActual.setDomicilio(domi);
                proveActual.setTelefono(tel);
                
            }
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un identificador valido");
    }//GEN-LAST:event_jBGuardarActionPerformed
    }
    
    private void limpiarCampos() {
        
        jTRazonSocial.setText("");
        jTDomicilio.setText("");
        jTTelefono.setText("");
        jREstado.setText("");
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jREstado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTDomicilio;
    private javax.swing.JTextField jTRazonSocial;
    private javax.swing.JTextField jTTelefono;
    // End of variables declaration//GEN-END:variables
}
