package com.teranet.rps.springtraining.designpatterns.service;

import com.teranet.rps.springtraining.designpatterns.models.Employee;
import com.teranet.rps.springtraining.designpatterns.repo.EmployeeRpo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRpo employeeRpo;
    public ResponseEntity getNewEmployee(){
        return new ResponseEntity<>(new Employee(11,"Kevin","kevin@mail.com","C#"), HttpStatus.OK);
    }
    public ResponseEntity getEmployeeFromId(Long id){
       Optional <Employee> employee = employeeRpo.findById(id);
        if(employee.isPresent()){
            return new ResponseEntity<Employee>( employee.get(),HttpStatus.OK);
        }
        return  new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}
