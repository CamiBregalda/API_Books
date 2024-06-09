package cch_books.http;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class ClienteHttp {
    public String buscaDados(String url){
        try{
            URI endereco = URI.create(url);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException ex){
            throw new RuntimeException(ex);
        }
    }
    
    public static void baixarImagem(String imageUrl) {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(imageUrl))
                .GET()
                .build();

        try {
            HttpResponse<byte[]> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofByteArray());
            if (httpResponse.statusCode() == 200) {
                FileOutputStream fileOutputStream = new FileOutputStream("thumbnail.jpg");
                fileOutputStream.write(httpResponse.body());
                fileOutputStream.close();

                System.out.println("Imagem baixada com sucesso.");
            } else {
                System.out.println("Falha ao baixar a imagem. Código de status: " + httpResponse.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
