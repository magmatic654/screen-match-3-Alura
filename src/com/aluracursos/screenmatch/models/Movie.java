package com.aluracursos.screenmatch.models;
import com.aluracursos.screenmatch.calculations.Clasification;

public class Movie extends Title implements Clasification {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasification(){
        return (int) calculateAverage() / 2;
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getName() + " (" + getReleaseDate() + ")";
    }
}
