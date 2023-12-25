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
    private final TimeService timeService;

    @Autowired
    public OutputService(GreetingService greetingService, TimeService timeService) {
        this.greetingService = greetingService;
        this.timeService = timeService;
    }
    
    public void getOutput(){
    StringBuilder message = new StringBuilder();
    message.append(this.timeService.getCurrentTime()+": "+greetingService.getGreeting(appName));
    System.out.println(message.toString());
    }
}
