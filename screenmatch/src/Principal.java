import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula1 = new Pelicula();
        miPelicula1.nombre = "The Matrix";
        miPelicula1.anioDeLanzamiento = 1999;
        miPelicula1.duracionEnMinutos = 120;

        miPelicula1.muestraFichaTecnica();
        miPelicula1.evalua(9.2);
        miPelicula1.evalua(9.5);
        miPelicula1.evalua(9.3);

        System.out.println(miPelicula1.getTotalEvaluaciones());
        System.out.println(miPelicula1.calculaMedia());

    }
}
