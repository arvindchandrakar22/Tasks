package com.practice.java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String name;
    int id;
    char grade;

    public Student(String name, int id, char grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                '}';
    }
}

public class Demo11FlatMap {
    public static void main(String[] args) {

        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student("Smith",101,'A'));
        studentList1.add(new Student("John",102,'B'));
        studentList1.add(new Student("Kenedy",103,'C'));

        List<Student> studentList2 = new ArrayList<>();
        studentList1.add(new Student("Scott",104,'A'));
        studentList1.add(new Student("Mary",105,'B'));
        studentList1.add(new Student("Kitty",106,'C'));

        List<List<Student>> studentList = Arrays.asList(studentList1,studentList2);

//        studentList.forEach(x->x.forEach(y-> System.out.println(y.name)));

        List<String> nameList = studentList.stream()
                .flatMap(x->x.stream())
                .map(y->y.name)
                .collect(Collectors.toList());
        System.out.println(nameList);


    }
}
