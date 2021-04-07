package com.devik.springbootbookmanagement;

import com.devik.springbootbookmanagement.entity.Author;
import com.devik.springbootbookmanagement.entity.Book;
import com.devik.springbootbookmanagement.entity.Publisher;
import com.devik.springbootbookmanagement.entity.Reviewer;
import com.devik.springbootbookmanagement.repository.AuthorRepository;
import com.devik.springbootbookmanagement.repository.BookRepository;
import com.devik.springbootbookmanagement.repository.PublisherRepository;
import com.devik.springbootbookmanagement.repository.ReviewerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


public class BookInjector implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private PublisherRepository publisherRepository;

    @Autowired
    private ReviewerRepository reviewerRepository;

    @Override
    public void run(String... args)  {
        Reviewer reviewer1=new Reviewer(null,"ramsingh");
        Reviewer reviewer2=new Reviewer(null,"rahul");
        Reviewer reviewer3=new Reviewer(null,"vishnu");
        reviewerRepository.save(reviewer1);
        reviewerRepository.save(reviewer2);
        reviewerRepository.save(reviewer3);


        Publisher publisher=new Publisher(null,"MC. Graw. Hill.");
        publisherRepository.save(publisher);

        Author author=new Author(null,"Vikas Choudhary");
        authorRepository.save(author);

        Book book1=new Book(null,
                "My first book on spring boot",
                authorRepository.findAll().get(0),
                publisherRepository.findAll().get(0),
                reviewerRepository.findAll()
        );

        bookRepository.save(book1);

    }
}
