package com.list.pagination.service;

import com.list.pagination.model.StudentDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentDetailService {
    public List<StudentDetails> getAllData(Integer pageNumber, Integer pageSize);
    public List<StudentDetails> getDataByAge(int age, Integer pageNumber,Integer pageSize);
    public List<StudentDetails> getDataByGender(char gender, Integer pageNumber, Integer pageSize);
    public List<StudentDetails> getDataByBranch(String branch, Integer pageNumber, Integer pageSize);
    public List<StudentDetails> getDataByPassOutYear(int passOutYear, Integer pageNumber, Integer pageSize);
    public List<StudentDetails> getDataByCity(String city, Integer pageNumber, Integer pageSize);
    public List<StudentDetails> getDataByState(String state, Integer pageNumber, Integer pageSize);
    public List<StudentDetails> getDataByExperience(int experience, Integer pageNumber, Integer pageSize);
}
