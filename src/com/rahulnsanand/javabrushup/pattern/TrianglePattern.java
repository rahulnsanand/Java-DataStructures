package com.rahulnsanand.javabrushup.pattern;

import java.util.Scanner;

public class TrianglePattern {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. \n[1       ] :\n[1 2     ] :\n[1 2 n-1 ] :");
        System.out.println("2. \n[1       ] :\n[2 3     ] :\n[4 5 6   ] :");
        System.out.println("3. \n[1       ] :\n[2 3     ] :\n[3 4 5   ] :");

        int choice = scanner.nextInt();
        switch (choice){
            case 1 -> {
                System.out.println("Enter the value of row x col :");
                int n = scanner.nextInt();
                int i = 1;
                while(i<=n){
                    int j=1;
                    while(j<=i){
                        System.out.print(j+"\t");
                        j += 1;
                    }
                    System.out.println();
                    i += 1;
                }
            }
            case 2 -> {
                System.out.println("Enter the value of row x col :");
                int n = scanner.nextInt();
                int count = 1;
                for(int i=1; i<=n; i++){
                    for(int j=1; j<=i; j++){
                        System.out.print(count+"\t");
                        count++;
                    }
                    System.out.println();
                }
            }
            case 3 -> {
                System.out.println("Enter the value of row x col :");
                int n = scanner.nextInt();
                for(int i=1; i<=n; i++){
                    for(int j=0; j<i; j++){
                        System.out.print((i+j)+"\t");
                    }
                    System.out.println();
                }
            }
        }
    }
}
