
package sistemadecompras;

import AccesoADatos.CompraData;
import AccesoADatos.DetalleCompraData;
import AccesoADatos.ProductoData;
import AccesoADatos.ProveedorData;
import Entidades.Compra;
import Entidades.DetalleCompra;
import Entidades.Producto;
import Entidades.Proveedor;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Hernán Funes
 */
public class SistemaDeCompras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PRUEBAS
        ProductoData pd = new ProductoData();
        ProveedorData prd = new ProveedorData();
        CompraData cd = new CompraData();
        DetalleCompraData dcd = new DetalleCompraData();
       


        
        //AGREGAR -- CREATE
       // String nombreProducto, String descripcion, double precioActual, int stock, boolean estado
//        Producto productoPrueba = new Producto("Producto de Prueba", "test", 800, 100, true);
//        System.out.println(productoPrueba);
//        pd.guardarProducto(productoPrueba);
        
        

        //LEER -- READ
//        System.out.println(pd.listarProductos());

        //MODIFICAR --UPDATE
//        Producto productoPrueba = new Producto(1, "Coca Cola", "gaseosa 2,5L", 900, 60, true);
//        pd.modificarProducto(productoPrueba);

        //BORRAR -- DELETE
//        pd.borrarProducto(1);




  //public Proveedor(String razonSocial, String domicilio, String telefono, boolean estado) 
  
         //AGREGAR -- CREATE
//         Proveedor proveedorPrueba = new Proveedor ("Arcor", "c/Las Tarimas 86", "2664151614", true);
//         System.out.println(proveedorPrueba);
//         prd.guardarProveedor(proveedorPrueba);
         
//         //MODIFICAR --UPDATE
//         Proveedor proveedorPrueba = new Proveedor (1,"San Gines", "c/Las Tarimas 80", "2664151615", true);
//        prd.modificarProveedor(proveedorPrueba);
//        
//         //BORRAR -- DELETE
//         prd.eliminarProveedor(proveedorPrueba);
         

   //  public Compra(int idCompra, Proveedor proovedor, LocalDate fecha, boolean estado, double Oferta )
   // DetalleCompra    (int idDetalle, int cantidad, double precioCosto, Compra compra, Producto producto)

           //AGREGAR -- CREATE
           
//            Compra compraPrueba = new Compra (new Proveedor (2,"Arcor", "c/Las Tarimas 86", "2664151614", true), LocalDate.of(2004, 12, 18),true);
//            cd.guardarCompra(compraPrueba);
                      
//           DetalleCompra dc = new DetalleCompra(12, 18.60, cd.buscarCompra(4), pd.buscarProducto(3));
//           dcd.guardarDetalleCompra(dc);
//           
            //

            //int idCompra, Proveedor proveedor, LocalDate fecha, boolean estado 
           //MODIFICAR --UPDATE
//           Compra compraModificada = new Compra(4, prd.buscarProveedor(2), LocalDate.of(2023, 12, 18), false );
//           cd.modificarCompra(compraModificada);
           
           //modifica cantidad y precio
//           dcd.modificarDetalleCompra(14, 7, 15.60); 

           //BORRAR -- DELETE
//           dcd.borrarDetalleCompra(4);
           
    }
    
}
