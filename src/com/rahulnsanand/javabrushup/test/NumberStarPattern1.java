package com.rahulnsanand.javabrushup.test;

import java.util.Scanner;

public class NumberStarPattern1 {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int nValue = scanner.nextInt();
        int j = 1;
        while(j<=nValue){

            int i=nValue;

            while (i>j){
                System.out.print(i);
                i--;
            }

            System.out.print("*");

            int differenceGap = i - 1;

            while (differenceGap>0){
                System.out.print(differenceGap);
                differenceGap--;
            }

            System.out.println();
            j++;
        }

    }
}
