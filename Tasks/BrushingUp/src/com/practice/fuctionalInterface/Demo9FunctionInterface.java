package com.practice.fuctionalInterface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employeee{
    String name;
    int salary;
    public Employeee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employeee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Demo9FunctionInterface {
    public static void main(String[] args) {

        ArrayList<Employeee> ele_list = new ArrayList<>();

        ele_list.add(new Employeee("David",40000));
        ele_list.add(new Employeee("Maria",34000));
        ele_list.add(new Employeee("Dany",20000));
        ele_list.add(new Employeee("Lavis",37000));
        ele_list.add(new Employeee("Kathy",64000));

        System.out.println("Displaying all the employees :: ");
        ele_list.forEach(emp-> System.out.println(emp.toString()));

        Function<Employeee,Integer> f1 = (emp-> {
            int sal = emp.salary;
            if(sal>=10000 && sal<=20000)
                return (sal*10/100);
            if(sal>=20000 && sal<=30000)
                return (sal*20/100);
            if(sal>=30000 && sal<=50000)
                return (sal*30/100);
            else return (sal*40/100);
        });

        System.out.println("\nPrinting the bonus of each employee :: ");
        ele_list.forEach(emp -> {
            int bonus = f1.apply(emp);
            System.out.println("Name :: "+emp.name+", Salary :: "+emp.salary+", Bonus :: "+bonus);
        });

        Predicate<Integer> p = b->b>10000;

        System.out.println("\nPrinting the details of the employees whose bonus is greater than 10000 :: ");
        ele_list.forEach(emp -> {
            int bonus = f1.apply(emp);
            if(p.test(bonus))
            System.out.println("Name :: "+emp.name+", Salary :: "+emp.salary+", Bonus :: "+bonus);
        });


    }
}
