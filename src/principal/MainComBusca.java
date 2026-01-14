package principal;

import br.com.screenmatch.aula.excecao.ErroDeConversaoDeAnoException;
import br.com.screenmatch.aula.modelos.Titulo;
import br.com.screenmatch.aula.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainComBusca{
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do filme para realizar busca: ");
        var busca = sc.nextLine();

        String apiKey = "c3d7a82d";
        String endereco = ("https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=" + apiKey );

        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            System.out.println(json);

            //Gson gson = new Gson();
            //Titulo meuTitulo = gson.fromJson(response.body(), Titulo.class);
            //System.out.println(meuTitulo);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TituloOmdb meuTituloOmdb = gson.fromJson(response.body(), TituloOmdb.class);
            System.out.println(meuTituloOmdb);
            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("-------- Meu titulo --------");
            System.out.println(meuTitulo);

        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento na busca, verifique o endereço");
        } catch (ErroDeConversaoDeAnoException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("O programa finalizou corretamente!");


    }

}
