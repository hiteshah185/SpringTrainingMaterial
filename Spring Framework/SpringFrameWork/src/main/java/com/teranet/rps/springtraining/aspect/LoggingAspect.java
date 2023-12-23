package com.teranet.rps.springtraining.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
    @Pointcut("@annotation(Loggable)")
    public void executeLogging(){}

    @Before("executeLogging")
    public void logMethodCall (JoinPoint joinPoint){
        StringBuilder logMessage = new StringBuilder("Logging Method: ");
        logMessage.append(joinPoint.getSignature().getName());
        Object[] args =joinPoint.getArgs();
        if(null!=args && args.length >0){
            logMessage.append(" args=[ |");
            Arrays.asList(args).forEach(arg->{
                logMessage.append((arg)).append(" | ");
            });
            logMessage.append("]");
        }
        LOGGER.info(logMessage.toString());
    }

}
