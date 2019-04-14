package com.halbu.ear.Service;

import com.halbu.ear.Model.Movie;
import com.halbu.ear.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        List<Movie> users = new ArrayList<>();
        movieRepository.findAll().forEach(users::add);
        return users;
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
