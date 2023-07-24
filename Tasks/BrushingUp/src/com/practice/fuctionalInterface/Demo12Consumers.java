package com.practice.fuctionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employeeee{
    String name;
    int salary;
    String gender;

    public Employeeee(String name, int salary, String gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employeeee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }
}

public class Demo12Consumers {
    public static void main(String[] args) {

        ArrayList<Employeeee> ele_list = new ArrayList<>();

        ele_list.add(new Employeeee("David", 40000, "Male"));
        ele_list.add(new Employeeee("Dany", 20000, "Female"));
        ele_list.add(new Employeeee("Lavis", 37000, "Male"));
        ele_list.add(new Employeeee("Kathy", 64000, "Male"));
        ele_list.add(new Employeeee("Maria", 54000, "Female"));
        ele_list.add(new Employeeee("Danjo", 44000, "Male"));

        System.out.println("\nDisplaying all the employees :: \n");
        ele_list.forEach(emp -> System.out.println(emp.toString()));

        Function<Employeeee, Integer> f = (emp ->
            (emp.salary*10/100)
        );

        Predicate<Integer> p = b -> b > 5000;

        Consumer<Employeeee> c = emp -> {
            System.out.println("\nName :: "+emp.name);
            System.out.println("Salary :: "+emp.salary);
            System.out.println("Gender :: "+emp.gender);
        };

        System.out.println("\nEmployees whose bonus is GREATER than 10000 :: ");
        ele_list.forEach(emp -> {
            int bonus = f.apply(emp);
            if(p.test(bonus))
            {
                c.accept(emp);
                System.out.println("Bonus Is :: "+bonus);
            }
        });

    }
}
