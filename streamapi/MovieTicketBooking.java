package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 Movie Booking Platform – Trending Movies

A list of movies contains title, language, rating, and releaseYear.
Find movies released after 2020, rating >= 8, from Hindi language, then sort by rating, and pick top 5.

 */

public class MovieTicketBooking {
public static void main(String[] args) {
	 List<Movie> movies = Arrays.asList(
             new Movie("KGF 2", "Hindi", 8.5, 2022),
             new Movie("Pushpa", "Hindi", 8.1, 2021),
             new Movie("Jawan", "Hindi", 7.8, 2023),
             new Movie("Pathaan", "Hindi", 7.9, 2023),
             new Movie("Sooryavanshi", "Hindi", 6.8, 2021),
             new Movie("Brahmastra", "Hindi", 6.9, 2022),
             new Movie("The Kashmir Files", "Hindi", 8.3, 2022),
             new Movie("OMG 2", "Hindi", 8.0, 2023),
             new Movie("12th Fail", "Hindi", 9.1, 2023),
             new Movie("Drishyam 2", "Hindi", 8.4, 2022),

             new Movie("RRR", "Telugu", 8.5, 2022),
             new Movie("Leo", "Tamil", 7.4, 2023),
             new Movie("Master", "Tamil", 7.8, 2021),
             new Movie("Vikram", "Tamil", 8.3, 2022),
             new Movie("Kantara", "Kannada", 8.6, 2022),

             new Movie("Gadar 2", "Hindi", 6.7, 2023),
             new Movie("Animal", "Hindi", 7.3, 2023),
             new Movie("Article 370", "Hindi", 8.0, 2024),
             new Movie("Salaar", "Hindi", 7.1, 2023),
             new Movie("Fighter", "Hindi", 7.5, 2024)
     );
	 
	 List<Movie> topFiveMovie=movies.stream().filter(m->m.getReleaseYear()>2020)
			 .filter(m->m.getLanguage().equals("Hindi"))
			 .filter(m->m.getRating()>=8)
			 .sorted(Comparator.comparingDouble(Movie::getRating).reversed())
			 .collect(Collectors.toList());
	 topFiveMovie.forEach(System.out::println);
}
}


class Movie {
    private String title;
    private String language;
    private double rating;
    private int releaseYear;

    public Movie(String title, String language, double rating, int releaseYear) {
        this.title = title;
        this.language = language;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getLanguage() {
        return language;
    }

    public double getRating() {
        return rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return title + " (" + releaseYear + ") - Rating: " + rating;
    }
}
