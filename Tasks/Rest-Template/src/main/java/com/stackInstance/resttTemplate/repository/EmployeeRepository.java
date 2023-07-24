package com.stackInstance.resttTemplate.repository;

import com.stackInstance.resttTemplate.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
