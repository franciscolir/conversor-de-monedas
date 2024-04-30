package com.alura.conversormonedas.principal;

import com.alura.conversormonedas.api.ConsultaMoneda;
import com.alura.conversormonedas.monedas.Moneda;
import com.alura.conversormonedas.monedas.ParametrosDeConversion;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ingresaCodigo = new Scanner(System.in);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        ParametrosDeConversion parametros = new ParametrosDeConversion();
        System.out.println("*************************");
        System.out.println("Bienvenido al conversor de monedas");
        System.out.println("Elija opcion de conversion segun monedas disponibles:");
        System.out.println("***");
        System.out.println("""
                """ +
                "USD --- Dólar Estadounidense\n" +
                "                ARS --- Peso Argentino\n" +
                "                BRL --- Real Brasileño\n" +
                "                COP --- Peso Colombiano\n" +
                "                EUR --- Euro\"\"\"");

        System.out.println("Ingrese moneda base");
        var monedaBase = String.valueOf(ingresaCodigo.nextLine());
        System.out.println("Ingrese moneda a cambiar");
        var monedaACambiar =String.valueOf(ingresaCodigo.nextLine());
        System.out.println("Ingrese cantidad a cambiar");
        var cantidad = Integer.valueOf(ingresaCodigo.nextInt());
        parametros.setCantidadACambiar(cantidad);

        Moneda moneda = consultaMoneda.buscaMoneda(monedaBase,monedaACambiar);
        parametros.calculadora(moneda.conversion_rate());
        System.out.println(moneda);
        System.out.println(monedaBase);
        System.out.println(monedaACambiar);
        System.out.println(moneda.conversion_rate());
        System.out.println(cantidad+monedaBase+" equivalen a : "+parametros.getTotalConversion()+monedaACambiar);
        System.out.println("fecha conversion: "+parametros.getTiempo());

    }
}
