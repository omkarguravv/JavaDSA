package com.omkar.practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        int ans =0;

        while (true)

        {
            System.out.print("Enter operator : ");
            char ch = in.next().trim().charAt(0);


            if (ch == '+' || ch == '-'|| ch == '*'||ch == '/'||ch == '%')
            {
                System.out.print("Enter number1 : ");


                int num1 =in.nextInt();
                System.out.print("Enter number2 : ");

                int num2 =in.nextInt();

                 if (ch == '+'){
                     ans = num1 + num2;
                 }
                if (ch == '-'){
                    ans = num1 - num2;
                }
                if (ch == '*'){
                    ans = num1 * num2;
                }
                if (ch == '/'){
                    if (num2 !=0){
                        ans = num1 / num2;
                    }
//                    else {
//                        System.out.println("denomintor cannot be zero");
//                    }

                }
                if (ch == '%'){
                    ans = num1 % num2;
                }


            }
                   else if (ch == 'x'|| ch =='X' )
                   {
                       break;
                   }

                   else{
            System.out.println("Invalid!!");
                         }


            System.out.println("Answer "+ " = " + ans);

        }
































    }
}
