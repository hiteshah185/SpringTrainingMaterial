package com.teranet.rps.springtraining.service;

import com.teranet.rps.springtraining.aspect.Loggable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    @Value("${app.greeting}")
    private String myGreeting;

    public GreetingService(){
        super();
    }

    @Loggable
    public String getGreeting(String name){
    return myGreeting + " " +name;
    }

}
