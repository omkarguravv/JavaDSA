package com.omkar.assignments;
import java.util.*;

public class LcmHcf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2 , x ,y,temp ,lcm,hcf;

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        scanner.close();
        x  = num1;
        y  = num2 ;


        while (y!=0){
            temp = y;
            y = x % y;
            x = temp;

        }


        hcf = x;
        lcm = (num1*num2)/ hcf;
        System.out.println(lcm);
        System.out.println(hcf);
    }
}
