/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.DetalleCompra;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernán Funes
 */


public class DetalleCompraData {
    
    private Connection con = null;
      
    private ProductoData pd=new ProductoData();
    private CompraData cd = new CompraData();
    public DetalleCompraData() {
        
    
        con = Conexion.getCon();

    }
    
    public void  guardarDetalleCompra(DetalleCompra dc) {
 // int idVenta, int idProducto        
        
        String sql = "INSERT INTO detalleCompra (cantidad, precioCosto, idCompra, idProducto) VALUES (?,?,?,?)";

        try{
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dc.getCantidad());
            ps.setDouble(2, dc.getPrecioCosto());
            ps.setInt(3, dc.getCompra().getIdCompra());
            ps.setInt(4, dc.getProducto().getIdProducto());
            
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            
            if(rs.next()){
                dc.setIdDetalle(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Detalle compra agregado con exito.");    
            }
            
            
            ps.close();
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al guardar producto: " + ex.getMessage());
        }
    }
    
//    public List<DetalleCompra> obtenerDetalleXcompra(int idCompra) {
//        
//        List<DetalleCompra> detalles = new ArrayList<>();
//        DetalleCompra dc = null;
//        String sql = "SELECT * FROM detalleCompra WHERE idCompra = ?";
//        PreparedStatement ps=null;
//        try{
//            ps = con.prepareStatement(sql);
//            ps.setInt(1, idCompra);
//            
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//                dc=new DetalleCompra();
//                dc.setIdDetalle(rs.getInt("idDetalle"));
//                dc.setCantidad(rs.getInt("cantidad"));
//                dc.setPrecioCosto(rs.getDouble("precioCosto"));
//                
//                Compra c = cd.obtenerComprasPorId(rs.getInt("idCompra"));
//                
//                dc.setCompra(c);
//                
//                Producto p=pd.buscarProducto(rs.getInt("idProducto"));
//                dc.setProducto(p);
//                detalles.add(dc);
//            }
//
//        } catch (SQLException ex) {
//                    JOptionPane.showMessageDialog(null, "Error al obtener el Detalle: "+ex.getMessage());        }
//
//        return detalles;
//    }
    
    public DetalleCompra modificarDetalleCompra(DetalleCompra dc) { 

        String sql = "UPDATE detalleCompra SET cantidad=?, precioCosto=?  WHERE idDetalle=?";
        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(sql);//envia la sentencia sql a la base de datos
            ps.setInt(1, dc.getCantidad());
            ps.setDouble(2, dc.getPrecioCosto());
            ps.setInt(3, dc.getIdDetalle());

            int filas = ps.executeUpdate();
            if (filas == 1)
            {
               
          
            
                JOptionPane.showMessageDialog(null, "Detalle de Compra modificada");
            } else
            {
                JOptionPane.showMessageDialog(null, "No se encontro la Compra!" + ps.toString());
            }
            ps.close();//cerramos la conexion
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al modificar Detalle de Compra: " + ex.getMessage());
        }
        return dc;
    } 

}

