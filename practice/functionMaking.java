package com.omkar.practice;


import java.util.Scanner;

public class functionMaking {
    public static void main(String[] args) {

        sum();
    }
    static void sum(){
        Scanner in = new Scanner(System.in);

        System.out.print("number1: ");
        int num1 =in.nextInt();

        System.out.print("number2: ");
        int num2 =in.nextInt();

        int sum= num1+num2;
        System.out.println(sum);
    }
}
