package com.practice.designpattern.builderdesignpattern;

public class Shop {
    public static void main(String[] args) {

        Phone p1 = new Phone("Android",4,"Qualcomm",5.5,3100);
        System.out.println(p1);

        Phone p2 = new PhoneBuilder().setOs("Android").setRam(4).getPhone();
        System.out.println(p2);
    }
}
