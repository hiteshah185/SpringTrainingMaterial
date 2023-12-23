package com.teranet.rps.springtraining.service;

import com.teranet.rps.springtraining.aspect.Loggable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OutputService {
    @Value("${app.name}")
    private String appName;

    private final GreetingService greetingService;

    @Autowired
    public OutputService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    public void getOutput(){
    StringBuilder message = new StringBuilder();
    message.append(greetingService.getGreeting(appName));
    System.out.println(message.toString());
    }
}
