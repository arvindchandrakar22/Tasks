package com.practice.fuctionalInterface;

import java.util.Arrays;
import java.util.function.Predicate;

public class Demo5Predicates {
    public static void main(String[] args) {

        Predicate<Integer> p1 = i->(i>10);
        System.out.println(p1.test(20));
        System.out.println(p1.test(5));

        Predicate<String> p2 = i->(i.length()>4);
        System.out.println(p2.test("Welcome"));
        System.out.println(p2.test("OKAY"));

        String names[] = {"David","James","Smith","John","Mary","Scott"};

        System.out.println("Printing all element of array ::");
        Arrays.stream(names).forEach(items ->System.out.print(items+" "));

        System.out.println("\nPrintng only those element of array whose lenght is greater than 4 ::");
        Arrays.stream(names).forEach(items -> {if(p2.test(items))
            System.out.print(items+" ");
        });

    }
}
