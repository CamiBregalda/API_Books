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
    
    public static byte[] baixarImagem(String imageUrl) throws IOException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(imageUrl)) 
                .GET() 
                .build(); 
        try {
            HttpResponse<byte[]> response = client.send(request, HttpResponse.BodyHandlers.ofByteArray());

            if (response.statusCode() == 200) {
                return response.body();
            } else {
                throw new IOException("Falha na solicitação HTTP. Código de status: " + response.statusCode());
            }
        } catch(InterruptedException e){
            throw new IOException(e);
        }
    }
}
