package co.java.web.demo.modelo.factura;

import co.java.web.demo.modelo.cliente.Cliente;

import java.util.List;

/**
 * Created on 6/10/2017
 * By Jota Uribe
 **/
public class Factura {

    private String id;

    private Cliente cliente;

    private List<Detalle> detalles;

    public Factura(String id, Cliente cliente, List<Detalle> detalles) {
        this.id = id;
        this.cliente = cliente;
        this.detalles = detalles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
    }
}
