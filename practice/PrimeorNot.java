package com.omkar.practice;


import java.util.Scanner;

public class PrimeorNot {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
        if (n<0){
            return false;
        }
        int c=2;
        while (c*c<=n){
            if (n%c==0){
                return false;
            }
            c++;
        }
        if(c*c>n){
            return true;
        }else {
            return false;
        }
    }
}


