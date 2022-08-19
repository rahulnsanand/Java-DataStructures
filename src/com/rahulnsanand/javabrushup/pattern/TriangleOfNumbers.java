package com.rahulnsanand.javabrushup.pattern;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void run(){
        System.out.println("Enter the value of row x col :");
        Scanner scanner=new Scanner (System.in);
        int n = scanner.nextInt();
        int i = 1, j, spaceCount, reverseCount;
        while(i<=n){
            spaceCount = 1;
            while(spaceCount<=(n-i)){
                System.out.print(" ");
                spaceCount++;
            }

            reverseCount = n - spaceCount;
            j = i;

            while(spaceCount<=n){
                System.out.print(j);
                j++;
                spaceCount++;
            }
            j--;
            while(reverseCount>0){
                j --;
                System.out.print(j);
                reverseCount--;
            }

            System.out.println();
            i += 1;
        }
    }
}
