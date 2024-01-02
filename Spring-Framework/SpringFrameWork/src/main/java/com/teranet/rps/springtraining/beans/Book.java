package com.teranet.rps.springtraining.beans;

public class Book {
    private String type;
    private String author;
    private String publisher;
    private int numberOfPages;
    private NameSlip nameSlip;

    public Book(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Book(String type, String author, String publisher, int numberOfPages, NameSlip nameSlip) {
        this.type = type;
        this.author = author;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
        this.nameSlip = nameSlip;
    }

    public Book() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        System.out.println("Setting Author.");
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        System.out.println("Setting Publisher.");
        this.publisher = publisher;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public NameSlip getNameSlip() {
        return nameSlip;
    }

    public void setNameSlip(NameSlip nameSlip) {
        this.nameSlip = nameSlip;
    }

    @Override
    public String toString() {
        return "Book{" +
                "type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", nameSlip=" + nameSlip +
                '}';
    }
}
