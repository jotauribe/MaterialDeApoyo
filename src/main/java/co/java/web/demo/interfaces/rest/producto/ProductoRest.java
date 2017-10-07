package co.java.web.demo.interfaces.rest;

import co.java.web.demo.modelo.producto.Producto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created on 6/10/2017
 * By Jota Uribe
 **/
@Path("producto")
public class ProductoRest {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProducto(){
        Producto p = new Producto("Nintendo 64", "Consola de video juegos");
        return Response.ok(p).build();
    }

}
