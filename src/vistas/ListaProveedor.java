/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import AccesoADatos.ProveedorData;
import Entidades.Proveedor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cristian
 */
public class ListaProveedor extends javax.swing.JInternalFrame {
    
    private ProveedorData prove = new ProveedorData();
    private List<Proveedor> fuente= prove.listarProveedor();
    
    DefaultTableModel tab = new DefaultTableModel();

    /**
     * Creates new form ListaProveedor
     */
    public ListaProveedor() {
        initComponents();
        cargarProveedor();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTlistaProvee = new javax.swing.JTable();
        jBEliminarProvee = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jCProveedores = new javax.swing.JComboBox<>();
        jBModificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Listado de Proveedores");

        jTlistaProvee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTlistaProvee);

        jBEliminarProvee.setText("Eliminar Proveedor");
        jBEliminarProvee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarProveeActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jCProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCProveedoresActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("Proveedores:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(371, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jBEliminarProvee, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(jBSalir)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEliminarProvee)
                    .addComponent(jBSalir)
                    .addComponent(jBModificar))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
    
        for (int i = 0; i < jTlistaProvee.getRowCount(); i++) {

            int identificador= ((Proveedor) jCProveedores.getSelectedItem()).getIdProveedor();
            
            String razonSocial = (String)jTlistaProvee.getValueAt(i, 1).toString();
            
            String domicilio =(String)jTlistaProvee.getValueAt(i, 2).toString();
            
            String telefono = (String)jTlistaProvee.getValueAt(i, 3).toString();
            
           Proveedor proveedor = new Proveedor(identificador, razonSocial, domicilio, telefono, true);
                        
            prove.modificarProveedor(proveedor);
            
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jCProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCProveedoresActionPerformed
        int id = ((Proveedor) jCProveedores.getSelectedItem()).getIdProveedor();
        String ids[] = {"Identificador", "Razon Social", "Domicilio", "Telefono"};
        tab.setColumnIdentifiers(ids);
        jTlistaProvee.setModel(tab);
        borrarFilas();
        
        for (Proveedor tabMos : fuente) {
            if (tabMos.getIdProveedor() == id) {
                tab.addRow(new Object[]{tabMos.getIdProveedor(), tabMos.getRazonSocial(), tabMos.getDomicilio(), tabMos.getTelefono()});
            }
        }

    }//GEN-LAST:event_jCProveedoresActionPerformed

    private void jBEliminarProveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarProveeActionPerformed

     
        int filaSeleccionada = jTlistaProvee.getSelectedRow();
        if (filaSeleccionada != -1) {
            Proveedor a = (Proveedor) jCProveedores.getSelectedItem();
            
            int idProveedor= (Integer) tab.getValueAt(filaSeleccionada, 0);
            
            prove.eliminarProveedor(a);
            borrarFilas();
        }
    }//GEN-LAST:event_jBEliminarProveeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminarProvee;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Proveedor> jCProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTlistaProvee;
    // End of variables declaration//GEN-END:variables

    private void borrarFilas() {
        int indice = tab.getRowCount() - 1;
        
        for (int i = indice; i >= 0; i--) {
            tab.removeRow(i);
        }
    }
    
    private void cargarProveedor() {
        for (Proveedor item : fuente) {
            jCProveedores.addItem(item);
        }
    }
}
