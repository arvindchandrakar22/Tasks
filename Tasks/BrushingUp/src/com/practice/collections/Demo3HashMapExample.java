package com.practice.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Demo3HashMapExample {
    public static void main(String[] args) {

        Map<Integer, String> m = new HashMap<>();

        m.put(01, "Ball");
        m.put(02, "Pencil");
        m.put(03, "Eraser");
        m.put(04, "Pen");
        m.put(05, "Book");


//        Stream.of(m.entrySet().toArray())
//                .forEach((e)->System.out.println(e));

//        m.entrySet().stream().forEach((entry) -> {
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println("Key -> " + key + " & Value -> " + value);
//        });

        Stream.of(m.entrySet()).forEach((entry) -> {
            entry.forEach((e) -> {
                System.out.println("Key -> " + e.getKey() + " & Value -> " + e.getValue());
            });
        });
    }
}