package com.alura.conversormonedas.principal;

import com.alura.conversormonedas.api.ConsultaMoneda;
import com.alura.conversormonedas.monedas.Moneda;
import com.alura.conversormonedas.monedas.ParametrosDeConversion;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner ingresaCodigo = new Scanner(System.in);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        ParametrosDeConversion parametros = new ParametrosDeConversion();
        System.out.println("*************************************");
        System.out.println("Bienvenido al conversor de monedas");
        System.out.println("********");
        System.out.println("""
                Menu inicial:
                
                1-Convertir moneda
                2-Hisotial de conversiones
                9-Salir
                """);
        while (opcion != 9)

            opcion = ingresaCodigo.nextInt();

        var monedaBase = String.valueOf(ingresaCodigo.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese codigo de moneda inicial:");
                    System.out.println("""
                Dolar USA       --> USD
                Real Brasileño  --> BRL
                Peso Argentino  --> ARS
                Peso Chileno    --> CLP
                Euro            --> EUR
                """);
                    System.out.println("Ingrese moneda a cambiar");
                    var monedaACambiar = String.valueOf(ingresaCodigo.nextLine());
                    System.out.println("Ingrese cantidad a cambiar");
                    var cantidad = Integer.valueOf(ingresaCodigo.nextInt());
                    parametros.setCantidadACambiar(cantidad);
                    Moneda moneda = consultaMoneda.buscaMoneda(monedaBase, monedaACambiar);
                    parametros.calculadora(moneda.conversion_rate());
                    System.out.println(parametros.getCantidadACambiar() + monedaBase + " equivalen a : " + parametros.getTotalConversion() + monedaACambiar);
                    System.out.println("fecha conversion: " + moneda.time_last_update_utc());
                case 2:
                case 9:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;

                default:
                    System.out.println("Opcion no valida");

            }
            }

            }



