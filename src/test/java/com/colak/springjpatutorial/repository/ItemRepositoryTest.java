package com.colak.springjpatutorial.repository;

import com.colak.springjpatutorial.jpa.Book;
import com.colak.springjpatutorial.jpa.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ItemRepositoryTest {
    @Autowired
    private ItemRepository repository;

    @Test
    void findById() {
        // SELECT
        // i.id AS item_id,
        // CASE
        //  WHEN b.id IS NOT NULL THEN 1 -- If there is a match in the book table for the given item (i.id), set item_type to 1
        //  WHEN m.id IS NOT NULL THEN 2 -- If there is a match in the movie table for the given item (i.id), set item_type to 2
        //  WHEN i.id IS NOT NULL THEN 0 -- If there is no match in either the book or movie table for the given item (i.id), set item_type to 0.
        // END AS item_type,
        // i.item_name,
        // b.author,
        // b.isbn,
        // m.director,
        // m.duration
        // FROM
        //   items i
        // LEFT JOIN
        //  book b ON i.id = b.id
        // LEFT JOIN
        //  movie m ON i.id = m.id
        // WHERE
        //  i.id = ?;
        Optional<Item> optional = repository.findById(1L);
        assertThat(optional).isNotEmpty();
        assertThat(optional.get()).isExactlyInstanceOf(Book.class);

        optional = repository.findById(5L);
        assertThat(optional).isNotEmpty();
        assertThat(optional.get()).isExactlyInstanceOf(Item.class);
    }
}
