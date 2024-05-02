package com.alura.conversormonedas.principal;

import com.alura.conversormonedas.monedas.ParametrosDeConversion;
import com.alura.conversormonedas.monedas.ResumenConversion;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;

        Scanner ingresaOpcion = new Scanner(System.in);
        ArrayList<ResumenConversion> listaConversion = new ArrayList<>();
        System.out.println("*************************************");
        System.out.println("Bienvenido al conversor de monedas");
        System.out.println("*************************************");

        while (opcion != 9) {
            ParametrosDeConversion parametros = new ParametrosDeConversion();
            MenuInfo menuInfo = new MenuInfo();

            ResumenConversion consulta = new ResumenConversion("","",1,"");
            menuInfo.menuPrincipal();
            opcion = ingresaOpcion.nextInt();

            switch (opcion) {
                case 1:
                    menuInfo.listaMonedas();
                    consulta.seleccionMonedas();
                    consulta.conversionDeMonedas();
                    System.out.println("contenido a guardar en array: lo cambie recien");
                    listaConversion.add(consulta);
                    System.out.println("Cantidad de conversiones: " + listaConversion.size());
                    System.out.println("imprimir conversiones");
                    for (ResumenConversion registro : listaConversion) {
                        System.out.println(registro);}
                    //menuInfo.guardaConversion();
                    break;

                case 2:
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
                        }}
                    //consulta.historial();

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