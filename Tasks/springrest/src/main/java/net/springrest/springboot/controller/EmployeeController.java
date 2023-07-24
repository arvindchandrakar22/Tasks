package net.springrest.springboot.controller;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.springrest.springboot.model.Employee;
import net.springrest.springboot.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }

    //Create employee REST API
    @PostMapping("/saveEmployee")
    @ApiOperation(value = "Add new EMPLOYEE.",
            notes = "To add new EMPLOYEE, do provide Employee's First Name, Last Name & Email ID.",
            response = Employee.class)
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    //Get all employee REST API
    @GetMapping("/getAllEmployee")
    @ApiOperation(value = "Display all the EMPLOYEE.")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    //Get employee by ID REST API
    @GetMapping("/getEmployeeByID/{id}")
    @ApiOperation(value = "Find EMPLOYEE by ID",
            notes = "Provide ID to get the details about a specific Employee.")
    public ResponseEntity<Employee> getEmployeeByID(@ApiParam(value = "ID value of the Employee you need to retrieve",required = true)
                                                        @PathVariable("id") long emp_id){
        return new ResponseEntity<Employee>(employeeService.getEmployeeByID(emp_id),HttpStatus.OK);
    }

    //Update employee REST API
    @PutMapping("/updateEmployee/{id}")
    @ApiOperation(value = "Update the details of an EMPLOYEE by ID",
            notes = "Provide ID to update the details of any specific Employee.")
    public ResponseEntity<Employee> updateEmployee(@ApiParam(value = "ID value of the Employee you need update",required = true)
                                                       @PathVariable("id") long id,
                                                        @RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee,id), HttpStatus.OK);
    }

    //Delete employee REST API
    @DeleteMapping({"/deleteEmployee{id}"})
    @ApiOperation(value = "Delete any EMPLOYEE by ID",
            notes = "Provide an ID to delete the details of any specific Employee.")
    public ResponseEntity<String> deleteEmployee(@ApiParam(value = "ID value of the Employee you need to delete",required = true)
                                                 @PathVariable("id") long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<String>("Employee deleted sucessfully. !!!",HttpStatus.OK);
    }
}
