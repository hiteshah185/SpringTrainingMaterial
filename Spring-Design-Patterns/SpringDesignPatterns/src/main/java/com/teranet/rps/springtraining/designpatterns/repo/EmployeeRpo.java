package com.teranet.rps.springtraining.designpatterns.repo;

import com.teranet.rps.springtraining.designpatterns.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface EmployeeRpo extends JpaRepository<Employee,Long> {
    Employee findByFirstName(String firstName);
    @Override
    boolean existsById(Long aLong);
    @Query(nativeQuery = true,value = "SELECT * FROM learnspring.employee WHERE core_domian=:coreDomain")
    Collection<Employee> findEmployeesByCoreDomain(@Param("coreDomain") String coreDomain);
}
