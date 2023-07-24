package com.practice.fuctionalInterface;

import java.util.function.Function;

public class Demo1 {

    public static void main(String args[])
    {
        Function<Integer,Double> halfTheValue = a->a/2.0;
        System.out.println(halfTheValue.apply(20));

        halfTheValue = halfTheValue.andThen(a->a*3);
        System.out.println(halfTheValue.apply(20));

        halfTheValue = halfTheValue.compose(a->a*3);
        System.out.println(halfTheValue.apply(10));
    }
}
