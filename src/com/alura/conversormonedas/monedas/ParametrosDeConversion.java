package com.alura.conversormonedas.monedas;


import java.time.LocalDate;
public class ParametrosDeConversion {
    private double cantidadACambiar;
    private double totalConversion;
    private LocalDate fechaConversion = LocalDate.now();

    public LocalDate getFechaConversion() {
        return fechaConversion;
    }

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
