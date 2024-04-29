import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ingresaCodigo = new Scanner(System.in);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        System.out.println("*************************");
        System.out.println("Bienvenido al conversor de monedas");
        System.out.println("Elija opcion de conversion:");

        var codigoMoneda = String.valueOf(ingresaCodigo.nextLine());
        Moneda moneda = consultaMoneda.buscaMoneda(codigoMoneda);
        System.out.println(moneda);

    }
}
