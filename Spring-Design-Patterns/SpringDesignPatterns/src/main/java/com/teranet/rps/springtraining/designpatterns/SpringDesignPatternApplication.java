package com.teranet.rps.springtraining.designpatterns;

import com.teranet.rps.springtraining.designpatterns.prototype.Bottle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class SpringDesignPatternApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringDesignPatternApplication.class,args);
    }
    @Bean
    @Scope("prototype")
    public Bottle prototypeBuilderForBottle(){return new Bottle();}
}
