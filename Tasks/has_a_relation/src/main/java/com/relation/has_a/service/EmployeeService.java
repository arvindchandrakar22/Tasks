package com.relation.has_a.service;

import com.relation.has_a.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee createEmployee(Employee employee);
    public List<Employee> getAllEmployee();
    public Employee getEmployeeById(Long id);
    public void deleteEmployee(Long id);
}
