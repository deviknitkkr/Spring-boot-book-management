package com.devik.springbootbookmanagement.exception;

public class ReviewerNotFoundException extends Exception{
    public ReviewerNotFoundException(String message) {
        super(message);
    }
}