package com.omkar.practice;


public class CountNumber {
    public static void main(String[] args) {
        int i = 7998;

        int count =0;
        while ( i > 0){
            int remainder = i % 10;
                    if(remainder==9){
                        count++;
                    }
                    i=i/10;
        }
        System.out.println(count);
    }
}
