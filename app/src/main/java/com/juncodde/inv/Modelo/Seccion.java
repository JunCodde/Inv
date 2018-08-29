package com.juncodde.inv.Modelo;

public class Seccion {

    private String nombre, precio;
    private int foto;

    public Seccion(String nombre, String precio, int foto) {
        this.nombre = nombre;
        this.precio = precio;
        this.foto = foto;
    }

    public Seccion() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
