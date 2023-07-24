package net.springrest.springboot.service.impl;

import net.springrest.springboot.exception.ResourceNotFoundException;
import net.springrest.springboot.model.Employee;
import net.springrest.springboot.repository.EmployeeRepository;
import net.springrest.springboot.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeByID(long id) {
//        Optional<Employee> employee = employeeRepository.findById(id);
//        if(employee.isPresent())
//            return employee.get();
//        else
//            throw new ResourceNotFoundException("Employee","id",id);
        return employeeRepository
                .findById(id)
                .orElseThrow(()->
                        new ResourceNotFoundException("Employee","id",id));
    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {
        Employee existingEmployee = employeeRepository
                                            .findById(id)
                                            .orElseThrow(()->
                                                    new ResourceNotFoundException("Employee","id",id));
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());

        employeeRepository.save(existingEmployee);

        return existingEmployee;
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository
                .findById(id)
                .orElseThrow(()->
                        new ResourceNotFoundException("Employee","id",id));
        employeeRepository.deleteById(id);
    }


}
