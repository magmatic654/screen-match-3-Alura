public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.name = "Encanto";
        myFilm.releaseDate = 2021;
        myFilm.lengthInMinutes = 120;

        myFilm.showTechnicalSheet();
        myFilm.evaluate(7.6);
        myFilm.evaluate(10);

        System.out.println(myFilm.sumEvaluations);
        System.out.println(myFilm.totalEvaluations);
        System.out.println(myFilm.calculateAverage());

        Film otherFilm = new Film();
        otherFilm.name  = "Matrix";
        otherFilm.releaseDate = 1998;
        otherFilm.lengthInMinutes = 180;

//        otherFilm.showTechnicalSheet();

    }
}
