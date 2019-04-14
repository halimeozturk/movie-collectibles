package com.halbu.ear.Controller;


import com.halbu.ear.Model.Movie;
import com.halbu.ear.Service.MovieService;
import com.halbu.ear.helper.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @RequestMapping("/movie")
    public List<Movie> getAllMovie() {
        return movieService.getAllMovies();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/movie")
    public Movie addMovie(@RequestBody Movie movie) {
        movieService.addMovie(movie);
        return movie;
    }

    @DeleteMapping("/movie/{id}")
    public Response deleteMovie(@PathVariable String id) {
        movieService.deleteMovie(id);
        return new Response("200", "", "");
    }

    @GetMapping("/movie/{id}")
    public Movie getMovie(@PathVariable String id){
        return movieService.getMovie(id);
    }

    @PutMapping("/movie/{id}")
    public void updateMovie(@PathVariable String id, @RequestBody Movie movie) {
        movieService.updateMovie(id, movie.getName());
    }

}
