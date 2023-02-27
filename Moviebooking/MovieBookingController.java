package Moviebooking;
import java.util.List;

import Moviedetails.Movie;
import Moviedetails.Showtime;
import Movietheatre.MovieBookingView;

public class MovieBookingController {
    private List<Movie> movies;
    private MovieBookingView view;

    public MovieBookingController(List<Movie> movies, MovieBookingView view) {
        this.movies = movies;
        this.view = view;
    }

    public void start() {
        view.showMovies(movies);
        int movieIndex = view.getSelectedMovieIndex();
        Movie selectedMovie = movies.get(movieIndex);

        view.showShowtimes(selectedMovie.getShowtimes());
        int showtimeIndex = view.getSelectedShowtimeIndex();
        Showtime selectedShowtime = selectedMovie.getShowtimes().get(showtimeIndex);

        int numSeats = view.getNumSeats();
        String customerName = view.getCustomerName();

        boolean success = selectedShowtime.bookSeats(numSeats, customerName);
        if (success) {
            System.out.println("Booking successful!");
        } else {
            System.out.println("Booking failed: not enough seats available");
        }
    }
}

 