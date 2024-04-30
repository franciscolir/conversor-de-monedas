package com.alura.conversormonedas.monedas;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ParametrosDeConversion {
    private double cantidadACambiar;
    private double totalConversion;
    private LocalDateTime tiempo;


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

    public LocalDateTime getTiempo() {
        return tiempo;
    }

}
