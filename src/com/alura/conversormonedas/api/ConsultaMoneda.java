package com.alura.conversormonedas.api;

import com.alura.conversormonedas.monedas.Moneda;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Moneda buscaMoneda(String monedaBase, String monedaACambiar){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/2c96ba538649f25e91cee6d9/pair/"+monedaBase+"/"+monedaACambiar+"/");

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();


            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            System.out.println("No se pudo realizar la conversion");
            throw new RuntimeException("No se pudo hacer la conversion" + e);
        }
    }
}
