package com.rahulnsanand.javabrushup.pattern;

import java.util.Scanner;

public class StarPattern {
    public static void run(){
        System.out.println("Enter the value of row x col :");
        Scanner scanner=new Scanner (System.in);
        int n = scanner.nextInt();
        int i = 1, spaceCount, reverseCount;
        while(i<=n){
            spaceCount = 1;
            while(spaceCount<=(n-i)){
                System.out.print(" ");
                spaceCount++;
            }
            reverseCount = n - spaceCount;
            while(spaceCount<=n){
                System.out.print("*");
                spaceCount++;
            }

            while(reverseCount>0){
                System.out.print("*");
                reverseCount--;
            }

            System.out.println();
            i += 1;
        }
    }
}
