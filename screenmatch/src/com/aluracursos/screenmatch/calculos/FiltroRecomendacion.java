package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Muy bien calificado");
        }else if (clasificacion.getClasificacion() >= 2){
            System.out.println("Popular");
        }else {
            System.out.println("Puedes esperar para ver esta");
        }
    }
}
