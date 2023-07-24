package com.practice.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Demo0 {
    public static void main(String[] args) {

        Double[] doubleValue = new Double[1000000];
        for(int i=0; i<1000000; i++)
        {
            doubleValue[i] = Math.random();
        }

        ArrayList<Double> al = new ArrayList<>();
        LinkedList<Double> ll = new LinkedList<>();

        System.out.println("Adding Elements into ArrayList");
        System.out.println(System.currentTimeMillis());
        al.addAll(Arrays.asList(doubleValue));
        System.out.println(System.currentTimeMillis());

        System.out.println("Adding Elements into LinkedList");
        System.out.println(System.currentTimeMillis());
        ll.addAll(Arrays.asList(doubleValue));
        System.out.println(System.currentTimeMillis());
        System.out.println("************************************************");

        System.out.println("Inserting Elements into ArrayList");
        System.out.println(System.currentTimeMillis());
        al.add(50000,100.0);
        System.out.println(System.currentTimeMillis());

        System.out.println("Inserting Elements into LinkedList");
        System.out.println(System.currentTimeMillis());
        ll.add(50000,100.0);
        System.out.println(System.currentTimeMillis());
        System.out.println("************************************************");

        System.out.println("Finding Element at specific index in ArrayList");
        System.out.println(System.currentTimeMillis());
        al.get(204450);
        System.out.println(System.currentTimeMillis());

        System.out.println("Finding Element at specific index in LinkedList");
        System.out.println(System.currentTimeMillis());
        ll.get(204450);
        System.out.println(System.currentTimeMillis());
        System.out.println("************************************************");

    }
}
