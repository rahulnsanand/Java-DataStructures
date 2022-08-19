package com.rahulnsanand.javabrushup.pattern;

import java.util.Scanner;

public class InvertedNumberPattern {
    public static void run(){
        System.out.println("Enter the value of row x col :");
        Scanner scanner=new Scanner (System.in);
        int i = scanner.nextInt(), j;
        while(i>0){
            j = i;
            while(j>0){
                System.out.print(i);
                j--;
            }
            System.out.println();
            i -= 1;
        }
    }
}
