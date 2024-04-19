public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula1 = new Pelicula();
        miPelicula1.nombre = "The Matrix";
        miPelicula1.anioDeLanzamiento = 1999;
        miPelicula1.duracionEnMinutos = 120;
        miPelicula1.incluidaEnPlan = true;

        miPelicula1.muestraFichaTecnica();
        miPelicula1.evalua(9.2);
        miPelicula1.evalua(9.5);

        System.out.println(miPelicula1.calculaMedia());

        Pelicula miPelicula2 = new Pelicula();
        miPelicula2.nombre = "Interstellar";
        miPelicula2.anioDeLanzamiento = 2017;
        miPelicula2.duracionEnMinutos = 120;
        miPelicula2.incluidaEnPlan = true;

        miPelicula2.muestraFichaTecnica();
        miPelicula2.evalua(8.2);
        miPelicula2.evalua(9.7);

        System.out.println(miPelicula2.calculaMedia());
    }
}
