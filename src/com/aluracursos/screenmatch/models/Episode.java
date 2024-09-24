package com.aluracursos.screenmatch.models;

import com.aluracursos.screenmatch.calculations.Clasification;

public class Episode implements Clasification {
    private int number;
    private String name;
    private Serie serie;
    private int totalVisualizations;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualizations() {
        return totalVisualizations;
    }

    public void setTotalVisualizations(int totalVisualizations) {
        this.totalVisualizations = totalVisualizations;
    }

    @Override
    public int getClasification() {
        if (totalVisualizations >= 100){
            return 4;
        }else{
            return 2;
        }
    }
}
