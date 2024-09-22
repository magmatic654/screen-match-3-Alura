import com.aluracursos.screenmatch.models.Movie;
import com.aluracursos.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.setName("Encanto");
        myMovie.setReleaseDate(2021);
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


        Serie houseOfDragons = new Serie();
        houseOfDragons.setName("La casa del dragón");
        houseOfDragons.setReleaseDate(2022);
        houseOfDragons.setSeasons(1);
        houseOfDragons.setMinutesForEpisode(50);
        houseOfDragons.setEpisodiesForSeason(10);
        System.out.println(houseOfDragons.getLengthInMinutes());
        houseOfDragons.showTechnicalSheet();









//        com.aluracursos.screenmatch.models.Film otherFilm = new com.aluracursos.screenmatch.models.Film();
//        otherFilm.name  = "Matrix";
//        otherFilm.releaseDate = 1998;
//        otherFilm.lengthInMinutes = 180;
//
//        otherFilm.showTechnicalSheet();

    }
}
