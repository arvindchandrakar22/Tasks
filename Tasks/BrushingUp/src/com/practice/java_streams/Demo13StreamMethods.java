package com.practice.java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo13StreamMethods {
    public static void main(String[] args) {

        //count()
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        long numberOfEvenNumbers = numberList.stream().filter(num->num%2==0).count();
        System.out.println(numberOfEvenNumbers);

        //min()
        Optional<Integer> min = numberList.stream().min((a,b)->{
            return a.compareTo(b);
        });
        System.out.println(min);

        Optional<Integer> max = numberList.stream().max((a,b)->{
            return a.compareTo(b);
        });
        System.out.println(max);

        System.out.println("Minimum value is :: "+min.get()+"\nMaximum value is :: "+max.get());


    }
}
