package com.colak.springjpatutorial.repository;

import com.colak.springjpatutorial.jpa.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
