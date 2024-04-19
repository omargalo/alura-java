import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

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


    }
}
