package com.rahulnsanand.javabrushup.test;

import java.util.Scanner;

public class NumberStarPattern {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int nValue = scanner.nextInt();
        int j = 0, i;
        while(j<nValue){

            i=1;

            while (i<=(nValue-j)){
                System.out.print(i);
                i++;
            }

            int differenceGap = nValue - (i-1);

            while (differenceGap>0){
                System.out.print("*");
                differenceGap--;
            }

            int k=nValue - j;
            i=1;

            differenceGap = nValue - k;

            while (differenceGap>0){
                System.out.print("*");
                differenceGap--;
            }

            while(k>=i){
                System.out.print(k);
                k--;
            }

            System.out.println();
            j++;
        }

    }
}
