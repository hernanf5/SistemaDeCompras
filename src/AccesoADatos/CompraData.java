/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Compra;
import Entidades.Producto;
import Entidades.Proveedor;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernán Funes
 */
public class CompraData {

    private Connection con = null;

    public CompraData() {
        con = Conexion.getCon();
    }

    public void guardarCompra(Compra compra) {
        String sql = "INSERT INTO compra (idProveedor, fecha, Estado) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, compra.getProveedor().getIdProveedor());
            ps.setDate(2, Date.valueOf(compra.getFecha()));
            ps.setBoolean(3, compra.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                compra.setIdCompra(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Compra añadida con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de compras. " + ex.getMessage());
        }

    }

    public void borrarCompra(int idCompra) {
        String sql = "UPDATE compra SET Estado = 0 WHERE idCompra = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCompra);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino la compra.");
            } else {
                JOptionPane.showMessageDialog(null, "La compra no existe");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de compras" + ex.getMessage());
        }

    }

    public void modificarCompra(Compra compra) {
        String sql = "UPDATE compra SET fecha = ?, Estado = ? WHERE idCompra = ?";
        PreparedStatement ps = null;
        try {

            ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(compra.getFecha()));
            ps.setBoolean(2, compra.isEstado());
            ps.setInt(3, compra.getIdCompra());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La compra no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de compra " + ex.getMessage());
        }

    }

    public List<Compra> listarCompras() {
        List<Compra> compras = new ArrayList<>();

        try {
            String sql = "SELECT * from compra WHERE Estado =1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Compra compra = new Compra();
                ProveedorData pd = new ProveedorData();
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setProveedor(pd.buscarProveedor(rs.getInt("idProveedor")));
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compra.setEstado(true);
                compras.add(compra);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a las tablas " + ex.getMessage());
        }

        return compras;
    }

    public Compra buscarCompra(int id) {
        Compra compra = null;
        String sql = "SELECT * FROM compra WHERE idCompra = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ProveedorData pd = new ProveedorData();
                compra = new Compra();
                compra.setIdCompra(id);
                compra.setProveedor(pd.buscarProveedor(rs.getInt("idProveedor")));
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compra.setEstado(rs.getBoolean("Estado"));
            } else {
                JOptionPane.showMessageDialog(null, "La compra no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de compra " + ex.getMessage());
        }

        return compra;
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
