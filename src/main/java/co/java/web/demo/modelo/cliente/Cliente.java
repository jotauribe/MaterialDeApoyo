package co.java.web.demo.modelo.cliente;

/**
 * Created on 6/10/2017
 * By Jota Uribe
 **/
public class Cliente {

    private String id;

    private String name;

    public Cliente(String name, String id) {

        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
