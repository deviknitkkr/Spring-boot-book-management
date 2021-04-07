package com.devik.springbootbookmanagement.repository;

import com.devik.springbootbookmanagement.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,Long> {
}
