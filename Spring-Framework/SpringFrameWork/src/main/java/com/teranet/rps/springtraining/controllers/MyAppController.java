package com.teranet.rps.springtraining.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyAppController {
    @RequestMapping("/submitSampleForm")
    public void helloController(){
        System.out.println("Hello Teraneter! ");
    }
}
