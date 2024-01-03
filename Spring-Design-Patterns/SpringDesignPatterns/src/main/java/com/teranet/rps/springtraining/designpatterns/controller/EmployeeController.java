package com.teranet.rps.springtraining.designpatterns.controller;

import com.teranet.rps.springtraining.designpatterns.builder.ContactCard;
import com.teranet.rps.springtraining.designpatterns.builder.ContactCardBuilder;
import com.teranet.rps.springtraining.designpatterns.models.Employee;
import com.teranet.rps.springtraining.designpatterns.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api/employee/")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    RestTemplate restTemplate;
    @PostMapping("new")
    public ResponseEntity postNewEmployee(@RequestBody Employee employee){
        return employeeService.newEmployee(employee);
    }
    @GetMapping("testPoint")
    public ResponseEntity getResponse(){
        return employeeService.getNewEmployee();
    }
    @GetMapping("all")
    public ResponseEntity getEmployeesList(){
        return employeeService.getAllEmployee();
    }
    @GetMapping("get/{id}")
    public ResponseEntity getEmployeeById(@PathVariable long id){
        return employeeService.getEmployeeFromId(id);
    }

    @PutMapping("update/{id}")
    public ResponseEntity updateEmployeeDetails(@PathVariable long id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id,employee);
    }

    @GetMapping("employeeContact/{idy}")
    public ContactCard getEmployeeContactById(@PathVariable("idy") long id){
        Employee employee = this.restTemplate
                .getForEntity("http://localhost:8080/api/employee/{id}",
                        Employee.class,id).getBody();
        return (new ContactCardBuilder()
                .setFirstName(employee.getFirstName())
                .setWorkEmail(employee.getEmail())
                .setDepartment("Development").buildContactCard());
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity deleteEmployee(@PathVariable("id") long id){
        return employeeService.deleteEmployee(id);
    }

    @GetMapping("getEmployeeByDomain/{cDomain}")
    public ResponseEntity getEmployeeByCore(@PathVariable("cDomain") String coreDomain){
        return employeeService.getEmployeeByCoreDomain(coreDomain);
    }
}
