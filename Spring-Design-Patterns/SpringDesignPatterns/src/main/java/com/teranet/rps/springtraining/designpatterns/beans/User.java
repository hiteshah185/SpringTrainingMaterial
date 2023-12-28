package com.teranet.rps.springtraining.designpatterns.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Autowired
    Computer computer;
    public void startComputer(){
        computer.startMachine();
    }
}
