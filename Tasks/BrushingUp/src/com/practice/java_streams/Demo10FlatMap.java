package com.practice.java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo10FlatMap {
    public static void main(String[] args) {

        List<String> teamA = Arrays.asList("Scott","David","John");
        List<String> teamB = Arrays.asList("Mary","Luna","Tom");
        List<String> teamC = Arrays.asList("Ken","Jony","Kitty");

        List<List<String>> playerInWorldCup = new ArrayList<List<String>>();
        playerInWorldCup.add(teamA);
        playerInWorldCup.add(teamB);
        playerInWorldCup.add(teamC);

//        playerInWorldCup.forEach(x->x.forEach(y-> System.out.println(y)));
        List<String> names = playerInWorldCup.stream()
                .flatMap(pList->pList.stream())
                .collect(Collectors.toList());

        System.out.println(names);



    }
}
