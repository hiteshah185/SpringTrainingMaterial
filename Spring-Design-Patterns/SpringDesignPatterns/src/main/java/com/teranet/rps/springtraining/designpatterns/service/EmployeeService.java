package com.teranet.rps.springtraining.designpatterns.service;

import com.teranet.rps.springtraining.designpatterns.models.Employee;
import com.teranet.rps.springtraining.designpatterns.repo.EmployeeRpo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRpo employeeRpo;
    public ResponseEntity newEmployee(Employee newEmployee){
        return new ResponseEntity<Employee>(employeeRpo.save(newEmployee),HttpStatus.CREATED);
    }
    public ResponseEntity getAllEmployee(){
        return new ResponseEntity(employeeRpo.findAll(),HttpStatus.OK);
    }
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
    public ResponseEntity updateEmployee(long id ,Employee updaingEmployee){
        Optional<Employee> employee = employeeRpo.findById(id);
        if(employee.isPresent()){
            employee.get().setFirstName(updaingEmployee.getFirstName());
            //employee.get().setEmail(updaingEmployee.getEmail());
            employee.get().setDomain(updaingEmployee.getDomain());
            return new ResponseEntity(employeeRpo.save(employee.get()),HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
    public ResponseEntity deleteEmployee(long id){
        try{
            employeeRpo.deleteById(id);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception ex){
            return new ResponseEntity("Delete Failed",HttpStatus.CONFLICT);
        }
    }
    public ResponseEntity getEmployeeByCoreDomain(String coreDomain){
        try{
            Collection<Employee> employees = employeeRpo.findEmployeesByCoreDomain(coreDomain);
            return new ResponseEntity(employees,HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity("Something Went wrong!",HttpStatus.BAD_REQUEST);
        }
    }
}
