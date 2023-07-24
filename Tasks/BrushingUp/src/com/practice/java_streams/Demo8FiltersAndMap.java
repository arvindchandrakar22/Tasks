package com.practice.java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Demo8FiltersAndMap {
    public static void main(String[] args) {

//        List<Employee> employeeList = new ArrayList<>();

//        employeeList.add(new Employee(101,"Alex",50000));
//        employeeList.add(new Employee(101,"Brian",40000));
//        employeeList.add(new Employee(101,"Charlies",30000));
//        employeeList.add(new Employee(101,"David",20000));
//        employeeList.add(new Employee(101,"Edward",10000));

        List<Employee> employeeList = Arrays.asList(
                (new Employee(101,"Alex",50000)),
                (new Employee(101,"Brian",40000)),
                (new Employee(101,"Charlies",30000)),
                (new Employee(101,"David",20000)),
                (new Employee(101,"Edward",10000))
        );

        List<Integer> employeesSalary = employeeList.stream()
                .filter(e->e.salary>20000)
                .map(e->e.salary).collect(Collectors.toList());

        System.out.print(employeesSalary);

    }
}
