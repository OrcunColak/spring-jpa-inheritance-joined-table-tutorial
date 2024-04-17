package com.colak.springjpainheritancetutorial.repository;

import com.colak.springjpainheritancetutorial.jpa.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BookRepositoryTest {
    @Autowired
    private BookRepository repository;

    @Test
    void findById() {
        // select from book b join items i on b.id=i.id where b.id=?
        Optional<Book> optional = repository.findById(1L);
		assertThat(optional).isNotEmpty();
        assertThat(optional.get().getItemName()).isEqualTo("Book 1");
    }
}
