/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Compra;
import Entidades.Proveedor;
import java.sql.Connection;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernán Funes
 */
public class CompraData {
private Connection  con = null;
public CompraData() {
    con = Conexion.getCon();
}

void guardarCompra (Compra compra){
    String sql = "INSERT INTO compra (idProveedor, fecha, Estado , Oferta) VALUES (?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, compra.getProovedor().getIdProveedor());
            ps.setDate(2, Date.valueOf(compra.getFecha()));
            ps.setBoolean(3, compra.isEstado());
            ps.setDouble(4, compra.getOferta());
            ps.executeUpdate();
            ResultSet rs =ps.getGeneratedKeys();
            if(rs.next()){
                compra.setIdCompra(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Compra añadida con exito.");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de compras. " + ex.getMessage());
        }
    
}

void borrarCompra (Compra compra){
    String sql = "UPDATE compra SET Estado = 0 WHERE idCompra = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, compra.getIdCompra());
            
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Se elimino la compra.");
            }else{
                JOptionPane.showMessageDialog(null, "La compra no existe");
            }
            ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de compras"+ ex.getMessage());
        }
    
    
}

void modificarCompra (Compra compra){
        String sql = "UPDATE compra SET fecha = ?, Estado = ?, Oferta = ? WHERE idCompra = ?";
        PreparedStatement ps = null;
        try{           
            
            ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(compra.getFecha()));
            ps.setBoolean(2, compra.isEstado());
            ps.setDouble(3, compra.getOferta());
            ps.setInt (4, compra.getIdCompra());
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Modificado exitosamente.");
            }else{
                JOptionPane.showMessageDialog(null, "La compra no existe");
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de compra "+ ex.getMessage());
        }
    
}

//void aplicarOferta (Compra compra)  {
//    try{
//        String sql = "SELECT compra c JOIN detallecompra d ON (c.idCompra = d.idCompra) WHERE c.idCompra = ? ";
//        PreparedStatement ps = con.prepareStatement(sql);
//        ps.setInt(1, compra.getIdCompra());
//        ResultSet rs = ps.executeQuery();
//        
//        
//    }catch(SQLException ex){
//        
//    }
//}
    
    
    
}
