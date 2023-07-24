package com.practice.fuctionalInterface;

import javax.swing.plaf.multi.MultiButtonUI;

@FunctionalInterface
interface Cab2 {
    public String bookCab(String source, String destination);
}

//class Ola implements Cab2{
//
//    @Override
//    public String bookCab(String source, String destination) {
//        System.out.println("Ola Cab is booked From "+source+" To "+destination);
//        return("Price :: ₹5000/-");
//    }
//}

public class Demo4 {
    public static void main(String[] args) {

//        Cab2 ola = new Ola();
//        System.out.println(ola.bookCab("Mumbai","Pune"));

//        Cab2 ola = ((source, destination) ->
//                System.out.println("Ola Cab is booked From "+source+" To "+destination));
//        ola.bookCab("Mumbai","Pune");
//
//        Cab2 uber = ((source, destination) ->
//                System.out.println("Uber Cab is booked From "+source+" To "+destination));
//        uber.bookCab("Mumbai","Pune");
//
//        Cab2 rapido = ((source, destination) ->
//                System.out.println("Rapido bike is booked From "+source+" To "+destination));
//        rapido.bookCab("Electronic City","Knowledge Park");

        Cab2 ola = ((source, destination) ->{
                System.out.println("Ola Cab is booked From "+source+" To "+destination);
                return("Price :: ₹5000/-");
        });
        System.out.println(ola.bookCab("Mumbai","Pune"));

        Cab2 uber = ((source, destination) -> {
            System.out.println("Uber Cab is booked From " + source + " To " + destination);
            return ("Price :: ₹5500/-");
        });
        System.out.println(uber.bookCab("Mumbai","Pune"));

        Cab2 rapido = ((source, destination) ->{
                System.out.println("Rapido bike is booked From "+source+" To "+destination);
                return("Price :: ₹300/-");
        });
        System.out.println(rapido.bookCab("Electronic City","Knowledge Park"));

    }
}
