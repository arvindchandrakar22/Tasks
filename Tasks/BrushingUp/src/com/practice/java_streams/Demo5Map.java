package com.practice.java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Demo5Map {
    public static void main(String[] args) {

        List<String> vehicle = Arrays.asList("bus","car","bicycle","flight","train");
        List<String> vehiclesListInUpperCase = new ArrayList<>();

//        vehicle.forEach(v-> {
//            vehiclesListInUpperCase.add(v.toUpperCase());
//        });
//
//        System.out.println(vehiclesListInUpperCase);

        vehiclesListInUpperCase = vehicle.stream().map(v->v.toUpperCase()).collect(Collectors.toList());
        System.out.println(vehiclesListInUpperCase);
    }
}
