import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while(true){
            System.out.println("Escribe el nombre de la pelicula: ");
            var busqueda = lectura.nextLine();

            if(busqueda.equalsIgnoreCase("salir")){
                break;
            }

            String direccion = "http://www.omdbapi.com/?t="+
                    busqueda.replace(" ", "+")+
                    "&apikey=efd2e961";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                //Titulo miTitulo = gson.fromJson(json, Titulo.class);
                TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(miTituloOmdb);

                Titulo miTitulo = new Titulo(miTituloOmdb);
                System.out.println("Titulo convertido: " + miTitulo);

                titulos.add(miTitulo);

            }catch (NumberFormatException e) {
                System.out.println("Ocurrio un error: ");
                System.out.println(e.getMessage());
            }catch (IllegalArgumentException e){
                System.out.println("Error en la URI, verifica la dirección.");
            }catch (ErrorEnDuracionException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println(titulos);

        FileWriter escritura = new FileWriter("titulos.json");
        escritura.write(gson.toJson(titulos));
        escritura.close();

        System.out.println("Finalizo la ejecución del programa");

    }
}
