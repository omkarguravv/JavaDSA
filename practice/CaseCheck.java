package com.omkar.practice;


import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);           // trim removes spaces

        if (ch >='a' && ch <= 'z')
        {
            System.out.println("lowecase");

        }
        else{
            System.out.println("UPPERCASE");
        }
    }
}
