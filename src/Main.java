public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.name = "Encanto";
        myFilm.releaseDate = 2021;
        myFilm.lengthInMinutes = 120;

        System.out.println("Mi pelicula es: " + myFilm.name);
        System.out.println("Su fecha de lanzamiento es: " + myFilm.releaseDate);

        Film otherFilm = new Film();
        otherFilm.name  = "Matrix";
        otherFilm.releaseDate = 1998;
        otherFilm.lengthInMinutes = 180;

        System.out.println("Mi pelicula es: " + otherFilm.name);
        System.out.println("Su fecha de lanzamiento es: " + otherFilm.releaseDate);

    }
}
