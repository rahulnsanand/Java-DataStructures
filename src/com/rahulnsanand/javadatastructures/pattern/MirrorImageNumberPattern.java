package com.rahulnsanand.javadatastructures.pattern;

import java.util.Scanner;

public class MirrorImageNumberPattern {
    public static void run(){
        System.out.println("Enter the value of row x col :");
        Scanner scanner=new Scanner (System.in);
        int n = scanner.nextInt();
        int i = 1, spaceCount, starCount;
        while(i<=n){
            spaceCount = 1;
            while(spaceCount<=(n-i)){
                System.out.print(" ");
                spaceCount++;
            }
            starCount = 1;
            while(spaceCount<=n){
                System.out.print(starCount);
                starCount++;
                spaceCount++;
            }
            System.out.println();
            i += 1;
        }
    }
}
