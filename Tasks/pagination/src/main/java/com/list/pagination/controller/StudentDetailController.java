package com.list.pagination.controller;

import com.list.pagination.model.StudentDetails;
import com.list.pagination.service.StudentDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class StudentDetailController {

    @Autowired
    private StudentDetailService studentDetailService;
    @GetMapping("/allData")
    public ResponseEntity<List<StudentDetails>> getAllData(
            @RequestParam(value = "PageNumber", defaultValue = "1",required = false) Integer pageNumber,
            @RequestParam(value = "PageSize", defaultValue = "10",required = false) Integer pageSize
    ){
        List<StudentDetails> allData = studentDetailService.getAllData(pageNumber,pageSize);

        if(allData.isEmpty()){
         return new ResponseEntity<List<StudentDetails>>(allData, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<List<StudentDetails>>(allData, HttpStatus.OK);
        }
    }
    @GetMapping("/age/{age}")
    public ResponseEntity<List<StudentDetails>> getDataByAge(
            @RequestParam(value = "PageNumber", defaultValue = "1",required = false) Integer pageNumber,
            @RequestParam(value = "PageSize", defaultValue = "10", required = false) Integer pageSize,
            @PathVariable("age") int age
    ){
        List<StudentDetails> dataByAge = studentDetailService.getDataByAge(age,pageNumber,pageSize);

        if(dataByAge.isEmpty()){
            return new ResponseEntity<List<StudentDetails>>(dataByAge,HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<List<StudentDetails>>(dataByAge, HttpStatus.FOUND);
        }
    }
    @GetMapping("/gender/{gender}")
    public ResponseEntity<List<StudentDetails>> getDataByGender(
            @RequestParam(value = "PageNumber", defaultValue = "1",required = false) Integer pageNumber,
            @RequestParam(value = "PageSize", defaultValue = "10",required = false) Integer pageSize,
            @PathVariable("gender") char gender
    ){
        List<StudentDetails> dataByGender = studentDetailService.getDataByGender(gender,pageNumber,pageSize);
        if(dataByGender.isEmpty())
        {
            return new ResponseEntity<List<StudentDetails>>(dataByGender,HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<List<StudentDetails>>(dataByGender,HttpStatus.FOUND);
        }
    }
    @GetMapping("/branch/{branch}")
    public ResponseEntity<List<StudentDetails>> getDataByBranch(
        @RequestParam(value = "PageNumber",defaultValue = "1",required = false) Integer pageNumber,
        @RequestParam(value = "PageSize",defaultValue = "10",required = false) Integer pageSize,
        @PathVariable("branch") String branch
    ){
        List<StudentDetails> dataByBranch = studentDetailService.getDataByBranch(branch,pageNumber,pageSize);
        if(dataByBranch.isEmpty()){
            return new ResponseEntity<List<StudentDetails>>(dataByBranch,HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<List<StudentDetails>>(dataByBranch,HttpStatus.FOUND);
        }
    }

    @GetMapping("/passOutYear/{passOutYear}")
    public ResponseEntity<List<StudentDetails>> getDataByPassOutYear(
            @RequestParam(value = "PageNumber", defaultValue = "1", required = false) Integer pageNumber,
            @RequestParam(value = "PageSize", defaultValue = "0", required = false) Integer pageSize,
            @PathVariable("passOutYear") int passOutYear
    ){
        List<StudentDetails> dataByPassOutYear = studentDetailService.getDataByPassOutYear(passOutYear,pageNumber,pageSize);
        if(dataByPassOutYear.isEmpty()){
            return new ResponseEntity<List<StudentDetails>>(dataByPassOutYear, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<List<StudentDetails>>(dataByPassOutYear, HttpStatus.FOUND);
        }
    }

    @GetMapping("/city/{city}")
    public ResponseEntity<List<StudentDetails>> getDataByCity(
            @RequestParam(value = "PageNumber", defaultValue = "1", required = false) Integer pageNumber,
            @RequestParam(value = "PageSize", defaultValue = "0", required = false) Integer pageSize,
            @PathVariable("city") String city
    ){
        List<StudentDetails> dataByCity = studentDetailService.getDataByCity(city,pageNumber,pageSize);
        if(dataByCity.isEmpty()){
            return new ResponseEntity<List<StudentDetails>>(dataByCity, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<List<StudentDetails>>(dataByCity, HttpStatus.FOUND);
        }
    }

    @GetMapping("/state/{state}")
    public ResponseEntity<List<StudentDetails>> getDataByState(
            @RequestParam(value = "PageNumber", defaultValue = "1", required = false) Integer pageNumber,
            @RequestParam(value = "PageSize", defaultValue = "0", required = false) Integer pageSize,
            @PathVariable("state") String state
    ){
        List<StudentDetails> dataByState = studentDetailService.getDataByState(state,pageNumber,pageSize);
        if(dataByState.isEmpty()){
            return new ResponseEntity<List<StudentDetails>>(dataByState, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<List<StudentDetails>>(dataByState, HttpStatus.FOUND);
        }
    }

    @GetMapping("/experience/{experience}")
    public ResponseEntity<List<StudentDetails>> getDataByExperience(
            @RequestParam(value = "PageNumber", defaultValue = "1", required = false) Integer pageNumber,
            @RequestParam(value = "PageSize", defaultValue = "0", required = false) Integer pageSize,
            @PathVariable("experience") int experience
    ){
        List<StudentDetails> dataByExperience = studentDetailService.getDataByExperience(experience,pageNumber,pageSize);
        if(dataByExperience.isEmpty()){
            return new ResponseEntity<List<StudentDetails>>(dataByExperience, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<List<StudentDetails>>(dataByExperience, HttpStatus.FOUND);
        }
    }

}
