public class Movie {
    String title;
    int releaseYear;
    int duration;
    double rating;
    String[] genres;
    int boxOffice;

    public Movie(String title, int releaseYear, int runtime, double rating, String[] genres, int boxOffice) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.duration = runtime;
        this.rating = rating;
        this.genres = genres;
        this.boxOffice = boxOffice;
    }
}
