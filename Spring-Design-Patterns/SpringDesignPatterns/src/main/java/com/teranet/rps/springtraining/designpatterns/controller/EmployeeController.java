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
@RequestMapping("/api/")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("testPoint")
    public ResponseEntity getResponse(){
        return employeeService.getNewEmployee();
    }
    @GetMapping("employees")
    public List<Employee> getEmployeesList(){
        List<Employee> employees = new ArrayList<>();
        Employee newEmployee =  new Employee();
        newEmployee.setFirstName("Kailas");
        newEmployee.setEmail("kailas@mail.com");
        newEmployee.setDomain("java");
        employees.add(newEmployee);
        return employees;
    }
    @GetMapping("employee/{id}")
    public ResponseEntity getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeFromId(id);
    }

    @GetMapping("employeeContact/{id}")
    public ContactCard getEmployeeContactById(@PathVariable Long id){
        Employee employee = this.restTemplate
                .getForEntity("http://localhost:8080/api/employee/{id}",
                        Employee.class,id).getBody();
        return (new ContactCardBuilder()
                .setFirstName(employee.getFirstName())
                .setWorkEmail(employee.getEmail())
                .setDepartment("Development").buildContactCard());
    }


}
