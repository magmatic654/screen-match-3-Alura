package com.aluracursos.screenmatch.main;

import com.aluracursos.screenmatch.calculations.CalculatorOfTime;
import com.aluracursos.screenmatch.calculations.RecomendationFilter;
import com.aluracursos.screenmatch.models.Episode;
import com.aluracursos.screenmatch.models.Movie;
import com.aluracursos.screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Encanto", 2021);
        myMovie.setLengthInMinutes(120);
        myMovie.setIsinclude(true);

        myMovie.showTechnicalSheet();
        myMovie.evaluate(10);
        myMovie.evaluate(10);
        myMovie.evaluate(7.4);
        System.out.println(myMovie.getTotalEvaluations());
        System.out.println(myMovie.getSumEvaluations());
        System.out.println(myMovie.calculateAverage());

        System.out.println(myMovie.getName());
        System.out.println(myMovie.getReleaseDate());
        System.out.println(myMovie.getLengthInMinutes());

        Serie houseOfDragons = new Serie("La casa del dragon", 2022);
        houseOfDragons.setSeasons(1);
        houseOfDragons.setMinutesForEpisode(50);
        houseOfDragons.setEpisodiesForSeason(10);
        System.out.println(houseOfDragons.getLengthInMinutes());
        houseOfDragons.showTechnicalSheet();

        Movie otherMovie = new Movie("Matrix", 1998);
        otherMovie.setLengthInMinutes(180);
        otherMovie.showTechnicalSheet();

        CalculatorOfTime calculator = new CalculatorOfTime();
        calculator.includes(myMovie);
        calculator.includes(houseOfDragons);
        calculator.includes(otherMovie);
        System.out.println("Tiempo necesario para ver tus titulos favoritos : "
                + calculator.getTotalTime()
                + " minutos");

        RecomendationFilter recomendationFilter = new RecomendationFilter();
        recomendationFilter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setName("La casa Targayren");
        episode.setSerie(houseOfDragons);
        episode.setTotalVisualizations(50);

        recomendationFilter.filter(episode);

        var haroldMovie = new Movie("Alice in Wonderland", 2010);
        haroldMovie.setDirector("Tim Burton");
        haroldMovie.setLengthInMinutes(108);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(haroldMovie);
        movieList.add(myMovie);
        movieList.add(otherMovie);

        System.out.println("Tamaño de la lista: " + movieList.size());
        System.out.println("toString de la pelicula: " + movieList.get(0).toString());
        System.out.println(movieList);
        System.out.println("La primera pelicula es: " + movieList.get(0).toString());

        System.out.println("Peliculas:");
        for (int i = 0; i < movieList.size(); i++){
            System.out.println(i+1 + ". " +movieList.get(i).getName());
        }
    }
}
