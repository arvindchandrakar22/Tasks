package com.relation.has_a.service.implementation;

import com.relation.has_a.exception.EmployeeNotFoundException;
import com.relation.has_a.model.Employee;
import com.relation.has_a.repository.EmployeeRepository;
import com.relation.has_a.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImplementation implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImplementation(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id).orElseThrow(()->
                new EmployeeNotFoundException("Employee Not Found with ID :: "+id));
    }
    public void deleteEmployee(Long id){

        if(!employeeRepository.existsById(id)){
            throw new EmployeeNotFoundException("Employee Not Found with ID :: "+id);
        }
        employeeRepository.deleteById(id);
    }
}
