package com.practice.fuctionalInterface;

import java.util.Arrays;
import java.util.function.Predicate;

public class Demo7JoiningPredicates {
    public static void main(String[] args) {

        int[] a = {50,20,43,68,89,28,74,15,96,29,35,92,39,19,49};

        Predicate<Integer> p1 = i->i%2==0;
        Predicate<Integer> p2 = i->i>50;

        System.out.print("Printing array elements :: ");
        Arrays.stream(a).forEach(element-> System.out.print(element+" "));

        System.out.print("\nPrinting array element which are EVEN & GREATER than 50 :: ");
        Arrays.stream(a).forEach(element -> {
//            if (p1.test(element) && p2.test(element))
//                System.out.print(element + " ");
            if(p1.and(p2).test(element))
                System.out.print(element + " ");
        });

        System.out.print("\nPrinting array element which are EVEN OR GREATER than 50 :: ");
        Arrays.stream(a).forEach(element -> {
            if(p1.or(p2).test(element))
                System.out.print(element + " ");
        });

        System.out.print("\nPrinting array element which are NOT EVEN :: ");
        Arrays.stream(a).forEach(element -> {
            if(p1.negate().test(element))
                System.out.print(element + " ");
        });
    }
}
