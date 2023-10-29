
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
    
    //ALTA -- CREATE
    public void guardarProducto(Producto producto){
        String sql = "INSERT into producto (nombreProducto, descripcion, precioActual, stock, estado) VALUES (?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
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
    
    
    
    //Comportamiento listar(READ), primer item. No es necesario probar en primera entrega.
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
    
    public List<Producto> listarProductos(){
        List <Producto> productos = new ArrayList<>();
        
        try{
            String sql = "SELECT * from producto WHERE estado =1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
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
    
    //MODIFICAR -- UPDATE
    
    public void modificarProducto(Producto producto){
        String sql = "UPDATE producto SET nombreProducto = ?, descripcion = ?, precioActual = ?, stock = ?, estado=? WHERE idProducto = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.setInt(6, producto.getIdProducto());
            int exito = ps.executeUpdate();
            
            if(exito ==1 ){
                JOptionPane.showMessageDialog(null,"Producto modificado con exito ");
            }else{
                JOptionPane.showMessageDialog(null,"El producto no existe ");
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla producto " +ex);
        }
    }
    
    //BORRAR - DELETE
    public void borrarProducto(int id){
        String sql = "UPDATE producto SET estado = 0 WHERE idProducto = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                JOptionPane.showMessageDialog(null,"Producto borrado con exito ");
            }else{
                JOptionPane.showMessageDialog(null,"EL producto no existe ");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto. " + ex);
        }
    }
    
}
