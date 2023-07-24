package com.practice.java_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo16StreamMethods2 {
    public static void main(String[] args) {

        //sorted
        List<Integer> list1 = Arrays.asList(2,4,1,3,7,5,9);

        List<Integer> sortedList1 = list1.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List (By default in ascending order) : "+sortedList1);

        List<Integer> sortedList2 = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted List in descending order : "+sortedList2);

        List<String> list2 = Arrays.asList("John","Mary","Kim","David","Smith");

        List<String> sortedList3 = list2.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList3);

        List<String> sortedList4 = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList4);

    }
}
