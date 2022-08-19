package com.rahulnsanand.javabrushup.pattern;

import java.util.Scanner;

public class DiamondOfStars {
    public static void run(){
        System.out.println("Enter the value of row x col :");
        Scanner scanner=new Scanner (System.in);
        int n = scanner.nextInt();
        int i = 1, spaceCount, reverseCount;
        while(i<=(n/2)+1){
            spaceCount = 0;
            while(spaceCount<=((n/2)-i)){
                System.out.print(" ");
                spaceCount++;
            }

            reverseCount = (n/2) - spaceCount;

            while(spaceCount<=(n/2)){
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
        i=1;
        while(i<((n/2)+1)){
            spaceCount = 0;

            while(spaceCount<i){
                System.out.print(" ");
                spaceCount++;
            }

            reverseCount = (n/2) + 1 - spaceCount;

            while(reverseCount>0){
                System.out.print("*");
                reverseCount--;
            }

            reverseCount = (n/2) - spaceCount;

            while(reverseCount>0){
                System.out.print("*");
                reverseCount--;
            }

            System.out.println();
            i += 1;
        }
    }
}
