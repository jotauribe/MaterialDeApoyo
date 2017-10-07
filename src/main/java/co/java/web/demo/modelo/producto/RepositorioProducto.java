package co.java.web.demo.modelo.producto;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created on 6/10/2017
 * By Jota Uribe
 **/


@ApplicationScoped
public class RepositorioProducto {

    @PersistenceContext
    EntityManager entityManager;

    public RepositorioProducto() {
    }

    public void guardar(Producto producto){
        entityManager.persist(producto);
    }

    public List<Producto> buscarTodos(){

        return entityManager
                .createNamedQuery("Producto.BuscarTodos", Producto.class)
                .getResultList();
    }
}
