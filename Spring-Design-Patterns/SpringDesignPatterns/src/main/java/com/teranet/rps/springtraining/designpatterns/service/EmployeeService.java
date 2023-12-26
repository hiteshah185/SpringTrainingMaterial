package com.teranet.rps.springtraining.designpatterns.service;

import com.teranet.rps.springtraining.designpatterns.models.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public ResponseEntity getNewEmployee(){
        return new ResponseEntity<>(new Employee(11,"Kevin","kevin@mail.com","C#"), HttpStatus.OK);
    }
}
