import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class ConsultaMoneda {

    public Moneda buscaMoneda(String codigoMoneda){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/2c96ba538649f25e91cee6d9/latest/"+codigoMoneda+"/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("No se pudo hace consulta"+e);
        }
    }
}
