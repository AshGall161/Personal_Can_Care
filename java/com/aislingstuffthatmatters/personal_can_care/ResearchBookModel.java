package com.aislingstuffthatmatters.personal_can_care;

public class ResearchBookModel {

    String author;
    String bookTitle;

    public ResearchBookModel() {

    }

    public ResearchBookModel(String author, String bookTitle){
        this.author = author;
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

}
