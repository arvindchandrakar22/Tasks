package com.practice.java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo6Map {
    public static void main(String[] args) {

        List<String> vehicle = Arrays.asList("bus","car","bicycle","flight","train");
        List<String> lengthOfVehicalName = new ArrayList<>();

//        vehicle.forEach(v->{
//            System.out.println(v.length());
//        });

//        vehicle.stream().map(v->v.length()).forEach(len-> System.out.println(len));
        vehicle.stream().map(v->v.length()).forEach(System.out::println);

    }
}
