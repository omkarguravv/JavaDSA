package com.omkar.practice;


import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //primitive array
        int[] roll = new int[5];
        Scanner in = new Scanner(System.in);

//        for (int i = 0; i < roll.length ; i++) {
//            roll[i] = in.nextInt();
//
//
//        }
//        System.out.println(Arrays.toString(roll));
////        for (int i = 0; i < roll.length ; i++) {
//////            int num = in.nextInt();
////            System.out.print(roll[i] + " ");
////
////        }

        // OBJECT ARRAY
        String[] name = new String[4];


        for (int i = 0; i < name.length; i++) {
            name[i]= in.next();
        }
        System.out.println(Arrays.toString(name));
    }
}
