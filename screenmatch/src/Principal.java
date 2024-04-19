import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula1 = new Pelicula();
        miPelicula1.setNombre("The Matrix");
        miPelicula1.setAnioDeLanzamiento(1999);
        miPelicula1.setDuracionEnMinutos(120);
        miPelicula1.setIncluidaEnPlan(true);

        miPelicula1.muestraFichaTecnica();
        miPelicula1.evalua(9.2);
        miPelicula1.evalua(9.5);
        miPelicula1.evalua(9.3);

        System.out.println(miPelicula1.getTotalEvaluaciones());
        System.out.println(miPelicula1.calculaMedia());

    }
}
