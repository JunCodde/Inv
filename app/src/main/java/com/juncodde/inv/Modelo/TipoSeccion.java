package com.juncodde.inv.Modelo;

public class TipoSeccion {

    String nombre, id;
    boolean isEneabled = true;

    public TipoSeccion(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public boolean isEneabled() {
        return isEneabled;
    }

    public void setEneabled(boolean eneabled) {
        isEneabled = eneabled;
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
