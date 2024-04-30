package com.alura.conversormonedas.monedas;



public class ParametrosDeConversion {
    private double cantidadACambiar;
    private double totalConversion;


    public double calculadora (double conversion_rate){
        totalConversion = cantidadACambiar * conversion_rate;
        return totalConversion;
    }


    public double getCantidadACambiar() {
        return cantidadACambiar;
    }

    public void setCantidadACambiar(int cantidadACambiar) {
        this.cantidadACambiar = cantidadACambiar;
    }

    public double getTotalConversion() {
        return totalConversion;
    }
}
