package com.teranet.rps.springmvcapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String goHome(){
        System.out.println("Client in HomeController");
        return "index";
    }
}
