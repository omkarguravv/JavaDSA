package com.omkar.practice;


import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimentionalArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//initializing
        for (int row = 0; row < 3; row++) {
            list.add(new ArrayList<>());
        }
// add elements
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                list.get(row).add(in.nextInt());
            }
        }
        System.out.print(list);
    }
}
