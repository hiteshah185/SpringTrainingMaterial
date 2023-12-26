package com.teranet.rps.springtraining.designpatterns.factory;

public class TextBook implements Book {
    private String name;
    private String publisher;
    private String  subject;
    private boolean isRead;
    public TextBook(){
        super();
        this.isRead=false;
    }
    @Override
    public void setName(String name){
        this.name=name;
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public String getType(){
        return TextBook.class.getSimpleName();
    }
    @Override
    public String getAuthor(){
        return this.publisher;
    }
    @Override
    public boolean isRead(){
        return this.isRead;
    }
    @Override
    public  void read(){
        this.isRead=true;
        System.out.println("Reading textbook of subject:"+this.subject);
    }
}
