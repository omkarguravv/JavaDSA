package com.omkar.practice;


public class arguments {
    public static void main(String[] args) {
      String a=  greeting("omkar");
        System.out.println(a);

    }

    static String greeting(String name)  {
        String messg = "hello "+ name;
//        System.out.println( messg);
        return messg;
    }
}
