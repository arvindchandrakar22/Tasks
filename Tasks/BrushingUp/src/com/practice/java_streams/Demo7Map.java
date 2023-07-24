package com.practice.java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo7Map {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(2,3,4,5,6,7,8,9);
        List<Integer> multipliedList = new ArrayList<>();

//        numberList.forEach(n->{
//            System.out.println(n*3);
//        });

        multipliedList = numberList.stream().map(n->(n*3)).collect(Collectors.toList());
        System.out.println(multipliedList);

    }
}
