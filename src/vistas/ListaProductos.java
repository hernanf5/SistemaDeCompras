/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import AccesoADatos.ProductoData;
import Entidades.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cristian
 */
public class ListaProductos extends javax.swing.JInternalFrame {

    DefaultTableModel tab = new DefaultTableModel();

    private ProductoData produc = new ProductoData();
    private List<Producto> fuente = new ArrayList<>();


    /**
     * Creates new form ListaProductos
     */
    public ListaProductos() {
        initComponents();
        fuente = produc.listarProductos();
        String ids[] = {"Identificador", "Nombre Producto", "Descripcion", "Precio Actual", "Stock", "Stock Minimo"};
        tab.setColumnIdentifiers(ids);
        jTListaProd.setModel(tab);
        cargarFilas();
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
        jTListaProd = new javax.swing.JTable();
        jBSalir = new javax.swing.JButton();
        jBEliminarProc = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRStockMinimo = new javax.swing.JRadioButton();
        jTBusqueda = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Listado");

        jTListaProd.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTListaProd);

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBEliminarProc.setText("Eliminar Producto");
        jBEliminarProc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarProcActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("Productos: ");

        jRStockMinimo.setText("Stock minimo");
        jRStockMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRStockMinimoActionPerformed(evt);
            }
        });

        jTBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBusquedaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jBEliminarProc, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRStockMinimo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(jLabel2)
                            .addGap(72, 72, 72)
                            .addComponent(jTBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jRStockMinimo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBEliminarProc)
                    .addComponent(jBModificar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed

        for (int i = 0; i < jTListaProd.getRowCount(); i++) {

            int Identificador = Integer.parseInt(jTListaProd.getValueAt(i, 0).toString());
            String nombreProd = (String) jTListaProd.getValueAt(i, 1).toString();
            String descripcion = (String) jTListaProd.getValueAt(i, 2).toString();
            Double precioActual = Double.parseDouble(jTListaProd.getValueAt(i, 3).toString());
            int stock = Integer.parseInt(jTListaProd.getValueAt(i, 4).toString());
            int stockMinimo = Integer.parseInt(jTListaProd.getValueAt(i, 5).toString());

            Producto producto = new Producto(Identificador, nombreProd, descripcion, precioActual, stock, stockMinimo, true);

            produc.modificarProducto(producto);

        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jRStockMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRStockMinimoActionPerformed
        if (jRStockMinimo.isSelected()) {
            List<Producto> fuente2 = new ArrayList<>();
            borrarFilas();
            for (Producto prod : fuente) {
                if (prod.getStock() <= prod.getStockMinimo()) {
                    fuente2.add(prod);
                }
            }
            if (fuente2 != null) {
                for (Producto tabMos : fuente2) {
                    tab.addRow(new Object[]{tabMos.getIdProducto(), tabMos.getNombreProducto(),
                        tabMos.getDescripcion(), tabMos.getPrecioActual(), tabMos.getStock(),
                        tabMos.getStockMinimo(), tabMos.isEstado()});
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay productos cuyo stock este por debajo del minimo");
            }
        }else{
            borrarFilas();
            cargarFilas();
        }


    }//GEN-LAST:event_jRStockMinimoActionPerformed

    private void jBEliminarProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarProcActionPerformed
        int filaSeleccionada = jTListaProd.getSelectedRow();
        if (filaSeleccionada != -1) {

            int idProducto = (Integer) tab.getValueAt(filaSeleccionada, 0);

            produc.borrarProducto(idProducto);
            borrarFilas();
        }
    }//GEN-LAST:event_jBEliminarProcActionPerformed

    private void jTBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBusquedaKeyReleased
        borrarFilas();

        for (Producto tabMos : fuente) {
            if (tabMos.getNombreProducto().toLowerCase().startsWith(jTBusqueda.getText().toLowerCase())) {
                tab.addRow(new Object[]{tabMos.getIdProducto(), tabMos.getNombreProducto(),
                    tabMos.getDescripcion(), tabMos.getPrecioActual(), tabMos.getStock(),
                    tabMos.getStockMinimo(), tabMos.isEstado()});

            }
        }


    }//GEN-LAST:event_jTBusquedaKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminarProc;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRStockMinimo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTBusqueda;
    private javax.swing.JTable jTListaProd;
    // End of variables declaration//GEN-END:variables
    private void borrarFilas() {
        int indice = tab.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            tab.removeRow(i);
        }
    }

    private void cargarFilas() {
        for (Producto tabMos : fuente) {
            tab.addRow(new Object[]{tabMos.getIdProducto(), tabMos.getNombreProducto(),
                tabMos.getDescripcion(), tabMos.getPrecioActual(), tabMos.getStock(),
                tabMos.getStockMinimo(), tabMos.isEstado()});
        }
    }

}
