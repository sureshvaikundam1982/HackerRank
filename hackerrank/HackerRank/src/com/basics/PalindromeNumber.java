package com.basics;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int actual = sc.nextInt();
        int orginal = actual;
        int reveresed =0;
        while ( actual>0){
            int digit = actual %10;
            reveresed = reveresed * 10 + digit;
            actual = actual/10;
        }

        System.out.println(reveresed == orginal ? "Palaindrome":"Not A Palindrome");
    }
}
