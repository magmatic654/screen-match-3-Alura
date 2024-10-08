package com.aluracursos.screenmatch.models;

public class Title implements Comparable<Title>{
    public boolean calculateAverage;
    private String name;
    private int releaseDate;
    private int lengthInMinutes;
    private boolean isInclude;
    private double sumEvaluations;
    private int totalEvaluations;

    public Title (String name, int releaseDate){
        this.name = name;
        this.releaseDate = releaseDate;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate){
        this.releaseDate = releaseDate;
    }

    public void setLengthInMinutes(int lengthInMinutes){
        this.lengthInMinutes = lengthInMinutes;
    }

    public void setIsinclude(boolean isInclude) {
        this.isInclude = isInclude;
    }

    public int getTotalEvaluations(){
        return totalEvaluations;
    }

    public double getSumEvaluations(){
        return sumEvaluations;
    }

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public boolean isInclude() {
        return isInclude;
    }

    public void showTechnicalSheet(){
        System.out.println("El nombre de la pelicula es: " + name);
        System.out.println("Su fecha de lanzamiento es: " + releaseDate);
        System.out.println("Duracion en minutos: " + getLengthInMinutes());
    }

    public void evaluate(double note){
        sumEvaluations += note;
        totalEvaluations ++;
    }

    public double calculateAverage(){
        return sumEvaluations / totalEvaluations;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }
}
