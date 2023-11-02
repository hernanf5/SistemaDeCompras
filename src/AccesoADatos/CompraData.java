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

/**
 *
 * @author Hernán Funes
 */
public class CompraData {
private Connection  con = null;
public CompraData() {
    con = Conexion.getCon();
}


void aplicarOferta (Compra Compra)  {
    try{
        String sql = "SELECT compra c JOIN detallecompra d ON (c.idCompra = d.idCompra) WHERE c.idCompra = ? ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, Compra.getIdCompra());
        
    }catch(SQLException ex){
        
    }
    
    

}
    
    
    
}
