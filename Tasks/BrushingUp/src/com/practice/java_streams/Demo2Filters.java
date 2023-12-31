package com.practice.java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2Filters {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");
        List<String> longNames = new ArrayList<String>();

//        longNames = names.stream().filter(str->str.length()>6&&str.length()<8).collect(Collectors.toList());
//        longNames.forEach(str-> System.out.println(str));

//        names.stream().filter(str->str.length()>6&&str.length()<8).forEach(str-> System.out.println(str));

        names.stream().filter(str->str.length()>6&&str.length()<8).forEach(System.out::println);

    }
}
