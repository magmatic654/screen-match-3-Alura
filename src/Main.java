import com.aluracursos.screenmatch.models.Film;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.name = "Encanto";
        myFilm.releaseDate = 2021;
        myFilm.lengthInMinutes = 120;

        myFilm.showTechnicalSheet();
        myFilm.evaluate(10);
        myFilm.evaluate(10);
        myFilm.evaluate(7.4);
        System.out.println(myFilm.getTotalEvaluations());
        System.out.println(myFilm.getSumEvaluations());
        System.out.println(myFilm.calculateAverage());







//        com.aluracursos.screenmatch.models.Film otherFilm = new com.aluracursos.screenmatch.models.Film();
//        otherFilm.name  = "Matrix";
//        otherFilm.releaseDate = 1998;
//        otherFilm.lengthInMinutes = 180;
//
//        otherFilm.showTechnicalSheet();

    }
}
