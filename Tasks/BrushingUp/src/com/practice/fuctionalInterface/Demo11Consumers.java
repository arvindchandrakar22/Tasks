package com.practice.fuctionalInterface;

import java.util.function.Consumer;

public class Demo11Consumers {
    public static void main(String[] args) {

        Consumer<String> c = s -> System.out.println(s);
        c.accept("Hello, Have a nice day !!");
    }
}
