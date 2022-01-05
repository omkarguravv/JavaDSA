package com.omkar.assignments;

import java.util.Scanner;

public class simplecalculator {
    public static void main(String[] args) {
//        Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner in = new Scanner(System.in);
        int num1= in.nextInt();
        int num2= in.nextInt();
    char ch = in.next().charAt(0);

        if (ch == '+') {
            System.out.println(num1+num2);

        }
        else if (ch == '-') {
            System.out.println(num1-num2);
        }
        else if (ch == '/') {
            System.out.println(num1/num2);
        }
        else if (ch == '*') {
            System.out.println(num1*num2);
        }
        else if (ch == '%') {
          if (num2!=0){
              System.out.println(num1%num2);
          }
            else
              System.out.println("cannot divide by 0");

        }
        else {
            System.out.println("invslid");
        }










    }
}
