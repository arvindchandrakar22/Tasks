package com.practice.fuctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    String name;
    int salary;
    int experience;

    public Employee(String name, int salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }
}

public class Demo6Predicates {
    public static void main(String[] args) {

        ArrayList<Employee> e = new ArrayList<>();

        e.add(new Employee("David",50000,4));
        e.add(new Employee("Jhon",66000,5));
        e.add(new Employee("Smith",44000,2));
        e.add(new Employee("Diana",70000,6));
        e.add(new Employee("Scott",25000,1));
        e.add(new Employee("Brack",35000,3));

        System.out.println("Printing all the Employees ::");
        e.forEach(items-> System.out.println(items.toString()));

        Predicate<Employee> p = emp->(emp.salary>30000 && emp.experience>3);

        System.out.println("\nPrinting the Employees whose salary is more than 30000 and are experienced more than 3 yrs::");
        e.forEach(items-> {
            if(p.test(items))
            //System.out.println(items.toString());
            System.out.println(items.name+" "+items.salary+" "+items.experience);
        });
    }
}
