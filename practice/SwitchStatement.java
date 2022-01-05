package com.omkar.practice;


import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

//        switch (number) {
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("thur");
//            case 4 -> System.out.println("fri");
//            case 5 -> System.out.println("sat");
//            case 6 -> System.out.println("sun");
//            default -> System.out.println("invalid");
//        }






//        switch (number){
//            case 1:
//                System.out.println("monday");
//                break;
//
//            case 2:
//                System.out.println("tuesday");
//                break;
//            case 3:
//                System.out.println("thur");
//                break;
//            case 4:
//                System.out.println("fri");
//                break;
//            case 5:
//                System.out.println("sat");
//                break;
//            case 6:
//                System.out.println("sun");
//                break;
//            default:
//                System.out.println("invalid");
//


        switch (number) {
            case 1, 2, 3, 4 -> System.out.println("weekday");
            case 5, 6 -> System.out.println("weekend");
            default -> System.out.println("invalid");
        }
    }
}
