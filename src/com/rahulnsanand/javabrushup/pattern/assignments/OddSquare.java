package com.rahulnsanand.javabrushup.pattern.assignments;

import java.util.Scanner;

public class OddSquare {
    public static void run(){
        System.out.println("Enter the value of row x col :");
        Scanner scanner=new Scanner (System.in);
        int n = scanner.nextInt();
        int i = 1, j;
        while(i<=n){
            int oddCounter = 2 * i - 1;
            j=n;
            while(j>=i){
                System.out.print(oddCounter);
                oddCounter = oddCounter +2;
                j--;
            }
            j = 1;
            int  secondary =1;
            while(j<=i-1){

                System.out.print(secondary);
                secondary= secondary+2;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
