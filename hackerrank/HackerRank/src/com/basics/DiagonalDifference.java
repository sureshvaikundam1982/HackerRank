package com.basics;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter number of rows and columns in the matrix:");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Please Enter the elements of the matrix:");

        // Reading matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Printing matrix properly
        System.out.println("\nPrinting matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " "); // space between elements
            }
            System.out.println(); // new line after each row
        }

        sc.close();

        System.out.println("\nCalculating diagonal difference...");
        int primary=0,secodary=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                primary+=matrix[i][i];
                secodary+=matrix[i][n-1-i];
            }
        }
        System.out.println(Math.abs(primary-secodary));
    }
}