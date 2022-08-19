package com.rahulnsanand.javabrushup.pattern.assignments;

import java.util.Scanner;

public class ParallelogramPattern {
    public static void run(){
        System.out.println("Enter the value of row x col :");
        Scanner scanner=new Scanner (System.in);
        int n = scanner.nextInt();
        int i=n, countHelp;
        while(i>0){

            countHelp = i;

            while(countHelp<n){
                System.out.print(' ');
                countHelp++;
            }

            countHelp = 1;
            while(countHelp<=n){
                System.out.print("*");
                countHelp++;
            }

            System.out.println();
            i--;

        }
    }
}
