package com.akshay.du_springboot_rest_04.booksServices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.akshay.du_springboot_rest_04.entitys.Book;

@Component
public class Booksservices {

    private static List<Book> list= new ArrayList<>();
     
    static{
   
     list.add(new Book(13," Pathon refrence book","james carlone", 600));
     list.add(new Book(14," website  refrence book","odtrher  carlone", 700));
     list.add(new Book(16," java  refrence book"," suty  carlone", 1000));  

     }

     //get books 

    public List<Book> getAllBooks(){
     return list;
    }

    //get single book by price 

    public Book getBookByPrice(int price){

        Book book= null;
        list.stream().filter(e->e.getPrice()==price).findFirst().get();
        return book;
    }

    
}
