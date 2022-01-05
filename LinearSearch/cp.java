package com.omkar.LinearSearch;



import java.util.Scanner;

public class cp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
int num;
int ans = 0;
//        int ans = 0;
//        int num =1 ;
//        while (num !='x'){
//            num = in.next;
//
//
//            ans += num;
//        }
//        System.out.println(ans);

        num = in.nextInt();
        if (num == 'x'){
            System.out.println(ans);
        }else {
            ans = 0;
         num =1 ;
        while (num !='x'){
            num = in.nextInt();


            ans += num;
        }
        System.out.println(ans);
        }
        




    }

}


