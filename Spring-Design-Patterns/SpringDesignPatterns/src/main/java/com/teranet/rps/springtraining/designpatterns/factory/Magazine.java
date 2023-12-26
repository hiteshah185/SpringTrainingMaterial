package com.teranet.rps.springtraining.designpatterns.factory;

public class Magazine implements Book{
    private String name;
    private String publisher;
    private boolean isRead;
    public Magazine(){
        super();
        this.isRead=true;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public String getAuthor(){
        return this.publisher;
    }
    @Override
    public String getType(){
        return Magazine.class.getSimpleName();
    }
    @Override
    public void read(){
        this.isRead=true;
        System.out.println("Reading magazine published by "+this.publisher);
    }
    @Override
    public boolean isRead(){
        return this.isRead;
    }


}
