package com.alura.conversormonedas.monedas;

import com.alura.conversormonedas.api.ConsultaMoneda;
import java.util.Scanner;

public class ConversionMoneda {
    private String monedaBase;
    private String monedaACambiar;
    private int cantidad;
    private String total;
    private String error = "error";


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
        System.out.println("Ingrese codigo de moneda a cambiar");

        setMonedaACambiar(ingresaCodigo.nextLine().toUpperCase());
        System.out.println("Ingrese cantidad a cambiar");
        while (!ingresaCodigo.hasNextInt()) {
            System.out.println("Por favor, introduce solo números.'\n'" +
                    "Indique cantidad:");
            ingresaCodigo.next();
        }
        setCantidad(ingresaCodigo.nextInt());
        parametros.setCantidadACambiar(cantidad);
    }
    public void conversionDeMonedas() {

        Moneda moneda = consultaMoneda.buscaMoneda(monedaBase, monedaACambiar);
        if (moneda.result().equals(error)){
            System.out.println("Codigo erroneo. Intente nuevamente");
        }else {
            parametros.calculadora(moneda.conversion_rate());
            System.out.println("*************************************");
            setTotal(parametros.getCantidadACambiar() + " " + monedaBase + " equivalen a : " + parametros.getTotalConversion() + " " + monedaACambiar);
            System.out.println(total);
            System.out.println("Fecha de conversion: " + parametros.getFechaConversion());
        }
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


