package co.java.web.demo.modelo.cliente;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created on 6/10/2017
 * By Jota Uribe
 **/

@ApplicationScoped
public class RepositorioCliente {

    @PersistenceContext
    private EntityManager entityManager;

    public RepositorioCliente() {
    }

    public void guardarCliente(Cliente cliente){
        entityManager.persist(cliente);
    }


}
