package com.example.demo;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(int id) {
        super("Could not find product " + id);
    }
}