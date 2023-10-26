
package AccesoADatos;

import Entidades.Producto;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernán Funes
 */
public class ProductoData {
    private Connection con = null;

    public ProductoData() {
        con = Conexion.getCon();
    }
    
    public void guardarProducto(Producto producto){
        String sql = "INSERT into producto (nombreProducto, descripcion, precioActual, stock, estado) VALUES (?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setString(3, producto.getNombreProducto());
            ps.setDouble(4, producto.getPrecioActual());
            ps.setInt(5, producto.getStock());
            ps.setBoolean(6, producto.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                producto.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto agregado con exito");
            }
            ps.close();  
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de producto " + ex.getMessage());
        }
        
    }
    
    public List<Producto> buscarProductoPorFecha(LocalDate fecha){
        
        List<Producto> productos = new ArrayList<>();
        
        try{
            String sql = "SELECT p.* from producto p JOIN detallecompra d ON (p.idProducto = d.idProducto) JOIN compra c ON (c.idCompra = d.idCompra) WHERE c.fecha = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
                productos.add(producto);
            }
            ps.close();   
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a las tablas "+ ex.getMessage());
        }
        return productos;
    }
    
    
}
