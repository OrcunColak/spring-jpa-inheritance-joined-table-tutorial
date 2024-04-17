package com.colak.springjpatutorial.repository;

import com.colak.springjpatutorial.jpa.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
