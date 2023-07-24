package com.stackInstance.resttTemplate.service;

import com.stackInstance.resttTemplate.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    List<Employee> getAllEmployee();
    Employee getEmployeeByID(int id);

    Employee updateEmployee(Employee employee, int id);

    void deleteEmployee(int id);
}
