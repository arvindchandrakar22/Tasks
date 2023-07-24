package com.practice.fuctionalInterface;
@FunctionalInterface
interface Cab1 {
    public void bookCab();
}

//class Ola implements Cab1 {
//    @Override
//    public void bookCab() {
//        System.out.println("Ola Cab is booked...");
//    }
//}

public class Demo3 {
    public static void main(String[] args) {

//        Cab1 cab = new Ola();
//        cab.bookCab();

        Cab1 ola=()->System.out.println("Ola Cab is booked...");
        ola.bookCab();

        Cab1 uber=()->System.out.println("Uber Cab is booked...");
        uber.bookCab();

        Cab1 rapido=()->System.out.println("Rapido Bike is booked...");
        rapido.bookCab();

    }
}
