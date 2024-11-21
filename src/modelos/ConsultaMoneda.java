package src;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    private String ApiUrl = "https://v6.exchangerate-api.com/v6/";
    private String ApiKey = "846ba281a880aab7b61ce7be";
    public Moneda buscarMoneda(String CodigoMoneda) {
        String direccion = ApiUrl + ApiKey + "/latest/" + CodigoMoneda;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse <String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
    }
}
