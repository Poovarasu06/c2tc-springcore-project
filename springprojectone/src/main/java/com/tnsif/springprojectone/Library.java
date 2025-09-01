package com.tnsif.springprojectone;

import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void displayBooks() {
        System.out.println("Library contains the following books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
