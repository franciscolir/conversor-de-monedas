package com.alura.conversormonedas.monedas;


import com.alura.conversormonedas.api.ConsultaMoneda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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
    //List<ResumenConversion> listaConversion = new LinkedList<>();
    Scanner ingresaCodigo = new Scanner(System.in);
    ConsultaMoneda consultaMoneda = new ConsultaMoneda();
    ParametrosDeConversion parametros = new ParametrosDeConversion();
    //Moneda moneda = consultaMoneda.buscaMoneda(getMonedaBase(), getMonedaACambiar());


    public void seleccionMonedas() {
        System.out.println("Ingrese codigo de moneda inicial:");

        setMonedaBase(ingresaCodigo.nextLine().toUpperCase());
        System.out.println("Ingrese moneda a cambiar");

        setMonedaACambiar(ingresaCodigo.nextLine().toUpperCase());
        System.out.println("Ingrese cantidad a cambiar");
        setCantidad(ingresaCodigo.nextInt());
        parametros.setCantidadACambiar(getCantidad());
    }

    public void conversionDeMonedas() {

        Moneda moneda = consultaMoneda.buscaMoneda(getMonedaBase(), getMonedaACambiar());
        //ResumenConversion consulta = new ResumenConversion(monedaBase, monedaACambiar, cantidad, total);
        parametros.calculadora(moneda.conversion_rate());
        setTotal(parametros.getCantidadACambiar() + " " + getMonedaBase() + " equivalen a : " + parametros.getTotalConversion() + " " + getMonedaACambiar());
        System.out.println(getTotal());
        System.out.println("fecha conversion: " + moneda.time_last_update_utc());
        //listaConversion.add(consulta);
        //System.out.println("Cantidad de conversiones: " + listaConversion.size());
        //System.out.println("imprimir conversiones");
        //for (ResumenConversion registro : listaConversion) {
          //  System.out.println(registro);
        //}
    }
/*
    public void guardaConversion() {

        System.out.println("contenido a guardar en array: lo cambie recien");
        listaConversion.add(resumen);
        System.out.println("Cantidad de conversiones: " + listaConversion.size());
        System.out.println("imprimir conversiones");
        for (ResumenConversion registro : listaConversion) {
            System.out.println(registro);
    }}*/

/*
    public void historial() {
        System.out.println(listaConversion);
        if (listaConversion.isEmpty()){
                    System.out.println("Historial vacio");
                }else{
                    System.out.println("Historial de conversiones");
                    for (ResumenConversion registro : listaConversion) {
                        //System.out.println("*************************************");
                        System.out.println(registro);
                        //System.out.println("moneda a cambiar: " + getMonedaACambiar());
                        //System.out.println("cantidad a cambiar: " + getCantidad());
                        //System.out.println("total de la conversion: " + getTotal());
                        //System.out.println("*************************************");
                        //}
                    }}}*/

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
        return "Resumen de la conversión: [Moneda base: " + monedaBase + ", Moneda a cambiar: " + monedaACambiar + ", Cantidad: " + cantidad + ", Total: " + total + "]";
    }
}


