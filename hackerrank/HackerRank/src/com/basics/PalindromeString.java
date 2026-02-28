package com.basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Enter A String");
        Scanner sc = new Scanner(System.in);
        String actual = sc.nextLine().trim();
        String reverse = "";
        for(int i=actual.length()-1;i>=0;i--){
            reverse+= actual.charAt(i);
        }
        if(actual.equalsIgnoreCase(reverse)) {
            System.out.println("The String is Palindrome");
        }
            else{
                System.out.println("The String is not a Plaindrome");
            }
    }
}
