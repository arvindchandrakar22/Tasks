package com.practice.java_streams;

import java.util.Arrays;
import java.util.List;

public class Demo15StreamMethods {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("A","B","C","1","2","3");
        Object arr[] = stringList.stream().toArray();

        System.out.println("Array Length : "+arr.length);
        Arrays.stream(arr).forEach(a-> System.out.print(a+" "));

    }
}
