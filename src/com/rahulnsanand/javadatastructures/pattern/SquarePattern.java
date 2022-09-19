package com.rahulnsanand.javadatastructures.pattern;

import java.util.Scanner;

public class SquarePattern {

    public static void run(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. [1 1 1 1] :");
        System.out.println("2. [1 2 3 n] :");
        System.out.println("3. [n 3 2 1] :");

        int choice = scanner.nextInt();
        switch (choice){
            case 1 -> {
                System.out.println("Enter the value of row x col :");
                int n = scanner.nextInt();
                int i = 1;
                while(i<=n){
                    int j=1;
                    while(j<=n){
                        System.out.print(i);
                        j += 1;
                    }
                    System.out.println();
                    i += 1;
                }
            }
            case 2 -> {
                System.out.println("Enter the value of row x col :");
                int n = scanner.nextInt();
                int i = 1;
                while(i<=n){
                    int j=1;
                    while(j<=n){
                        System.out.print(j);
                        j += 1;
                    }
                    System.out.println();
                    i += 1;
                }
            }
            case 3 -> {
                System.out.println("Enter the value of row x col :");
                int n = scanner.nextInt();
                int i = n;
                while(i>=1){
                    int j=n;
                    while(j>=1){
                        System.out.print(j);
                        j -= 1;
                    }
                    System.out.println();
                    i -= 1;
                }
            }
        }

    }

}
