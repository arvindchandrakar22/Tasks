package com.stackInstance.resttTemplate.controller;

import com.stackInstance.resttTemplate.model.Employee;
import com.stackInstance.resttTemplate.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stackInstance")
public class EmployeeController {
    private EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }

    //Create employee REST API
    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    //Get all employee REST API
    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    //Get employee by ID REST API
    @GetMapping("/getEmpById/{id}")
    public Optional<Employee> getEmployeeByID(@PathVariable("id") int emp_id){
        return Optional.ofNullable(employeeService.getEmployeeByID(emp_id));
    }

    //Update employee REST API
    @PutMapping("/updateEmp/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") int id,@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee,id), HttpStatus.OK);
    }

    //Delete employee REST API
    @DeleteMapping({"/deleteEmp/{id}"})
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") int id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<String>("Employee deleted sucessfully. !!!",HttpStatus.OK);
    }
}
