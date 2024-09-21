package com.aluracursos.screenmatch.models;

public class Film {
    public String name;
    public int releaseDate;
    public int lengthInMinutes;
    public boolean Isinclude;
    private double sumEvaluations;
    private int totalEvaluations;

    public int getTotalEvaluations(){
        return totalEvaluations;
    }

   public double getSumEvaluations(){
        return sumEvaluations;
    }

    public void showTechnicalSheet(){
        System.out.println("El nombre de la pelicula es: " + name);
        System.out.println("Su fecha de lanzamiento es: " + releaseDate);
        System.out.println("Duracion en minutos: " + lengthInMinutes);
    }

    public void evaluate(double note){
        sumEvaluations += note;
        totalEvaluations ++;
    }

    public double calculateAverage(){
        return sumEvaluations / totalEvaluations;
    }

}
