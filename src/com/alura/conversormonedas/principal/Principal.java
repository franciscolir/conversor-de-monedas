package com.alura.conversormonedas.principal;

import com.alura.conversormonedas.monedas.ConversionMoneda;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;

        Scanner ingresaOpcion = new Scanner(System.in);
        ArrayList<ConversionMoneda> listaConversion = new ArrayList<>();
        System.out.println("*************************************");
        System.out.println("Bienvenido al conversor de monedas");
        System.out.println("*************************************");

        while (opcion != 9) {
            MenuInfo menuInfo = new MenuInfo();
            ConversionMoneda consulta = new ConversionMoneda("","",1,"");
            menuInfo.menuPrincipal();
            opcion = ingresaOpcion.nextInt();

            switch (opcion) {
                case 1:
                    menuInfo.listaMonedas();
                    consulta.seleccionMonedas();
                    consulta.conversionDeMonedas();
                    listaConversion.add(consulta);

                    for (ConversionMoneda registro : listaConversion) {
                        System.out.println(registro);}
                    break;

                case 2:
                    if (listaConversion.isEmpty()){
                        System.out.println("Historial vacio");
                    }else{
                        System.out.println("Historial de conversiones");
                        for (ConversionMoneda registro : listaConversion) {
                            System.out.println(registro);
                        }}
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