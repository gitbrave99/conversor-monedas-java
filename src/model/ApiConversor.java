package model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConversor {

    public String cargarData(String currency){
        String clave = "COLOQUE AQUI SU CLAVE DE OMDb";
        String direccion = "https://v6.exchangerate-api.com/v6/f12b1b7041383c15cfa910f7/latest/"+currency.trim().toUpperCase();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = null;

        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return response.body();
        //Gson gson = new Gson();
        //Gson gson = new GsonBuilder().create();
        //ApiModel apiModel= gson.fromJson(response.body(), ApiModel.class);
        //ApiJSON apiModel= gson.fromJson(response.body(), ApiJSON.class);
        //System.out.println(response.body());
        //System.out.println(apiModel.toString());
    }

}
