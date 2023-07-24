package com.list.pagination.repository;

import com.list.pagination.model.StudentDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDetailRepository extends JpaRepository<StudentDetails,Integer> {

    Page<StudentDetails> findByAge(int age, Pageable p);
    Page<StudentDetails> findByGender(char gender, Pageable p);
    Page<StudentDetails> findByBranch(String branch, Pageable p);
    Page<StudentDetails> findByPassOutYear(int passOutYear, Pageable p);
    Page<StudentDetails> findByCity(String city, Pageable p);
    Page<StudentDetails> findByState(String state, Pageable p);
    Page<StudentDetails> findByExperience(int experience, Pageable p);


}
