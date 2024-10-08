package com.aluracursos.screenmatch.main;

import com.aluracursos.screenmatch.models.Movie;
import com.aluracursos.screenmatch.models.Serie;
import com.aluracursos.screenmatch.models.Title;

import java.util.ArrayList;
import java.util.Collections;

public class MainWithLists {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Encanto", 2021);
        myMovie.evaluate(9.5);
        Movie otherMovie = new Movie("Matrix", 1998);
        otherMovie.evaluate(8.8);
        var haroldMovie = new Movie("Alice in Wonderland", 2010);
        haroldMovie.evaluate(10);
        Serie houseOfDragons = new Serie("La casa del dragon", 2022);

        Movie p1 = haroldMovie;

        ArrayList<Title> list = new ArrayList<>();
        list.add(myMovie);
        list.add(otherMovie);
        list.add(haroldMovie);
        list.add(houseOfDragons);

        for (Title item: list){
            System.out.println(item.getName());
            if(item instanceof Movie movie && movie.getClasification() > 2){
                System.out.println(movie.getClasification());
            }
        }
        ArrayList<String> listArtists = new ArrayList<>();
        listArtists.add("Harold Navarro");
        listArtists.add("Antonio Banderas");
        listArtists.add("Ricardo Darin");

        System.out.println("Lista de artistas No ordenada" + listArtists);

        Collections.sort(listArtists);
        System.out.println("Lista de artistas ordenada" + listArtists);

        Collections.sort(list);
        System.out.println("Lista de titulos ordenados: "+list);
    }
}
