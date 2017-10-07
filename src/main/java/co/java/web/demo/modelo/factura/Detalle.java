package co.java.web.demo.modelo.factura;

import co.java.web.demo.modelo.producto.Producto;

/**
 * Created on 6/10/2017
 * By Jota Uribe
 **/
public class Detalle {

    private Producto producto;

    private double cantidad;

    public Detalle(Producto producto, double cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
