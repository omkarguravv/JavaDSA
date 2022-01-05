package com.omkar.practice;


import java.util.Arrays;

public class arrayChangeNumber {
    public static void main(String[] args) {
        int[] num = {1,3 ,5 ,6,9};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[] arr){
        arr[1]=7777;
    }
}
