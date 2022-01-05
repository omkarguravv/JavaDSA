package com.omkar.practice;


import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b= in.nextInt();
        int c = in.nextInt();

        int result =  Math.max(c,Math.max(a,b));
        System.out.println(result);
    }
}
