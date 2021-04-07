package com.devik.springbootbookmanagement.repository;

import com.devik.springbootbookmanagement.entity.Reviewer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewerRepository extends JpaRepository<Reviewer,Long> {
}
