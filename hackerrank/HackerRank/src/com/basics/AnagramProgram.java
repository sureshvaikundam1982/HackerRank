package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word");
        String first = scanner.nextLine().replace("\s","").trim();
        System.out.println("Enter second word");
        String second = scanner.nextLine().replace("\s","").trim();
        if(first.length() != second.length()){
            System.out.println("Not a Anagram");
        }else{
            char[] firstArray = first.toCharArray();
            char[] secondArray = second.toCharArray();
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            if(Arrays.equals(firstArray,secondArray))
                System.out.println("The words are Anagram");
            else
                System.out.println("The words are not Anagram");
        }
    }
}
