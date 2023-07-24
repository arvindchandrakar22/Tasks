package com.practice.java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1Filters {
    public static void main(String[] args) {

//        ArrayList<Integer> numberList = new ArrayList<>();
//
//        numberList.add(20);
//        numberList.add(54);
//        numberList.add(23);
//        numberList.add(19);
//        numberList.add(87);
//        numberList.add(73);

        List<Integer> numberList = Arrays.asList(20,54,23,19,87,73);
        List<Integer> evenNumberList = new ArrayList<>();

        System.out.println("\nNumber present in the ArrayList : ");
        numberList.forEach(num-> System.out.print(num +" "));

        //without using streams
//        System.out.println("\nEven Number present in the ArrayList : ");
//        numberList.forEach(num-> {
//            if(num%2==0)
//                evenNumberList.add(num);
//        });
//        evenNumberList.forEach(num-> System.out.print(num +" "));

        //Using streams
//        evenNumberList = numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
//        System.out.println("\nEven Number present in the ArrayList : ");
//        evenNumberList.forEach(num-> System.out.print(num +" "));

        //Filtering and printing all the element into one single statement
        System.out.println("\nEven Number present in the ArrayList : ");
        numberList.stream().filter(n->n%2==0).forEach(num-> System.out.print(num+" "));
//        numberList.stream().filter(n->n%2==0).forEach(System.out::println);

    }
}
