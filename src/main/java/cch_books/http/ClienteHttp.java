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
    
    // Método estático para baixar uma imagem de uma URL especificada e retornar os dados da imagem como um array de bytes.
    public static byte[] baixarImagem(String imageUrl) throws IOException {
        // Cria uma nova instância do HttpClient.
        HttpClient client = HttpClient.newHttpClient();

        // Cria uma nova solicitação HTTP GET para a URL da imagem.
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(imageUrl)) // Define a URI da solicitação a partir da URL fornecida.
                .GET() // Define o método HTTP como GET.
                .build(); // Constrói a solicitação.

        try {
            // Envia a solicitação HTTP e espera pela resposta, que é a imagem na forma de um array de bytes.
            HttpResponse<byte[]> response = client.send(request, HttpResponse.BodyHandlers.ofByteArray());

            // Verifica se a solicitação foi bem-sucedida (código de status HTTP 200).
            if (response.statusCode() == 200) {
                // Retorna o corpo da resposta como um array de bytes.
                return response.body();
            } else {
                // Lança uma exceção se o código de status não for 200 (indica falha na solicitação HTTP).
                throw new IOException("Falha na solicitação HTTP. Código de status: " + response.statusCode());
            }
        } catch(InterruptedException e){
            // Lança uma exceção se a operação for interrompida.
            throw new IOException(e);
        }
    }
}
