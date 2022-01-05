package com.omkar.practice;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIpOp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);
        //ip
        for (int i = 0; i < 5; i++) {
           list.add(in.nextInt());
        }
        // op
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //arr[index] not allowed
        }
    }
}
