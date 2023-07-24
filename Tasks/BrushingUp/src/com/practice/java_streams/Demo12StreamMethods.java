package com.practice.java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo12StreamMethods {
    public static void main(String[] args) {

        List<String> vehicalList = Arrays.asList("bus","car","bycle","bus","car","car","bike");

        //distinct()
//        List<String> distinctVehicle = vehicalList.stream().distinct().collect(Collectors.toList());
//        System.out.println(distinctVehicle);

        vehicalList.stream().distinct().forEach(value-> System.out.println(value));

        //count()
        long countDistinctVehicle = vehicalList.stream().distinct().count();
        System.out.println(countDistinctVehicle);

        //limit()
        List<String> limitedVehicleList = vehicalList.stream().limit(4).collect(Collectors.toList());
        System.out.println("Limited Vehicles :: "+limitedVehicleList);

    }
}
