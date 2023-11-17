
package Entidades;

/**
 *
 * @author Hernán Funes
 */
public class Producto {
    private int idProducto;
    private String nombreProducto;
    private String descripcion;
    private double precioActual;
    private int stock;
    private int stockMinimo;
    private boolean estado;

    public Producto(int idProducto, String nombreProducto, String descripcion, double precioActual, int stock, int stockMinimo, boolean estado) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioActual = precioActual;
        this.stock = stock;
        this.stockMinimo = stockMinimo;
        this.estado = estado;
    }

    public Producto(String nombreProducto, String descripcion, double precioActual, int stock, int stockMinimo, boolean estado) {
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioActual = precioActual;
        this.stock = stock;
        this.stockMinimo = stockMinimo;
        this.estado = estado;
    }

    public Producto() {
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcio) {
        this.descripcion = descripcio;
    }

    public double getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombreProducto + " " + descripcion ;
    }


    
    
}
