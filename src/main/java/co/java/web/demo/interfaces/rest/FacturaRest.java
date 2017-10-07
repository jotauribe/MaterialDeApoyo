package co.java.web.demo.interfaces.rest;

import co.java.web.demo.modelo.producto.Producto;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created on 6/10/2017
 * By Jota Uribe
 **/
@Path("factura")
public class FacturaRest {

    @GET
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getFactura(@PathParam("id") String FacturaId){
        Producto p = new Producto("Nintendo 64", "Consola de videojuegos");

        return Response.ok(p).build();
    }
}
