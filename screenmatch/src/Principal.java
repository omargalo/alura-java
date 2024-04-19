import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula1 = new Pelicula();
        miPelicula1.setNombre("The Matrix");
        miPelicula1.setAnioDeLanzamiento(1999);
        miPelicula1.setDuracionEnMinutos(120);
        miPelicula1.setIncluidaEnPlan(true);

        Pelicula miPelicula2 = new Pelicula();
        miPelicula2.setNombre("Interestellar");
        miPelicula2.setAnioDeLanzamiento(2017);
        miPelicula2.setDuracionEnMinutos(140);
        miPelicula2.setIncluidaEnPlan(true);

        miPelicula1.muestraFichaTecnica();
        miPelicula1.evalua(9.2);
        miPelicula1.evalua(9.5);
        miPelicula1.evalua(9.3);

        System.out.println(miPelicula1.getTotalEvaluaciones());
        System.out.println(miPelicula1.calculaMedia());

        Serie betterCallSaul = new Serie();
        betterCallSaul.setNombre("Better Call Saul");
        betterCallSaul.setAnioDeLanzamiento(2021);
        betterCallSaul.setTemporadas(6);
        betterCallSaul.setMinutosPorEpisodio(40);
        betterCallSaul.setEpisodiosPorTemporada(20);
        betterCallSaul.muestraFichaTecnica();

        System.out.println(betterCallSaul.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadoraDeTiempo = new CalculadoraDeTiempo();
        calculadoraDeTiempo.incluye(miPelicula1);
        calculadoraDeTiempo.incluye(miPelicula2);
        calculadoraDeTiempo.incluye(betterCallSaul);
        System.out.println("Tiempo necesario:" + calculadoraDeTiempo.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Bandidos");
        episodio.setSerie(betterCallSaul);
        episodio.setTotalVisualizaciones(40);

        filtroRecomendacion.filtra(episodio);

        // ArrayList

        var miPelicula3 = new Pelicula();
        miPelicula3.setNombre("Lord of the Rings");
        miPelicula3.setAnioDeLanzamiento(2001);
        miPelicula3.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(miPelicula1);
        listaPeliculas.add(miPelicula2);
        listaPeliculas.add(miPelicula3);

        System.out.println("Tamaño de la lista: " + listaPeliculas.size());
        System.out.println("La primera pelicula es: " + listaPeliculas.get(0).getNombre());

        System.out.println(listaPeliculas);
        System.out.println("toString de la pelicula: " + listaPeliculas.get(0).toString());

    }
}
