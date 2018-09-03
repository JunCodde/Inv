package com.juncodde.inv.Modelo;

public class TipoSeccion {

    String nombre, id ;
    boolean isEneabled = true, isSub = true;

    public TipoSeccion(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public TipoSeccion(String nombre, String id,  boolean isSub) {
        this.nombre = nombre;
        this.id = id;
        this.isSub = isSub;
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

    public boolean isSub() {
        return isSub;
    }

    public void setSub(boolean sub) {
        isSub = sub;
    }
}
