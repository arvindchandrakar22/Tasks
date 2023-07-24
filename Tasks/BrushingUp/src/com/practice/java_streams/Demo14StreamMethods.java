package com.practice.java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo14StreamMethods {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("A","B","C","1","2","3");

        //reduce()
        Optional<String> reducedString = stringList.stream().reduce((value, combinedValue)->{
            return combinedValue+value;
        });
        System.out.println(reducedString.get());



    }
}
