package com.rahulnsanand.javadatastructures.pattern;

import java.util.Scanner;

public class TriangularStarPattern {
    public static void run(){
        System.out.println("Enter the value of row x col :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print("*");
                j += 1;
            }
            System.out.println();
            i += 1;
        }
    }
}
