package com.teranet.rps.springtraining.config;

import com.teranet.rps.springtraining.service.TimeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages= "com.teranet.rps.springtraining")
public class ApplicationConfig {
    @Value("#{new Boolean(environment['spring.profiles.active']!='dev')}")
    private boolean is24;
    @Bean
    public TimeService timeService(){
        return new TimeService(is24);
    }
}
