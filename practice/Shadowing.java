package com.omkar.practice;

public class Shadowing {
    static int x = 100;

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        x=1000;
        System.out.println(x);
        fun();

    }
    static void fun() {
        System.out.println(x);
    }
}
