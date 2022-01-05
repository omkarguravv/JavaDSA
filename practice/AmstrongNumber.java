package com.omkar.practice;


import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        // sum of cube of individual number is equal to that number
        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();

        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)){
                System.out.print(i + " ");
            }

        }




    }

    static boolean isArmstrong(int num){
        int ans=0;
        int remainder;
        int cube =0;
        int n = num;

        while (num>0){
            remainder = num%10;
            cube =remainder*remainder*remainder;
            ans+= cube;
            num=num/10;



        }
//        if ( ans== n ){
//            System.out.println("true");
//        }
//        else {
//            System.out.println("false");
//        }
        return ans == n ;
    }
}
