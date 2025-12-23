package com.example.entertainment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.entertainment.entity.Movie;
import com.example.entertainment.repository.MovieRepository;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin("*")
public class MovieController {

    @Autowired
    private MovieRepository repository;

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        return repository.save(movie);
    }

    @GetMapping
    public List<Movie> getAllMovies() {
        return repository.findAll();
    }
}
