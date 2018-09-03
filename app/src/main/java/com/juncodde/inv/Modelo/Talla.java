package com.juncodde.inv.Modelo;

public class Talla {

    String talla;
    boolean isEneabled = true;

    public Talla(String talla) {
        this.talla = talla;
    }

    public Talla() {
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public boolean isEneabled() {
        return isEneabled;
    }

    public void setEneabled(boolean eneabled) {
        isEneabled = eneabled;
    }
}
