package com.omkar.practice;


public class ReverseNumber {
    public static void main(String[] args) {
       //1ST METHOD
        int num =5214955;

//        do {
//            int remainder = num % 10;
//           num= num/10;
//            System.out.print(remainder);
//
//
//        }
//        while(num>0);

        //2nd METHOD
        int ans=0;
        while (num>0) {
            int remainder = num % 10;
            num /= 10;

            ans = ans *10 +remainder;


        }
        System.out.print(ans);


    }
}
