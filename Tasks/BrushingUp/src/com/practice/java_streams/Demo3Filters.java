package com.practice.java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3Filters {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("cup",null,"forest","sky","book",null,"theater");
        List<String> result = new ArrayList<>();

        result = words.stream().filter(w->w!=null).collect(Collectors.toList());
        System.out.println(result);

        words.stream().filter(w->w!=null).map(s->s+" ").forEach(System.out::print);
    }
}
