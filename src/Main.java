import com.aluracursos.screenmatch.calculations.CalculatorOfTime;
import com.aluracursos.screenmatch.calculations.RecomendationFilter;
import com.aluracursos.screenmatch.models.Episode;
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

        Movie otherMovie = new Movie();
        otherMovie.setName("Matrix");
        otherMovie.setReleaseDate(1998);
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

        var haroldMovie = new Movie();
    }
}
