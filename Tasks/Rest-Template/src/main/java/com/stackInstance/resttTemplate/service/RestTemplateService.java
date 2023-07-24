package com.stackInstance.resttTemplate.service;

import com.stackInstance.resttTemplate.model.Employee;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
public class RestTemplateService {
    RestTemplate restTemplate = new RestTemplate();
    private static final String get_All_Employee_URL = "http://localhost:8080/stackInstance/getAllEmployee";
    private static final String create_Employee_URL = "http://localhost:8080/stackInstance/addEmployee";
    private static final String get_EmployeeById_URL = "http://localhost:8080/stackInstance/getEmpById/{id}";
    private static final String update_Employee_URL = "http://localhost:8080/stackInstance/updateEmp/";
    private static final String delete_Employee_URL = "http://localhost:8080/stackInstance/deleteEmp/{id}";

    public ResponseEntity<String> getEmployee(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<String>("parameters",headers);

        ResponseEntity<String> response = restTemplate
                .exchange(get_All_Employee_URL, HttpMethod.GET, entity, String.class);
        System.out.println("BODY :: "+response.getBody());
        System.out.println("HEADER :: "+response.getHeaders());
        System.out.println("STATUS CODE :: "+response.getStatusCode());
        return response;
    }

    public ResponseEntity<Employee> createEmployee(Employee employee){
        return restTemplate.postForEntity(create_Employee_URL,employee,Employee.class);
    }

    public Employee getEmployeeById(int id) {
        Map<String,Integer> param = new HashMap<String,Integer>();
        param.put("id",id);
        return restTemplate.getForObject(get_EmployeeById_URL,Employee.class,param);
    }

    public void updateEmployee(int id, Employee employee) {
        restTemplate.put(update_Employee_URL+id,employee);
    }

    public void deleteEmployee(int id) {
        Map<String,Integer> param = new HashMap<String,Integer>();
        param.put("id",id);
        restTemplate.delete(delete_Employee_URL,param);
    }
}
