package com.practice.fuctionalInterface;

import java.util.function.Consumer;

public class Demo13ConsumerChaining {
    public static void main(String[] args) {

        Consumer<String> c1 = s-> System.out.println(s+" is WHITE.");
        Consumer<String> c2 = s-> System.out.println(s+" is having four leg.");
        Consumer<String> c3 = s-> System.out.println(s+" is eating grass.");

//        c1.accept("Cow");
//        c2.accept("Cow");
//        c3.accept("Cow");

//        c1.andThen(c2).andThen(c3).accept("Cow");

        Consumer<String> c4 = c1.andThen(c2).andThen(c3);
        c4.accept("Cow");
    }
}
