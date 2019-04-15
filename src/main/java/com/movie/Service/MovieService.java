package com.movie.Service;

import com.movie.Model.Movie;
import com.movie.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        List<Movie> movie = new ArrayList<>();
        movieRepository.findAll().forEach(movie::add);
        return movie;
    }

    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }

    public Movie getMovie(String id) {
        return movieRepository.findById(id).orElse(null);
    }

    public void updateMovie(String id, String name) {
        movieRepository.setMovieUpdate(id, name);

    }

    public void deleteMovie(String id) {
        movieRepository.deleteById(id);
    }

}
