package com.omkar.assignments;

import java.util.*;

public class maxNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1= in.nextInt();
        int num2= in.nextInt();

        if (num1>num2){
            System.out.println(num1 +" " +"is greater than"+ " " + num2);
        }
        else if (num2>num1){
            System.out.println(num2+" " + "is greater than"+ " " + num1);
        }
        else System.out.println("zero");

    }
}
