package com.alura.conversormonedas.principal;

public class MenuInfo  {

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

    public void finalizar() {
        System.out.println("*************************************");
        System.out.println("Gracias por utilizar nuestros servicios");
        System.out.println("Proceso terminado");
        System.out.println("*************************************");
    }
}
