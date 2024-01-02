package com.teranet.rps.springtraining;

import com.teranet.rps.springtraining.beans.Pen;
import com.teranet.rps.springtraining.config.ApplicationConfig;
import com.teranet.rps.springtraining.service.OutputService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Application {
    public static void main(String[] args) throws Exception{
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ApplicationContext contextForUSA = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));//XML based
        Pen myCurrentPen = (Pen)factory.getBean("pen");
        OutputService outputService = context.getBean(OutputService.class);
        System.out.println("<---Teranet RPS Spring Training: Main Class --->");
        outputService.getOutput();
        myCurrentPen.write();

    }
}
