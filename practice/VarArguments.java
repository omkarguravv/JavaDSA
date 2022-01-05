package com.omkar.practice;


import java.util.Arrays;

public class VarArguments {
    public static void main(String[] args) {
      fun(1,2,1,1,12,12,12,1,2,1);
}

     static void fun(int a, int ...v){
         System.out.println(Arrays.toString(v));

    }
}















