/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernán Funes
 */
public class ProveedorData {
     private Connection con = null;

    public ProveedorData() {
        con = Conexion.getCon();
    }
    
    public void guardarProveedor(Proveedor proveedor){
        String sql = "INSERT into proveedor (razonSocial, domicilio, telefono) VALUES (?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
           
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                proveedor.setIdProveedor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Proveedor agregado con exito");
            }
            ps.close();  
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de los proveedores" + ex.getMessage());
        }
    }
    
    public void modificarProveedor(Proveedor proveedor){
          String sql = "UPDATE proveedor SET razonSocial = ?, domicilio = ?, telefono ,estado = ? WHERE idProveedor= ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setBoolean(5, proveedor.isEstado());
            
            int exito = ps.executeUpdate();
            
            if(exito ==1 ){
                JOptionPane.showMessageDialog(null,"Proveedor modificado con exito ");
            }else{
                JOptionPane.showMessageDialog(null,"El proveedor no existe ");
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla proveedor" +ex);
        }
    
    }
    public void eliminarProveedor(){
        
    }
}
