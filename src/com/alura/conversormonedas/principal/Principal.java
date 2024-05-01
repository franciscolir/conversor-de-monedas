package com.alura.conversormonedas.principal;

import com.alura.conversormonedas.api.ConsultaMoneda;
import com.alura.conversormonedas.monedas.Moneda;
import com.alura.conversormonedas.monedas.ParametrosDeConversion;
import com.alura.conversormonedas.monedas.ResumenConversion;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;

        Scanner ingresaCodigo = new Scanner(System.in);
        MenuInfo menuInfo = new MenuInfo();
        menuInfo.bienvenida();

        while (opcion != 9) {
            menuInfo.menuPrincipal();
            opcion = ingresaCodigo.nextInt();
            switch (opcion) {
                case 1:
                    menuInfo.listaMonedas();
                    menuInfo.seleccionMonedas();
                    menuInfo.conversionDeMonedas();
                    menuInfo.guardaConversion();
                    break;
                case 2:
                    menuInfo.historial();

                    break;
                case 9:
                    menuInfo.finalizar();
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}