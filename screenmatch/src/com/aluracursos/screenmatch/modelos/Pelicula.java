package com.aluracursos.screenmatch.modelos;

public class Pelicula {
    public String nombre;
    int anioDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidaEnPlan;
    private double sumaDeEvaluaciones;
    private int totalEvaluaciones;

    public int getTotalEvaluaciones(){
        return totalEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("Título de la película: " + nombre);
        System.out.println("Año de estreno: " + anioDeLanzamiento);
        System.out.println("Duración en minutos: " + duracionEnMinutos);
    }

    public void evalua(double nota){
        sumaDeEvaluaciones += nota;
        totalEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaDeEvaluaciones / totalEvaluaciones;
    }
}