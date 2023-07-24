package com.stackInstance.resttTemplate.controller;

import com.stackInstance.resttTemplate.model.Employee;
import com.stackInstance.resttTemplate.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/RestTemplate")
public class RestTemplateController {
    @Autowired
    private RestTemplateService restTemplateService;
    @GetMapping("/getAllEmployee")
    public ResponseEntity<String> getAllEmployee(){
       return restTemplateService.getEmployee();
    }
    @PostMapping("/createEmployee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return restTemplateService.createEmployee(employee);
    }
    @GetMapping("/getEmployeeById/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return restTemplateService.getEmployeeById(id);
    }
    @PutMapping("/updateEmployee/{id}")
    public void updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        restTemplateService.updateEmployee(id, employee);
    }
    @DeleteMapping("/deleteEmployee/{id}")
    public void updateEmployee(@PathVariable int id){
        restTemplateService.deleteEmployee(id);
    }
}
