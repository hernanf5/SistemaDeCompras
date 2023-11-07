/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Compra;
import Entidades.Proveedor;
import java.sql.Connection;
import java.sql.*;
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

    public void guardarCompra (Compra compra){
        String sql = "INSERT INTO compra (idProveedor, fecha, Estado) VALUES (?,?,?)";
            try{
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, compra.getProveedor().getIdProveedor());
                ps.setDate(2, Date.valueOf(compra.getFecha()));
                ps.setBoolean(3, compra.isEstado());
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

    public void borrarCompra (Compra compra){
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

    public void modificarCompra (Compra compra){
            String sql = "UPDATE compra SET fecha = ?, Estado = ?, Oferta = ? WHERE idCompra = ?";
            PreparedStatement ps = null;
            try{           

                ps = con.prepareStatement(sql);
                ps.setDate(1, Date.valueOf(compra.getFecha()));
                ps.setBoolean(2, compra.isEstado());
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
    
    public Compra buscarCompra(int id){
        Compra compra = null;
        String sql = "SELECT * FROM compra WHERE idCompra = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                ProveedorData pd = new ProveedorData();
                compra = new Compra();
                compra.setIdCompra(id);
                compra.setProveedor(pd.buscarProveedor(rs.getInt("idProveedor")));
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compra.setEstado(rs.getBoolean("Estado"));
            }else{
                JOptionPane.showMessageDialog(null, "La compra no existe");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de compra "+ ex.getMessage());
        }
        
        return compra;
    }

//    public Alumno buscarAlumno(int id){
//        Alumno alumno = null;
//        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
//        PreparedStatement ps = null;
//        try{
//            ps = con.prepareStatement(sql);
//            ps.setInt(1, id);
//            
//            ResultSet rs = ps.executeQuery();
//            if(rs.next()){
//                alumno = new Alumno();
//                alumno.setIdAlumno(id);
//                alumno.setDni(rs.getInt("dni"));
//                alumno.setApellido(rs.getString("apellido"));
//                alumno.setNombre(rs.getString("nombre"));
//                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
//                alumno.setEstado(true);
//                
//            }else{
//                JOptionPane.showMessageDialog(null, "No existe el alumno");
//                ps.close();
//            }
//        }catch (SQLException ex){
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de alumno"+ ex.getMessage());
//        }
//        return alumno;
//        
//    }



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
