package com.stackInstance.resttTemplate.service;

import com.stackInstance.resttTemplate.exception.ResourceNotFoundException;
import com.stackInstance.resttTemplate.model.Employee;
import com.stackInstance.resttTemplate.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements EmployeeService{
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImplementation(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeByID(int id) {
        return employeeRepository
                .findById(id)
                .orElseThrow(()->
                        new ResourceNotFoundException("Employee","id",id));
    }

    @Override
    public Employee updateEmployee(Employee employee, int id) {
        Employee existingEmployee = employeeRepository
                .findById(id)
                .orElseThrow(()->
                        new ResourceNotFoundException("Employee","id",id));
        existingEmployee.setEmployeeName(employee.getEmployeeName());
        existingEmployee.setEmployeeDepartment(employee.getEmployeeDepartment());

        employeeRepository.save(existingEmployee);

        return existingEmployee;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository
                .findById(id)
                .orElseThrow(()->
                        new ResourceNotFoundException("Employee","id",id));
        employeeRepository.deleteById(id);
    }

}
