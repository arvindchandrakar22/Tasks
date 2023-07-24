package com.practice.java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo19StreamMethod2 {
    public static void main(String[] args) {
        //concatenating streams

        List<String> animalsList = Arrays.asList("Dog","Cat","Elephant");
        List<String> birdsList = Arrays.asList("Peackock","Parrot","Crow");

        Stream<String> stream1 = animalsList.stream();
        Stream<String> stream2 = birdsList.stream();

        List<String> finalList = Stream.concat(stream1,stream2).collect(Collectors.toList());
        finalList.forEach(s->{
            System.out.println(s);
        });

    }
}
