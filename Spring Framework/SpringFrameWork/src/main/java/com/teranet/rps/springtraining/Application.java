package com.teranet.rps.springtraining;

import com.teranet.rps.springtraining.config.ApplicationConfig;
import com.teranet.rps.springtraining.service.OutputService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) throws Exception{
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        OutputService outputService = context.getBean(OutputService.class);
        System.out.println("<---Teranet RPS Spring Training: Main Class --->");
        outputService.getOutput();

    }
}
