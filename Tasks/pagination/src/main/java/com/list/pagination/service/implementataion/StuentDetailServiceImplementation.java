package com.list.pagination.service.implementataion;

import com.list.pagination.model.StudentDetails;
import com.list.pagination.repository.StudentDetailRepository;
import com.list.pagination.service.StudentDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StuentDetailServiceImplementation implements StudentDetailService {

    @Autowired
    private StudentDetailRepository studentDetailRepository;
    @Override
    public List<StudentDetails> getAllData(Integer pageNumber, Integer pageSize) {
        Pageable p = PageRequest.of(pageNumber,pageSize);
        Page<StudentDetails> pagePost = studentDetailRepository.findAll(p);
        List<StudentDetails> pageContent = pagePost.getContent();
        return pageContent;
    }

    @Override
    public List<StudentDetails> getDataByAge(int age, Integer pageNumber, Integer pageSize) {
        Pageable p = PageRequest.of(pageNumber, pageSize);
        Page<StudentDetails> pagePost = studentDetailRepository.findByAge(age,p);
        List<StudentDetails> pageContent = pagePost.getContent();
        return pageContent;
    }

    @Override
    public List<StudentDetails> getDataByGender(char gender, Integer pageNumber, Integer pageSize) {
        Pageable p = PageRequest.of(pageNumber,pageSize);
        Page<StudentDetails> pagePost = studentDetailRepository.findByGender(gender,p);
        List<StudentDetails> pageContent = pagePost.getContent();
        return pageContent;
    }

    @Override
    public List<StudentDetails> getDataByBranch(String branch, Integer pageNumber, Integer pageSize) {
        Pageable p = PageRequest.of(pageNumber,pageSize);
        Page<StudentDetails> pagePost = studentDetailRepository.findByBranch(branch,p);
        List<StudentDetails> pageContent = pagePost.getContent();
        return pageContent;
    }

    @Override
    public List<StudentDetails> getDataByPassOutYear(int passOutYear, Integer pageNumber, Integer pageSize) {
        Pageable p = PageRequest.of(pageNumber,pageSize);
        Page<StudentDetails> pagePost = studentDetailRepository.findByPassOutYear(passOutYear,p);
        List<StudentDetails> pageContent = pagePost.getContent();
        return pageContent;
    }

    @Override
    public List<StudentDetails> getDataByCity(String city, Integer pageNumber, Integer pageSize) {
        Pageable p = PageRequest.of(pageNumber,pageSize);
        Page<StudentDetails> pagePost = studentDetailRepository.findByCity(city,p);
        List<StudentDetails> pageContent = pagePost.getContent();
        return pageContent;
    }

    @Override
    public List<StudentDetails> getDataByState(String state, Integer pageNumber, Integer pageSize) {
        Pageable p = PageRequest.of(pageNumber,pageSize);
        Page<StudentDetails> pagePost = studentDetailRepository.findByState(state,p);
        List<StudentDetails> pageContent = pagePost.getContent();
        return pageContent;
    }

    @Override
    public List<StudentDetails> getDataByExperience(int experience, Integer pageNumber, Integer pageSize) {
        Pageable p = PageRequest.of(pageNumber,pageSize);
        Page<StudentDetails> pagePost = studentDetailRepository.findByExperience(experience,p);
        List<StudentDetails> pageContent = pagePost.getContent();
        return pageContent;
    }
}
