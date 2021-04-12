package com.devik.springbootbookmanagement.repository;

import com.devik.springbootbookmanagement.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
