package com.teranet.rps.springtraining.designpatterns.factory;

public interface Book {
    void setName(String name);
    String getName();
    String getType();
    String getAuthor();
    boolean isRead();
    void read();
}
