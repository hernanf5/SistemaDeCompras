/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Compra;
import Entidades.DetalleCompra;
import Entidades.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernán Funes
 */
public class DetalleCompraData {

    private Connection con = null;

    public DetalleCompraData() {

        con = Conexion.getCon();

    }

    public void guardarDetalleCompra(DetalleCompra dc) {
        // int idVenta, int idProducto        

        String sql = "INSERT INTO detalleCompra (cantidad, precioCosto, idCompra, idProducto) VALUES (?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dc.getCantidad());
            ps.setDouble(2, dc.getPrecioCosto());
            ps.setInt(3, dc.getCompra().getIdCompra());
            ps.setInt(4, dc.getProducto().getIdProducto());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                dc.setIdDetalle(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Detalle compra agregado con exito.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar producto: " + ex.getMessage());
        }
    }

    public DetalleCompra buscarDetalleCompra(int id) {
        DetalleCompra detalleCompra = null;
        String sql = "SELECT * FROM detallecompra WHERE idDetalle = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                CompraData cd = new CompraData();
                ProductoData pd = new ProductoData();
                detalleCompra = new DetalleCompra();
                detalleCompra.setIdDetalle(id);
                detalleCompra.setCantidad(rs.getInt("cantidad"));
                detalleCompra.setPrecioCosto(rs.getDouble("precioCosto"));
                detalleCompra.setCompra(cd.buscarCompra(rs.getInt("idCompra")));
                detalleCompra.setProducto(pd.buscarProducto(rs.getInt("idProducto")));
            } else {
                JOptionPane.showMessageDialog(null, "El detalle de compra no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de detalle de compra " + ex.getMessage());
        }

        return detalleCompra;
    }

    public List<DetalleCompra> obtenerDetalleCompra(int idCompra) {

        List<DetalleCompra> detalles = new ArrayList<>();

        String sql = "SELECT * FROM detalleCompra WHERE idCompra = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCompra);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                DetalleCompra dc = new DetalleCompra();
                CompraData cd = new CompraData();
                ProductoData pd = new ProductoData();
                dc.setIdDetalle(rs.getInt("idDetalle"));
                dc.setCantidad(rs.getInt("cantidad"));
                dc.setPrecioCosto(rs.getDouble("precioCosto"));

                Compra c = cd.buscarCompra(rs.getInt("idCompra"));

                dc.setCompra(c);

                Producto p = pd.buscarProducto(rs.getInt("idProducto"));
                dc.setProducto(p);
                detalles.add(dc);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener el Detalle: " + ex.getMessage());
        }

        return detalles;
    }

    public List<DetalleCompra> obtenerDetalleCompraPorProducto(int idProducto) {

        List<DetalleCompra> detalles = new ArrayList<>();

        String sql = "SELECT * FROM detalleCompra WHERE idProducto = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                DetalleCompra dc = new DetalleCompra();
                CompraData cd = new CompraData();
                ProductoData pd = new ProductoData();
                dc.setIdDetalle(rs.getInt("idDetalle"));
                dc.setCantidad(rs.getInt("cantidad"));
                dc.setPrecioCosto(rs.getDouble("precioCosto"));

                Compra c = cd.buscarCompra(rs.getInt("idCompra"));

                dc.setCompra(c);

                Producto p = pd.buscarProducto(rs.getInt("idProducto"));
                dc.setProducto(p);
                detalles.add(dc);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener el Detalle: " + ex.getMessage());
        }

        return detalles;
    }

    public void modificarDetalleCompra(int idDetalle, int cantidad, double precioCosto) {

        String sql = "UPDATE detalleCompra SET cantidad=?, precioCosto=?  WHERE idDetalle=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cantidad);
            ps.setDouble(2, precioCosto);
            ps.setInt(3, idDetalle);

            int filas = ps.executeUpdate();
            if (filas == 1) {

                JOptionPane.showMessageDialog(null, "Detalle de Compra modificada");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la Compra!" + ps.toString());
            }
            ps.close();//cerramos la conexion
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar Detalle de Compra: " + ex.getMessage());
        }
    }

    public void borrarDetalleCompra(int idDetalle) {

        try {

            String sql = "DELETE FROM detallecompra WHERE idDetalle =? ;";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idDetalle);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "detalle de compra eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "No existe el detalle de compra");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detallecompra " + ex.getMessage());
        }
    }

    public List<DetalleCompra> listarDetallesPorCompra(Compra compra) {
        List<DetalleCompra> detalles = new ArrayList<>();
        String sql = "SELECT * FROM detallecompra WHERE idCompra = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, compra.getIdCompra());

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    DetalleCompra dc = new DetalleCompra();
                    CompraData cd = new CompraData();
                    ProductoData pd = new ProductoData();
                    DetalleCompra detalle = new DetalleCompra();
                    detalle.setIdDetalle(rs.getInt("idDetalle"));
                    detalle.setCantidad(rs.getInt("cantidad"));
                    detalle.setPrecioCosto(rs.getDouble("precioCosto"));
                    Compra c = cd.buscarCompra(rs.getInt("idCompra"));
                    detalle.setCompra(c);
                    Producto p = pd.buscarProducto(rs.getInt("idProducto"));
                    detalle.setProducto(p);

                    detalles.add(detalle);
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detallecompra " + ex.getMessage());
        }

        return detalles;
    }
}
