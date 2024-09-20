public class Film {
    String name;
    int releaseDate;
    int lengthInMinutes;
    boolean Isinclude;
    private double sumEvaluations;
    private int totalEvaluations;

    int getTotalEvaluations(){
        return totalEvaluations;
    }

    double getSumEvaluations(){
        return sumEvaluations;
    }

    void showTechnicalSheet(){
        System.out.println("El nombre de la pelicula es: " + name);
        System.out.println("Su fecha de lanzamiento es: " + releaseDate);
        System.out.println("Duracion en minutos: " + lengthInMinutes);
    }

    void evaluate(double note){
        sumEvaluations += note;
        totalEvaluations ++;
    }

    double calculateAverage(){
        return sumEvaluations / totalEvaluations;
    }

}
