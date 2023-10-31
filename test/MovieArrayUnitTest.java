import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieArrayUnitTest {

    private final Manager manager = new Manager();

    static Movie[] movies;

    @BeforeAll
    public static void init() {
        movies = new Movie[]{
                new Movie("The Shawshank Redemption", 1994, 142, 9.3, new String[]{"Drama"}, 28341469),
                new Movie("The Godfather", 1972, 175, 9.2, new String[]{"Crime", "Drama"}, 134966411),
                new Movie("The Dark Knight", 2008, 152, 9.0, new String[]{"Action", "Crime", "Drama"}, 534858444),
                new Movie("Schindler's List", 1993, 195, 9.0, new String[]{"Biography", "Drama", "History"}, 96898818),
                new Movie("The Lord of the Rings: The Return of the King", 2003, 201, 9.0, new String[]{"Action", "Adventure", "Drama"}, 377845905),
                new Movie("12 Angry Men", 1957, 96, 9.0, new String[]{"Crime", "Drama"}, 4360000),
                new Movie("The Godfather Part II", 1974, 202, 9.0, new String[]{"Crime", "Drama"}, 57300000),
                new Movie("Pulp Fiction", 1994, 154, 8.9, new String[]{"Crime", "Drama"}, 107928762),
                new Movie("Fight Club", 1999, 139, 8.8, new String[]{"Drama"}, 37030102),
                new Movie("Inception", 2010, 148, 8.8, new String[]{"Action", "Adventure", "Sci-Fi"}, 292576195),
                new Movie("The Lord of the Rings: The Fellowship of the Ring", 2001, 178, 8.8, new String[]{"Action", "Adventure", "Drama"}, 315544750),
                new Movie("Forrest Gump", 1994, 142, 8.8, new String[]{"Drama", "Romance"}, 330252182),
                new Movie("The Good, the Bad and the Ugly", 1966, 178, 8.8, new String[]{"Adventure", "Western"}, 6100000),
                new Movie("The Lord of the Rings: The Two Towers", 2002, 179, 8.8, new String[]{"Action", "Adventure", "Drama"}, 342551365),
                new Movie("Spider-Man: Across the Spider-Verse", 2023, 140, 8.7, new String[]{"Animation", "Action", "Adventure"}, 0),
                new Movie("Interstellar", 2014, 169, 8.7, new String[]{"Adventure", "Drama", "Sci-Fi"}, 188020017),
                new Movie("Goodfellas", 1990, 145, 8.7, new String[]{"Biography", "Crime", "Drama"}, 46836394),
                new Movie("The Matrix", 1999, 136, 8.7, new String[]{"Action", "Sci-Fi"}, 171479930),
                new Movie("One Flew Over the Cuckoo's Nest", 1975, 133, 8.7, new String[]{"Drama"}, 112000000),
                new Movie("Star Wars: Episode V - The Empire Strikes Back", 1980, 124, 8.7, new String[]{"Action", "Adventure", "Fantasy"}, 290475067),
                new Movie("The Silence of the Lambs", 1991, 118, 8.6, new String[]{"Crime", "Drama", "Thriller"}, 130742922),
                new Movie("Se7en", 1995, 127, 8.6, new String[]{"Crime", "Drama", "Mystery"}, 100125643),
                new Movie("Saving Private Ryan", 1998, 169, 8.6, new String[]{"Drama", "War"}, 216540909),
                new Movie("Star Wars: Episode IV - A New Hope", 1977, 121, 8.6, new String[]{"Action", "Adventure", "Fantasy"}, 322740140),
                new Movie("The Green Mile", 1999, 189, 8.6, new String[]{"Crime", "Drama", "Fantasy"}, 136801374),
                new Movie("Spirited Away", 2001, 125, 8.6, new String[]{"Animation", "Adventure", "Family"}, 10055859),
                new Movie("City of God", 2002, 130, 8.6, new String[]{"Crime", "Drama"}, 7563397),
                new Movie("Terminator 2: Judgment Day", 1991, 137, 8.6, new String[]{"Action", "Sci-Fi"}, 204843350),
                new Movie("Life Is Beautiful", 1997, 116, 8.6, new String[]{"Comedy", "Drama", "Romance"}, 57598247),
                new Movie("It's a Wonderful Life", 1946, 130, 8.6, new String[]{"Drama", "Family", "Fantasy"}, 0),
                new Movie("Seven Samurai", 1954, 207, 8.6, new String[]{"Action", "Drama"}, 269061),
                new Movie("Harakiri", 1962, 133, 8.6, new String[]{"Action", "Drama", "Mystery"}, 0),
                new Movie("Oppenheimer", 2023, 180, 8.5, new String[]{"Biography", "Drama", "History"}, 0),
                new Movie("The Departed", 2006, 151, 8.5, new String[]{"Crime", "Drama", "Thriller"}, 132384315),
                new Movie("Back to the Future", 1985, 116, 8.5, new String[]{"Adventure", "Comedy", "Sci-Fi"}, 210609762),
                new Movie("Gladiator", 2000, 155, 8.5, new String[]{"Action", "Adventure", "Drama"}, 187705427),
                new Movie("Alien", 1979, 117, 8.5, new String[]{"Horror", "Sci-Fi"}, 78900000),
                new Movie("Parasite", 2019, 132, 8.5, new String[]{"Drama", "Thriller"}, 53367844),
                new Movie("The Prestige", 2006, 130, 8.5, new String[]{"Drama", "Mystery", "Sci-Fi"}, 53089891),
                new Movie("Django Unchained", 2012, 165, 8.5, new String[]{"Drama", "Western"}, 162805434),
                new Movie("Psycho", 1960, 109, 8.5, new String[]{"Horror", "Mystery", "Thriller"}, 32000000),
                new Movie("Whiplash", 2014, 106, 8.5, new String[]{"Drama", "Music"}, 13092000),
                new Movie("Léon: The Professional", 1994, 110, 8.5, new String[]{"Action", "Crime", "Drama"}, 19501238),
                new Movie("The Pianist", 2002, 150, 8.5, new String[]{"Biography", "Drama", "Music"}, 32572577),
                new Movie("The Usual Suspects", 1995, 106, 8.5, new String[]{"Crime", "Drama", "Mystery"}, 23341568),
                new Movie("The Lion King", 1994, 88, 8.5, new String[]{"Animation", "Adventure", "Drama"}, 422783777),
                new Movie("American History X", 1998, 119, 8.5, new String[]{"Crime", "Drama"}, 6719864),
                new Movie("The Intouchables", 2011, 112, 8.5, new String[]{"Biography", "Comedy", "Drama"}, 13182281),
                new Movie("Casablanca", 1942, 102, 8.5, new String[]{"Drama", "Romance", "War"}, 1024560),
                new Movie("Once Upon a Time in the West", 1968, 165, 8.5, new String[]{"Western"}, 5321508),
                new Movie("Grave of the Fireflies", 1988, 89, 8.5, new String[]{"Animation", "Drama", "War"}, 0),
                new Movie("Rear Window", 1954, 112, 8.5, new String[]{"Mystery", "Thriller"}, 36764313),
                new Movie("Cinema Paradiso", 1988, 155, 8.5, new String[]{"Drama", "Romance"}, 11990401),
                new Movie("Modern Times", 1936, 87, 8.5, new String[]{"Comedy", "Drama", "Romance"}, 163245),
                new Movie("City Lights", 1931, 87, 8.5, new String[]{"Comedy", "Drama", "Romance"}, 19181),
                new Movie("The Shining", 1980, 146, 8.4, new String[]{"Drama", "Horror"}, 44017374),
                new Movie("Joker", 2019, 122, 8.4, new String[]{"Crime", "Drama", "Thriller"}, 335451311),
                new Movie("Avengers: Endgame", 2019, 181, 8.4, new String[]{"Action", "Adventure", "Drama"}, 858373000),
                new Movie("Inglourious Basterds", 2009, 153, 8.4, new String[]{"Adventure", "Drama", "War"}, 120540719),
                new Movie("Apocalypse Now", 1979, 147, 8.4, new String[]{"Drama", "Mystery", "War"}, 83471511),
                new Movie("Spider-Man: Into the Spider-Verse", 2018, 117, 8.4, new String[]{"Animation", "Action", "Adventure"}, 190241310),
                new Movie("Coco", 2017, 105, 8.4, new String[]{"Animation", "Adventure", "Drama"}, 209726015),
                new Movie("Come and See", 1985, 142, 8.4, new String[]{"Drama", "Thriller", "War"}, 0),
                new Movie("Oldboy", 2003, 120, 8.4, new String[]{"Action", "Drama", "Mystery"}, 707481),
                new Movie("Aliens", 1986, 137, 8.4, new String[]{"Action", "Adventure", "Sci-Fi"}, 85160248),
                new Movie("The Dark Knight Rises", 2012, 164, 8.4, new String[]{"Action", "Drama", "Thriller"}, 448139099),
                new Movie("Memento", 2000, 113, 8.4, new String[]{"Mystery", "Thriller"}, 25544867),
                new Movie("Raiders of the Lost Ark", 1981, 115, 8.4, new String[]{"Action", "Adventure"}, 248159971),
                new Movie("Avengers: Infinity War", 2018, 149, 8.4, new String[]{"Action", "Adventure", "Sci-Fi"}, 678815482),
                new Movie("Amadeus", 1984, 160, 8.4, new String[]{"Biography", "Drama", "Music"}, 51973029),
                new Movie("Your Name.", 2016, 106, 8.4, new String[]{"Animation", "Drama", "Fantasy"}, 5017246),
                new Movie("3 Idiots", 2009, 170, 8.4, new String[]{"Comedy", "Drama"}, 6532908),
                new Movie("WALL·E", 2008, 98, 8.4, new String[]{"Animation", "Adventure", "Family"}, 223808164),
                new Movie("The Lives of Others", 2006, 137, 8.4, new String[]{"Drama", "Mystery", "Thriller"}, 11286112),
                new Movie("Dr. Strangelove or: How I Learned to Stop Worrying and Love the Bomb", 1964, 95, 8.4, new String[]{"Comedy", "War"}, 275902),
                new Movie("Capernaum", 2018, 126, 8.4, new String[]{"Drama"}, 1661096),
                new Movie("Das Boot", 1981, 149, 8.4, new String[]{"Drama", "War"}, 11487676),
                new Movie("Sunset Blvd.", 1950, 110, 8.4, new String[]{"Drama", "Film-Noir"}, 0),
                new Movie("The Great Dictator", 1940, 125, 8.4, new String[]{"Comedy", "Drama", "War"}, 288475),
                new Movie("Paths of Glory", 1957, 88, 8.4, new String[]{"Drama", "War"}, 0),
                new Movie("Witness for the Prosecution", 1957, 116, 8.4, new String[]{"Crime", "Drama", "Mystery"}, 8175000),
                new Movie("High and Low", 1963, 143, 8.4, new String[]{"Crime", "Drama", "Mystery"}, 0),
                new Movie("American Beauty", 1999, 122, 8.3, new String[]{"Drama"}, 130096601),
                new Movie("Good Will Hunting", 1997, 126, 8.3, new String[]{"Drama", "Romance"}, 138433435),
                new Movie("Requiem for a Dream", 2000, 102, 8.3, new String[]{"Drama"}, 3635482),
                new Movie("Once Upon a Time in America", 1984, 229, 8.3, new String[]{"Crime", "Drama"}, 5321508),
                new Movie("Eternal Sunshine of the Spotless Mind", 2004, 108, 8.3, new String[]{"Drama", "Romance", "Sci-Fi"}, 34400301),
                new Movie("2001: A Space Odyssey", 1968, 149, 8.3, new String[]{"Adventure", "Sci-Fi"}, 56954992),
                new Movie("Braveheart", 1995, 178, 8.3, new String[]{"Biography", "Drama", "History"}, 75600000),
                new Movie("The Hunt", 2012, 115, 8.3, new String[]{"Drama"}, 687185),
                new Movie("Reservoir Dogs", 1992, 99, 8.3, new String[]{"Crime", "Thriller"}, 2832029),
                new Movie("Toy Story", 1995, 81, 8.3, new String[]{"Animation", "Adventure", "Comedy"}, 191796233),
                new Movie("Lawrence of Arabia", 1962, 218, 8.3, new String[]{"Adventure", "Biography", "Drama"}, 44824144),
                new Movie("Star Wars: Episode VI - Return of the Jedi", 1983, 131, 8.3, new String[]{"Action", "Adventure", "Fantasy"}, 309125409),
                new Movie("Princess Mononoke", 1997, 134, 8.3, new String[]{"Animation", "Action", "Adventure"}, 2375308),
                new Movie("Toy Story 3", 2010, 103, 8.3, new String[]{"Animation", "Adventure", "Comedy"}, 415004880),
                new Movie("Citizen Kane", 1941, 119, 8.3, new String[]{"Drama", "Mystery"}, 1585634),
                new Movie("Singin' in the Rain", 1952, 103, 8.3, new String[]{"Comedy", "Musical", "Romance"}, 8819028),
                new Movie("M", 1931, 99, 8.3, new String[]{"Crime", "Mystery", "Thriller"}, 28877),
                new Movie("Ikiru", 1952, 143, 8.3, new String[]{"Drama"}, 55240),
        };
    }

    @Test
    public void findMovieWithLongestTitle() {
        Movie result = manager.findMovieWithLongestTitle(movies);
        Movie expected = movies[74];
        assertEquals(expected, result);
    }

    @Test
    public void findMovieWithMostGenres() {
        Movie result = manager.findMovieWithMostGenres(movies);
        assertEquals(3, result.genres.length);
    }

    @Test
    public void getAmountOfMoviesInYearRange() {
        int startYear = 2000;
        int endYear = 2023;
        int result = manager.getAmountOfMoviesInYearRange(movies, startYear, endYear);
        int expected = 36;
        assertEquals(expected, result);
    }

    @Test
    public void calculateAverageDurationInYearRange() {
        double result = manager.calculateAverageDurationInYearRange(movies, 2000, 2020);
        double expected = 137.41176470588235;
        assertEquals(expected, result);
    }

    @Test
    public void findHighestAndLowestRatings() {
        double[] result = manager.findHighestAndLowestRatings(movies);
        assertEquals(8.3, result[0]);
        assertEquals(9.3, result[1]);
    }

    @Test
    public void findMoviesByRating() {
        Movie[] result = manager.findMoviesByRating(movies, 8.5);
        int expected = 23;
        assertEquals(expected, result.length);
    }

    @Test
    public void findMostPopularGenre() {
        String result = manager.findMostPopularGenre(movies);
        String expected = "Drama";
        assertEquals(expected, result);
    }

    @Test
    public void getAllGenres() {
        String[] result = manager.getAllGenres(movies);
        String[] expected = {"Drama", "Crime", "Action", "Biography", "History", "Adventure", "Sci-Fi", "Romance", "Western", "Animation", "Fantasy", "Thriller", "Mystery", "War", "Family", "Comedy", "Horror", "Music", "Film-Noir", "Musical"};
        assertEquals(expected.length, result.length);
        assertArrayEquals(expected, result);
    }
}

