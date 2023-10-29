
package sistemadecompras;

import AccesoADatos.ProductoData;
import Entidades.Producto;

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
        
        //AGREGAR -- CREATE
        //String nombreProducto, String descripcion, double precioActual, int stock, boolean estado
//        Producto productoPrueba = new Producto("Producto de Prueba", "test", 800, 100, true);
//        System.out.println(productoPrueba);
//        pd.guardarProducto(productoPrueba);

        //LEER -- READ
        System.out.println(pd.listarProductos());

        //MODIFICAR --UPDATE
//        Producto productoPrueba = new Producto(1, "Coca Cola", "gaseosa 2,5L", 900, 60, true);
//        pd.modificarProducto(productoPrueba);

        //BORRAR -- DELETE
//        pd.borrarProducto(1);
    }
    
}
