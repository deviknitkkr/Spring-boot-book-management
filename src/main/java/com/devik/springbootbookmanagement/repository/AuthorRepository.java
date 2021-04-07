package com.devik.springbootbookmanagement.repository;

import com.devik.springbootbookmanagement.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
