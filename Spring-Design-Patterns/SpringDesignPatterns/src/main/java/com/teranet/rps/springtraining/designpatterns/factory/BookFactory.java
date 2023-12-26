package com.teranet.rps.springtraining.designpatterns.factory;

import org.springframework.stereotype.Component;

@Component
public class BookFactory {
    public Book createBook (String type){
        switch (type.toUpperCase()){
            case "magazine":return new Magazine();
            case "textbook": return new TextBook();
            default: throw new UnsupportedOperationException("Unknown Book Type");
        }
    }
}
