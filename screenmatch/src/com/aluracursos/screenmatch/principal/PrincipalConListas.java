package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula1 = new Pelicula("The Matrix", 1999);
        miPelicula1.evalua(9);
        Pelicula miPelicula2 = new Pelicula("Interestellar", 2017);
        miPelicula2.evalua(8);
        var miPelicula3 = new Pelicula("lord of the Rings", 2001);
        miPelicula3.evalua(10);
        Serie betterCallSaul = new Serie("Better Call Saul", 2021);


        List<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula1);
        lista.add(miPelicula2);
        lista.add(miPelicula3);
        lista.add(betterCallSaul);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            // Nueva funcuionalidad desde Java 14, && Java 17
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){
                // Pelicula pelicula = (Pelicula) item;
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaArtistas = new ArrayList<>();
        listaArtistas.add("Cindy Crawford");
        listaArtistas.add("Catherine Z Jones");
        listaArtistas.add("Brad Pitt");
        listaArtistas.add("Antonio Banderas");
        System.out.println("Artistas no ordenada: " + listaArtistas);

        Collections.sort(listaArtistas);
        System.out.println("Artistas ordenados: " + listaArtistas);

        Collections.sort(lista);
        System.out.println("Pelicuals ordenadas: " + lista);

        lista.sort(Comparator.comparing(Titulo::getAnioDeLanzamiento));
        System.out.println("Lista ordenada por fecha: " + lista);


    }
}
