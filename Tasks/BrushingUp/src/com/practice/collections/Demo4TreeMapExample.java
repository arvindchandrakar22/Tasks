package com.practice.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo4TreeMapExample {
    public static void main(String[] args) {

        Map<String,Integer> m = new TreeMap<>();

        m.put("B",3);
        m.put("D",4);
        m.put("E",5);
        m.put("F",6);
        m.put("C",3);
        m.put("A",1);

        System.out.println("\nKey 'A' has value as :: "+m.get("A"));

        System.out.println("\nRemoving Element From TreeMap");
        System.out.println(m.remove("E"));

        System.out.println("Removing Element From TreeMap");
        System.out.println(m.remove("E"));

        System.out.println("\nIterating TreeMap ");
        m.forEach((i,j)-> {
            System.out.println(i+" "+j);
        });
    }
}
