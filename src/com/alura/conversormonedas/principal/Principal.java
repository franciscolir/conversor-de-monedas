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
     MenuInfo menuInfo = new MenuInfo();
     menuInfo.bienvenida();
        int opcion = 0;
        while (opcion != 9) {
            menuInfo.menuPrincipal();
            opcion = ingresaCodigo.nextInt();
            switch (opcion) {
                case 1:
                    menuInfo.listaMonedas();
                    menuInfo.seleccionMonedas();
                    menuInfo.conversionDeMonedas();
                    break;
                case 2:
                    System.out.println("opcion2");
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
            }
            }

            }



