package com.practice.java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo18StreamMethods2 {
    public static void main(String[] args) {

        //findAny()
        //findFirst()

//        List<String> stringList = Arrays.asList("One","Two","Three","One");
//
//        Optional<String> ele = stringList.stream().findAny();
//        System.out.println(ele);
//        System.out.println(ele.get());

        List<String> stringList = Arrays.asList("One","Two","Three","One");

        Optional<String> ele = stringList.stream().findFirst();
        System.out.println(ele.get());



    }
}
