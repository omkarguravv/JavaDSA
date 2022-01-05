package com.omkar.assignments;

import java.util.Scanner;

public class fibonachiSeries {
    public static void main(String[] args) {
//        To calculate Fibonacci Series up to n numbers.
        System.out.println(fib(9));
    }
    static int fib(int num){
        {
            if (num <= 1) {
                return num;
            }
            else {
                return fib(num - 1) + fib(num - 2);
            }
            }

    }
}
