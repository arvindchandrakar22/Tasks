package com.practice.fuctionalInterface;

import java.util.function.Function;

public class Demo2 {
    public static void main(String[] args) {

        Function<Double, Double> half = (a) -> a / 2;
        Function<Double, Double> twice = (a) -> a * a;

        Function<Double, Double> squareAndThenCube = half.andThen(twice);
        Double result = squareAndThenCube.apply(3d);
        System.out.println("squareAndThenCube :: "+result);

        Function<Double, Double> squareComposeCube = half.compose(twice);
        result = squareComposeCube.apply(3d);
        System.out.println("squareComposeCube :: "+result);


    }
}
