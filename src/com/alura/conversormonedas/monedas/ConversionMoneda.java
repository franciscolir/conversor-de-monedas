package com.alura.conversormonedas.monedas;

import com.alura.conversormonedas.api.ConsultaMoneda;
import java.util.Scanner;

public class ConversionMoneda {
    private String monedaBase;
    private String monedaACambiar;
    private int cantidad;
    private String total;


    public ConversionMoneda(String monedaBase, String monedaACambiar, int cantidad, String total) {
        this.monedaBase = monedaBase;
        this.monedaACambiar = monedaACambiar;
        this.cantidad = cantidad;
        this.total = total;
    }
    Scanner ingresaCodigo = new Scanner(System.in);
    ConsultaMoneda consultaMoneda = new ConsultaMoneda();
    ParametrosDeConversion parametros = new ParametrosDeConversion();

      public void setMonedaBase(String monedaBase) {
        this.monedaBase = monedaBase;
    }

    public void setMonedaACambiar(String monedaACambiar) {
        this.monedaACambiar = monedaACambiar;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void seleccionMonedas() {
        System.out.println("Ingrese codigo de moneda inicial:");

        setMonedaBase(ingresaCodigo.nextLine().toUpperCase());
        System.out.println("Ingrese moneda a cambiar");

        setMonedaACambiar(ingresaCodigo.nextLine().toUpperCase());
        System.out.println("Ingrese cantidad a cambiar");
        setCantidad(ingresaCodigo.nextInt());
        parametros.setCantidadACambiar(cantidad);
    }
    public void conversionDeMonedas() {

        Moneda moneda = consultaMoneda.buscaMoneda(monedaBase, monedaACambiar);
        parametros.calculadora(moneda.conversion_rate());
        System.out.println("*************************************");
        setTotal(parametros.getCantidadACambiar() + " " + monedaBase + " equivalen a : " + parametros.getTotalConversion() + " " + monedaACambiar);
        System.out.println(total);
        System.out.println("fecha conversion: " + moneda.time_last_update_utc());
    }

    @Override
    public String toString() {
        return "******************************* '\n'"  +
                "Moneda base: " + monedaBase + "'\n'"+
                "Moneda a cambiar: " + monedaACambiar +"'\n'"+
                "Cantidad: " + cantidad +"'\n'"+
                "Total: " + total;
    }
}


