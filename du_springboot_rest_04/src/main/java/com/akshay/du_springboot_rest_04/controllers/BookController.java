package com.akshay.du_springboot_rest_04.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akshay.du_springboot_rest_04.booksServices.Booksservices;
import com.akshay.du_springboot_rest_04.entitys.Book;

@RestController
public class BookController {

    @Autowired
 private Booksservices booksservices;
   

    @GetMapping("/books")
    public List<Book> getBooks(){

       
        return this.booksservices.getAllBooks() ;
    }
}
