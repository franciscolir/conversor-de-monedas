package com.alura.conversormonedas.monedas;

import java.util.ArrayList;

public class ResumenConversion {
    private String monedaBase;
    private String monedaACambiar;
    private int cantidad;
    private String total;

    public ResumenConversion(String monedaBase, String monedaACambiar, int cantidad, String total) {
        this.monedaBase = monedaBase;
        this.monedaACambiar = monedaACambiar;
        this.cantidad = cantidad;
        this.total = total;
    }

    public ResumenConversion() {

    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public void setMonedaBase(String monedaBase) {
        this.monedaBase = monedaBase;
    }

    public String getMonedaACambiar() {
        return monedaACambiar;
    }

    public void setMonedaACambiar(String monedaACambiar) {
        this.monedaACambiar = monedaACambiar;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ResumenConversion :" +
                "monedaBase='" + monedaBase + '\'' +
                ", monedaACambiar='" + monedaACambiar + '\'' +
                ", cantidad=" + cantidad +
                ", total='" + total + '\'' +
                '}';
    }

}


