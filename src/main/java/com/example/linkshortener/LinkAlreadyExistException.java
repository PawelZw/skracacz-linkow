package com.example.linkshortener;

public class LinkAlreadyExistException extends RuntimeException {

    public LinkAlreadyExistException(String id) {
        super("Link with" + id + "already exist");
    }
}

