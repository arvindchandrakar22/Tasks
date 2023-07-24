package com.list.pagination.model;

import org.aspectj.weaver.loadtime.definition.Definition;

import javax.persistence.*;

@Entity
@Table(name = "Student_List")
public class StudentDetails {

    @Id
    @Column(name = "Student_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;
    @Column(name = "Student_Name")
    private String name;
    @Column(name = "Age")
    private int age;
    @Column(name = "Gender",columnDefinition = "CHAR CHECK (gender in ('M','F'))")
    private char gender;
    @Column(name = "Branch")
    private String branch;
    @Column(name = "Pass_Out_Year")
    private int passOutYear;
    @Column(name = "City")
    private String city;
    @Column(name = "State")
    private String state;
    @Column(name = "Experience",columnDefinition = "INTEGER DEFAULT 0")
    private int experience;

    public StudentDetails(){

    }
    public StudentDetails(int student_id, String name, int age, char gender, String branch,
                          int passOutYear, String city, String state, int experience) {
        this.student_id = student_id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.branch = branch;
        this.passOutYear = passOutYear;
        this.city = city;
        this.state = state;
        this.experience = experience;
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getBranch() {
        return branch;
    }

    public int getPassOutYear() {
        return passOutYear;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getExperience() {
        return experience;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setPassOutYear(int passOutYear) {
        this.passOutYear = passOutYear;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
