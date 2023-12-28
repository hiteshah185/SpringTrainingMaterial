package com.teranet.rps.springtraining.designpatterns.repo;

import com.teranet.rps.springtraining.designpatterns.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRpo extends JpaRepository<Employee,Long> {
    Employee findByFirstName(String firstName);
    @Override
    boolean existsById(Long aLong);
}
