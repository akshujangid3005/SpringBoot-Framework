package com.akshay.du_springboot_rest_04.entitys;


public class Book {

    private int id;
    private String bookName;
    private String authorName;
    private  int price;
    public Book(int id, String bookName, String authorName, int price) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }
    public Book() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", bookName=" + bookName + ", authorName=" + authorName + ", price=" + price + "]";
    } 



    
}
