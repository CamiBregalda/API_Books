package cch_books;

import cch_books.http.ClienteHttp;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ClienteHttp cliente = new ClienteHttp();
        String resposta = cliente.buscaDados("https://www.googleapis.com/books/v1/volumes?q=QUERY");
        //System.out.println(resposta);

        extrairDados(resposta);
    }

    public static void extrairDados(String json) {
        JSONObject jsonObject = new JSONObject(json);
        JSONArray itensJson = jsonObject.optJSONArray("items");

        if (itensJson != null) {
            for (int i = 0; i < itensJson.length(); i++) {
                JSONObject item = itensJson.getJSONObject(i);
                String id = item.optString("id", "ID não disponível");
                JSONObject volumeInfo = item.optJSONObject("volumeInfo");
                JSONObject saleInfo = item.optJSONObject("saleInfo");
                JSONObject accessInfo = item.optJSONObject("accessInfo");

                System.out.println("id: " + id);

                if (volumeInfo != null){
                    List<String> autores = new ArrayList<>();

                    String titulo = volumeInfo.optString("title", "Título não disponível");
                    String publisher = volumeInfo.optString("publisher", "Editora não disponível");
                    String descricao = volumeInfo.optString("description", "Descrição não disponível");
                    String linguagem = volumeInfo.optString("language", "Linguagem não disponível");

                    JSONArray autoresJson = volumeInfo.optJSONArray("authors");
                    if (autoresJson != null) {
                        for (int j = 0; j < autoresJson.length(); j++) {
                            autores.add(autoresJson.getString(j));
                        }
                    }

                    if (autores.isEmpty()){
                        autores.add("Autores Desconhecidos");
                    }
                    /*
                    System.out.println("Titulo: " + titulo);
                    System.out.println("Autores: " + autores);
                    System.out.println("Descrição: " + descricao);*/
                }

                if (saleInfo != null){
                    String pais = saleInfo.optString("country");

                    //System.out.println("País: " + pais);

                    if (saleInfo.has("listPrice")) {
                        JSONObject listPrice = saleInfo.getJSONArray("offers").getJSONObject(0).optJSONObject("listPrice");
                        if (listPrice != null) {
                            double preco = listPrice.optDouble("amountInMicros", 0.0) / 1000000.0;
                            String codigo = listPrice.optString("currencyCode", "Código não encontrado");

                            System.out.println("Preço: " + preco);
                            System.out.println("Código: " + codigo);
                        }
                    }
                }

                if (accessInfo != null){
                    boolean pdfDisponivel = accessInfo.optJSONObject("pdf").optBoolean("isAvailable", false);
                    boolean ePubDisponivel = accessInfo.optJSONObject("epub").optBoolean("isAvailable", false);

                    //System.out.println("PDF disponível: " + pdfDisponivel);
                    //System.out.println("EPub disponível: " + ePubDisponivel);
                }


                //Para buscar mais informações de determinado livro
                //cliente.buscaDados("https://www.googleapis.com/books/v1/volumes/" + id);
            }
        }
    }
}
