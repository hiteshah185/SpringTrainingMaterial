package com.teranet.rps.springtraining.designpatterns.beans;

import org.springframework.stereotype.Component;

@Component
public class Computer {
    public void startMachine(){
        System.out.println("Computer Turned On.");
    }
}
