package com.teranet.rps.springtraining.designpatterns.utils;

import com.teranet.rps.springtraining.designpatterns.models.Employee;
import com.teranet.rps.springtraining.designpatterns.repo.EmployeeRpo;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {
    private final EmployeeRpo employeeRpo;

    public AppStartupEvent(EmployeeRpo employeeRpo) {
        this.employeeRpo = employeeRpo;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        Iterable<Employee> employees = this.employeeRpo.findAll();
        employees.forEach(System.out::println);
    }
}
