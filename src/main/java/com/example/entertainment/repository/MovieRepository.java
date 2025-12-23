package com.example.entertainment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entertainment.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
