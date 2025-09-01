package com.tnsif.springprojectone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");

        Library library = (Library) context.getBean("library");
        library.displayBooks();
    }
}
