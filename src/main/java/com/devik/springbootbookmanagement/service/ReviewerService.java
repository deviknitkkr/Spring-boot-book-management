package com.devik.springbootbookmanagement.service;

import com.devik.springbootbookmanagement.repository.ReviewerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewerService {
    @Autowired
    private ReviewerRepository reviewerRepository;
}
