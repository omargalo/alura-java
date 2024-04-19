public class Pelicula {
    String nombre;
    int anioDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidaEnPlan;
    double sumaDeEvaluaciones;
    int totalEvaluaciones;

    void muestraFichaTecnica(){
        System.out.println("Título de la película: " + nombre);
        System.out.println("Año de estreno: " + anioDeLanzamiento);
        System.out.println("Duración en minutos: " + duracionEnMinutos);
    }

    void evalua(double nota){
        sumaDeEvaluaciones += nota;
        totalEvaluaciones++;
    }

    double calculaMedia(){
        return sumaDeEvaluaciones / totalEvaluaciones;
    }
}