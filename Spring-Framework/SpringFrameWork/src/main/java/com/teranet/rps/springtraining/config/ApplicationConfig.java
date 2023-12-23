package com.teranet.rps.springtraining.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages= "com.teranet.rps.springtraining")
public class ApplicationConfig {
}
