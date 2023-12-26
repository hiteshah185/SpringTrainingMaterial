package com.teranet.rps.springtraining.designpatterns.controller;

import com.teranet.rps.springtraining.designpatterns.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api/employee/")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("testPoint")
    public ResponseEntity getResponse(){
        return employeeService.getNewEmployee();
    }
}
