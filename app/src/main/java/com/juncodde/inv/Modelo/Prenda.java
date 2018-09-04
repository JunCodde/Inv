package com.juncodde.inv.Modelo;

import android.text.format.Time;

public class Prenda {

    String tipo, subTipo, genero, marca, time = getTime(), id;
    float prcVenta, prcCompra, talla, cantInv;


    public Prenda(String tipo, String subTipo, String genero, String marca, String id, float prcVenta, float prcCompra, float talla, float cantInv) {
        this.tipo = tipo;
        this.subTipo = subTipo;
        this.genero = genero;
        this.marca = marca;
        this.id = id;
        this.prcVenta = prcVenta;
        this.prcCompra = prcCompra;
        this.talla = talla;
        this.cantInv = cantInv;
    }

    public Prenda() {
    }

    public float getCantInv() {
        return cantInv;
    }

    public void setCantInv(float cantInv) {
        this.cantInv = cantInv;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSubTipo() {
        return subTipo;
    }

    public void setSubTipo(String subTipo) {
        this.subTipo = subTipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getPrcVenta() {
        return prcVenta;
    }

    public void setPrcVenta(float prcVenta) {
        this.prcVenta = prcVenta;
    }

    public float getPrcCompra() {
        return prcCompra;
    }

    public void setPrcCompra(float prcCompra) {
        this.prcCompra = prcCompra;
    }

    public float getTalla() {
        return talla;
    }

    public void setTalla(float talla) {
        this.talla = talla;
    }

    public String getTime(){
        String tiempo = "";

        Time now = new Time();
        now.setToNow();

        tiempo = now.monthDay + "/" + now.month + "/" + now.year + "-" + now.format("%k:%M:%S");


        return tiempo;
    }

}
