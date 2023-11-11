/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Cristian
 */
public class ProveMax extends javax.swing.JFrame {

    /**
     * Creates new form ProveMax
     */
    public ProveMax() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        ImageIcon icono = new ImageIcon(getClass().getResource("/img/Fondo.png"));
        Image miImagen = icono.getImage();
        jDescritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMCompra = new javax.swing.JMenu();
        jMCompraProducta = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMProducto = new javax.swing.JMenu();
        jMAgregarProductos = new javax.swing.JMenuItem();
        jMListaProductos = new javax.swing.JMenuItem();
        jMListaFecha = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMAgregarProveedores = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMListaProveedores = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDescritorio.setPreferredSize(new java.awt.Dimension(900, 600));

        javax.swing.GroupLayout jDescritorioLayout = new javax.swing.GroupLayout(jDescritorio);
        jDescritorio.setLayout(jDescritorioLayout);
        jDescritorioLayout.setHorizontalGroup(
            jDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 946, Short.MAX_VALUE)
        );
        jDescritorioLayout.setVerticalGroup(
            jDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );

        jMCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icon-Compras.png"))); // NOI18N
        jMCompra.setText("Compra");
        jMCompra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jMCompraProducta.setText("Compra de Productos");
        jMCompraProducta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCompraProductaActionPerformed(evt);
            }
        });
        jMCompra.add(jMCompraProducta);

        jMenuItem4.setText("Listado de Compra");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMCompra.add(jMenuItem4);

        jMenuItem5.setText("Listado Compra por Proveedor");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMCompra.add(jMenuItem5);

        jMenuBar1.add(jMCompra);

        jMProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icon-Productos.png"))); // NOI18N
        jMProducto.setText("Producto");
        jMProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jMAgregarProductos.setText("Agregar Productos");
        jMAgregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAgregarProductosActionPerformed(evt);
            }
        });
        jMProducto.add(jMAgregarProductos);

        jMListaProductos.setText("Lista de Productos");
        jMListaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListaProductosActionPerformed(evt);
            }
        });
        jMProducto.add(jMListaProductos);

        jMListaFecha.setText("Lista por fecha");
        jMListaFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListaFechaActionPerformed(evt);
            }
        });
        jMProducto.add(jMListaFecha);

        jMenuBar1.add(jMProducto);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icon-Proveedores.png"))); // NOI18N
        jMenu3.setText("Proveedor");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jMAgregarProveedores.setText("Agregar Proveedores");
        jMAgregarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAgregarProveedoresActionPerformed(evt);
            }
        });
        jMenu3.add(jMAgregarProveedores);

        jMenuItem6.setText("Proveedores por producto");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMListaProveedores.setText("Lista Proveedores");
        jMListaProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListaProveedoresActionPerformed(evt);
            }
        });
        jMenu3.add(jMListaProveedores);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDescritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDescritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMCompraProductaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCompraProductaActionPerformed
        jDescritorio.removeAll();
        jDescritorio.repaint();
        CompraProductos cp = new CompraProductos();
        cp.setVisible(true);
        jDescritorio.add(cp);
        jDescritorio.moveToFront(cp);
    }//GEN-LAST:event_jMCompraProductaActionPerformed

    private void jMListaProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListaProveedoresActionPerformed
        jDescritorio.removeAll();
        jDescritorio.repaint();
        ListaProveedor lp = new ListaProveedor();
        lp.setVisible(true);
        jDescritorio.add(lp);
        jDescritorio.moveToFront(lp);
    }//GEN-LAST:event_jMListaProveedoresActionPerformed

    private void jMAgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAgregarProductosActionPerformed
        jDescritorio.removeAll();
        jDescritorio.repaint();
        AgregarProducto apd = new AgregarProducto();
        apd.setVisible(true);
        jDescritorio.add(apd);
        jDescritorio.moveToFront(apd);
    }//GEN-LAST:event_jMAgregarProductosActionPerformed

    private void jMListaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListaProductosActionPerformed
        jDescritorio.removeAll();
        jDescritorio.repaint();
        ListaProductos lpd = new ListaProductos();
        lpd.setVisible(true);
        jDescritorio.add(lpd);
        jDescritorio.moveToFront(lpd);
    }//GEN-LAST:event_jMListaProductosActionPerformed

    private void jMAgregarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAgregarProveedoresActionPerformed
        jDescritorio.removeAll();
        jDescritorio.repaint();
        Proveedores ap = new Proveedores();
        ap.setVisible(true);
        jDescritorio.add(ap);
        jDescritorio.moveToFront(ap);
    }//GEN-LAST:event_jMAgregarProveedoresActionPerformed

    private void jMListaFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListaFechaActionPerformed
        jDescritorio.removeAll();
        jDescritorio.repaint();
        ListarProductosFechas lpf = new ListarProductosFechas();
        lpf.setVisible(true);
        jDescritorio.add(lpf);
        jDescritorio.moveToFront(lpf);
    }//GEN-LAST:event_jMListaFechaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        jDescritorio.removeAll();
        jDescritorio.repaint();
        ListadoDeCompras lc = new ListadoDeCompras();
        lc.setVisible(true);
        jDescritorio.add(lc);
        jDescritorio.moveToFront(lc);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        jDescritorio.removeAll();
        jDescritorio.repaint();
        ListadoCompraProveedor lcp = new ListadoCompraProveedor();
        lcp.setVisible(true);
        jDescritorio.add(lcp);
        jDescritorio.moveToFront(lcp);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        jDescritorio.removeAll();
        jDescritorio.repaint();
        proveedoresPorProducto ppp = new proveedoresPorProducto();
        ppp.setVisible(true);
        jDescritorio.add(ppp);
        jDescritorio.moveToFront(ppp);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(ProveMax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProveMax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProveMax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProveMax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProveMax().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDescritorio;
    private javax.swing.JMenuItem jMAgregarProductos;
    private javax.swing.JMenuItem jMAgregarProveedores;
    private javax.swing.JMenu jMCompra;
    private javax.swing.JMenuItem jMCompraProducta;
    private javax.swing.JMenuItem jMListaFecha;
    private javax.swing.JMenuItem jMListaProductos;
    private javax.swing.JMenuItem jMListaProveedores;
    private javax.swing.JMenu jMProducto;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
