package com.aluracursos.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
    private String nombre;
    private int anioDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidaEnPlan;
    private double sumaDeEvaluaciones;
    private int totalEvaluaciones;

    public Titulo(String nombre, int anioDeLanzamiento) {
        this.nombre = nombre;
        this.anioDeLanzamiento = anioDeLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnioDeLanzamiento() {
        return anioDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidaEnPlan() {
        return incluidaEnPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnioDeLanzamiento(int anioDeLanzamiento) {
        this.anioDeLanzamiento = anioDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidaEnPlan(boolean incluidaEnPlan) {
        this.incluidaEnPlan = incluidaEnPlan;
    }

    public int getTotalEvaluaciones(){
        return totalEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("Título de la película: " + nombre);
        System.out.println("Año de estreno: " + anioDeLanzamiento);
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
    }

    public void evalua(double nota){
        sumaDeEvaluaciones += nota;
        totalEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaDeEvaluaciones / totalEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
