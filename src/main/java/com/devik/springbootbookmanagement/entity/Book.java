package com.devik.springbootbookmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue
    private Long bookId;
    private String bookName;

    @ManyToOne
    private Author bookAuthor;

    @ManyToOne
    private Publisher bookPublisher;

    @ManyToMany
    private List<Reviewer> bookReviewers;

}
