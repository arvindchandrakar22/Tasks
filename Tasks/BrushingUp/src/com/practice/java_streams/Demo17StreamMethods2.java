package com.practice.java_streams;

import java.util.HashSet;
import java.util.Set;

public class Demo17StreamMethods2 {
    public static void main(String[] args) {

        //anyMatch()
        //allMatch()
        //noneMatch()

        Set<String> fruites = new HashSet<String>();
        fruites.add("One Apple");
        fruites.add("One Mango");
        fruites.add("Two Apples");
        fruites.add("More Grapes");
        fruites.add("Two Guavas");

        boolean result = fruites.stream().anyMatch(value -> {
            return value.startsWith("One");//any value may start with "One",than this will return true
        });
        System.out.println(result);

        result = fruites.stream().allMatch(value -> {
            return value.startsWith("One"); //All value should start with "One", than only this will return true
        });
        System.out.println(result);

        result = fruites.stream().noneMatch(value -> {
            return value.startsWith("One");//None of the match should start with "One" so that this will return true
        });
        System.out.println(result);
    }
}
