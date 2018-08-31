package com.juncodde.inv.Modelo;

public class TipoSeccion {

    String nombre, id;

    public TipoSeccion(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public TipoSeccion() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
