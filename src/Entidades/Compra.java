/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Hernán Funes
 */
public class Compra {
    
    private int idCompra;
    private Proveedor proovedor;
    private LocalDate fecha;

    public Compra(int idCompra, Proveedor proovedor, LocalDate fecha) {
        this.idCompra = idCompra;
        this.proovedor = proovedor;
        this.fecha = fecha;
    }

    public Compra(Proveedor proovedor, LocalDate fecha) {
        this.proovedor = proovedor;
        this.fecha = fecha;
    }

    public Compra() {
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Proveedor getProovedor() {
        return proovedor;
    }

    public void setProovedor(Proveedor proovedor) {
        this.proovedor = proovedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", proovedor=" + proovedor + ", fecha=" + fecha + '}';
    }
    
    
    
}
