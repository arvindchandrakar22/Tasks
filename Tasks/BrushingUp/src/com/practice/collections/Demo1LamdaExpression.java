package com.practice.collections;

import java.util.*;

public class Demo1LamdaExpression {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(7);

        System.out.println("Integer Values In Array List Are :: ");
        list.forEach((n) -> {System.out.print(n +" ");});

        //Sorting The Element In ArrayList

        Collections.sort(list,(o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
        System.out.println("\nInteger Values In Array List After Sorting :: ");
        list.forEach((n) -> {System.out.print(n +" ");});

        System.out.println("\nValue at specific Index is :: ");
        System.out.print(list.get(4));

        HashMap<Integer,String> fruits = new HashMap<>();

        fruits.put(1,"Mango");
        fruits.put(2,"Kiwi");
        fruits.put(3,"Banana");
        fruits.put(4,"Pineapple");
        fruits.put(5,"Orange");

        System.out.println("\nHashMap contains Fruits Name as :: ");

//        for(Map.Entry<Integer,String> m : fruits.entrySet())
//        {
//            System.out.println(m.getKey() +" "+ m.getValue());
//        }

        fruits.forEach((i,j)->{
            System.out.println(i+" "+j);
        });

        TreeMap<Integer,String> colors = new TreeMap<>();

        colors.put(101,"Black");
        colors.put(102,"White");
        colors.put(103,"Green");
        colors.put(104,"Blue");
        colors.put(105,"Red");

        System.out.println("\nTreeMap contains Colors Name as :: ");

        colors.forEach((i,j)->{
            System.out.println(i+" "+j);
        });

        colors.replace(101,"Yellow");

        System.out.println("\nTreeMap contains Colors Name as :: ");

        colors.forEach((i,j)->{
            System.out.println(i+" "+j);
        });
    }
}
