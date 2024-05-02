package com.alura.conversormonedas.principal;

import com.alura.conversormonedas.api.ConsultaMoneda;
import com.alura.conversormonedas.monedas.Moneda;
import com.alura.conversormonedas.monedas.ParametrosDeConversion;
import com.alura.conversormonedas.monedas.ResumenConversion;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuInfo  {
    //ArrayList<ResumenConversion> listaConversion = new ArrayList<>();
    //Scanner ingresaCodigo = new Scanner(System.in);
    //ConsultaMoneda consultaMoneda = new ConsultaMoneda();
    //ParametrosDeConversion parametros = new ParametrosDeConversion();
    //ResumenConversion resumen = new ResumenConversion("","",1,"");



    public void listaMonedas() {
        System.out.println("""
                Monedas disponibles:
                                
                Dolar USA       --> USD
                Real Brasileño  --> BRL
                Peso Argentino  --> ARS
                Peso Chileno    --> CLP
                Euro            --> EUR
                """);
    }

    public void menuPrincipal() {
        System.out.println("""
                                
                Menu inicial:
                                
                1-Convertir moneda
                2-Hisotial de conversiones
                9-Salir
                """);
    }

   /* public void seleccionMonedas() {
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
        parametros.calculadora(moneda.conversion_rate());
        setTotal(parametros.getCantidadACambiar() + " " + getMonedaBase() + " equivalen a : " + parametros.getTotalConversion() + " " + getMonedaACambiar());
        System.out.println(getTotal());
        System.out.println("fecha conversion: " + moneda.time_last_update_utc());
        listaConversion.add(resumen);
        System.out.println("Cantidad de conversiones: " + listaConversion.size());
        System.out.println("imprimir conversiones");
        for (ResumenConversion registro : listaConversion) {
            System.out.println(registro);
        }
    }

    public void guardaConversion() {

        System.out.println("contenido a guardar en array: lo cambie recien");
        listaConversion.add(resumen);
        System.out.println("Cantidad de conversiones: " + listaConversion.size());
        System.out.println("imprimir conversiones");
        for (ResumenConversion registro : listaConversion) {
            System.out.println(registro);
    }}


    public void historial() {
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
                    }}
    }*/

    public void finalizar() {
        System.out.println("*************************************");
        System.out.println("Gracias por utilizar nuestros servicios");
        System.out.println("Proceso terminado");
        System.out.println("*************************************");
    }
}
