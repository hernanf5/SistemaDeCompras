/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Proveedor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
    
    public void guardarProveedor(Proveedor proveedor) {
        String sql = "INSERT into proveedor (razonSocial, domicilio, telefono,estado) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setBoolean(4, proveedor.isEstado());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                proveedor.setIdProveedor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Proveedor agregado con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de los proveedores" + ex.getMessage());
        }
    }
    
    public void modificarProveedor(Proveedor proveedor) {
        String sql = "UPDATE proveedor SET razonSocial = ?, domicilio = ?, telefono =? ,estado = ? WHERE idProveedor= ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setBoolean(4, proveedor.isEstado());
            ps.setInt(5, proveedor.getIdProveedor());
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Proveedor modificado con exito ");
            } else {
                JOptionPane.showMessageDialog(null, "El proveedor no existe ");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedor" + ex);
        }
        
    }
    
    public void eliminarProveedor(Proveedor proveedor) {
        String sql = "UPDATE proveedor SET estado = 0 WHERE idProveedor = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, proveedor.getIdProveedor());
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Proveedor borrado con exito ");
            } else {
                JOptionPane.showMessageDialog(null, "EL proveedor no existe ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de los proveedores. " + ex);
        }
    }
    
    public Proveedor buscarProveedor(int id) {
        Proveedor proveedor = null;
        String sql = "SELECT * from proveedor WHERE idProveedor = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                proveedor = new Proveedor();
                proveedor.setIdProveedor(id);
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedor.setEstado(rs.getBoolean("Estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el proveedor");                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de los proveedor. " + ex);
        }
        
        return proveedor;
    }
    
    public List<Proveedor> listarProveedor() {
        
        List<Proveedor> proveedores = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM `proveedor` WHERE Estado = 1;";
            PreparedStatement ps = con.prepareStatement(sql);
 
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                Proveedor prove = new Proveedor();
                
                prove.setIdProveedor(rs.getInt("idProveedor"));
                prove.setRazonSocial(rs.getString("razonSocial"));
                prove.setDomicilio(rs.getString("domicilio"));
                prove.setTelefono(rs.getString("telefono"));
                prove.setEstado(rs.getBoolean("estado"));
                
                proveedores.add(prove);
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla de proveedores" + ex);
        }
        return proveedores;
    }
}
