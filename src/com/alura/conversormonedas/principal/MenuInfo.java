package com.alura.conversormonedas.principal;

import com.alura.conversormonedas.api.ConsultaMoneda;
import com.alura.conversormonedas.monedas.Moneda;
import com.alura.conversormonedas.monedas.ParametrosDeConversion;

import java.util.Scanner;

public class MenuInfo {

    String monedaBase;
    String monedaACambiar;

    Scanner ingresaCodigo = new Scanner(System.in);
    ConsultaMoneda consultaMoneda = new ConsultaMoneda();
    ParametrosDeConversion parametros = new ParametrosDeConversion();
    public void bienvenida(){
        System.out.println("*************************************");
        System.out.println("Bienvenido al conversor de monedas");
        System.out.println("*************************************");
    }


    public void listaMonedas (){
        System.out.println("""
                Monedas disponibles:
                
                Dolar USA       --> USD
                Real Brasileño  --> BRL
                Peso Argentino  --> ARS
                Peso Chileno    --> CLP
                Euro            --> EUR
                """);
    }
    public void menuPrincipal(){
        System.out.println("""
                
                Menu inicial:
                
                1-Convertir moneda
                2-Hisotial de conversiones
                9-Salir
                """);
        }
    public void seleccionMonedas() {
        System.out.println("Ingrese codigo de moneda inicial:");
        monedaBase = ingresaCodigo.nextLine().toUpperCase();
        System.out.println("Ingrese moneda a cambiar");
        monedaACambiar = ingresaCodigo.nextLine().toUpperCase();
        System.out.println("Ingrese cantidad a cambiar");
        var cantidad = Integer.valueOf(ingresaCodigo.nextInt());
        parametros.setCantidadACambiar(cantidad);

    }
    public void conversionDeMonedas(){

        Moneda moneda = consultaMoneda.buscaMoneda(monedaBase, monedaACambiar);
        parametros.calculadora(moneda.conversion_rate());
        System.out.println(parametros.getCantidadACambiar() + " " + monedaBase + " equivalen a : " + parametros.getTotalConversion() + " " + monedaACambiar);
        System.out.println("fecha conversion: " + moneda.time_last_update_utc());
    }
}