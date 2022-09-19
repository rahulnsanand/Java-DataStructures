package com.rahulnsanand.javadatastructures.pattern;

import java.util.Scanner;

public class SimplePattern {

    public static void run(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of row x col :");
        int n = scanner.nextInt();
        int i = 1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print("*");
                j += 1;
            }
            System.out.println();
            i += 1;
        }
    }

}
