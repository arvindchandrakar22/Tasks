package com.practice.fuctionalInterface;

import java.util.function.Function;

public class Demo8FunctionInterface {
    public static void main(String[] args) {

        Function<Integer,Integer> f1 = i->i*i;

        System.out.println(f1.apply(20));
        System.out.println(f1.apply(18));
        System.out.println(f1.apply(7));

        Function<String,Integer> f2 = i->i.length();

        System.out.println("Length of given string :: ");
        System.out.println(f2.apply("Good Morning"));
        System.out.println(f2.apply("Have A Good Day"));
    }
}
