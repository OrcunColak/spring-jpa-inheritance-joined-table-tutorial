package com.colak.springjpatutorial.repository;

import com.colak.springjpatutorial.jpa.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
