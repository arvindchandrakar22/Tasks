package com.practice.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo2SetExample {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();

        s.add("One");
        s.add("Two");
        s.add("Three");
        s.add("Four");
        s.add("Five");
        s.add("Six");

        System.out.println(s);

        Iterator it = s.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next() +" ");
        }
    }
}
