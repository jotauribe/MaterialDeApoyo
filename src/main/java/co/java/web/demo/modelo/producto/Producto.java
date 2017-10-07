package co.java.web.demo.modelo.producto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * Created on 6/10/2017
 * By Jota Uribe
 **/
@Entity()
@NamedQueries({
        @NamedQuery(name = "Producto.BuscarTodos",
                query = "Select p from Producto p")
})
public class Producto {

    @Column
    private String name;

    @Column
    private String description;

    public Producto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
