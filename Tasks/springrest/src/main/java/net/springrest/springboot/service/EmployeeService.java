package net.springrest.springboot.service;

import net.springrest.springboot.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployee();
    Employee getEmployeeByID(long id);

    Employee updateEmployee(Employee employee, long id);

    void deleteEmployee(long id);
}
