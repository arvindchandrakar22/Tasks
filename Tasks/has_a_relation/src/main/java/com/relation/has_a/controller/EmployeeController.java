package com.relation.has_a.controller;

import com.relation.has_a.model.Employee;
import com.relation.has_a.service.EmployeeService;
import com.relation.has_a.service.implementation.EmployeeServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/save")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.createEmployee(employee),HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/getEmpById/{id}")
    public ResponseEntity<Employee> getEmployeeByID(@PathVariable("id") long emp_id){
        return new ResponseEntity<Employee>(employeeService.getEmployeeById(emp_id),HttpStatus.OK);
    }

    @DeleteMapping({"/deleteEmp/{id}"})
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<String>("Employee deleted sucessfully. !!!",HttpStatus.OK);
    }
}
