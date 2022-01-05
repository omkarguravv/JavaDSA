package com.omkar.assignments;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
//        Write a program to print whether a number is even or odd, also take input.
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
      if (num%2==0){
          System.out.println("even");
      }else {
          System.out.println("odd");
      }
    }
}
