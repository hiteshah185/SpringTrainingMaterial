package com.teranet.rps.springtraining.designpatterns;

import com.teranet.rps.springtraining.designpatterns.beans.Computer;
import com.teranet.rps.springtraining.designpatterns.beans.User;
import com.teranet.rps.springtraining.designpatterns.models.Employee;
import com.teranet.rps.springtraining.designpatterns.prototype.Bottle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.core.SpringProperties;
import org.springframework.web.client.RestTemplate;
//@EnableConfigurationProperties(SpringProperties.class)
@SpringBootApplication
public class SpringDesignPatternApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDesignPatternApplication.class,args);
        User user = context.getBean(User.class);
        user.startComputer();
    }
    @Bean
    @Scope("prototype")
    public Bottle prototypeBuilderForBottle(){return new Bottle();}

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
