package com.rahulnsanand.javabrushup.pattern.assignments;

import java.util.Scanner;

public class HalfDiamondPattern {
    public static void run(){
        System.out.println("Enter the value of row x col :");
        Scanner scanner=new Scanner (System.in);
        int n = scanner.nextInt();
        int i=0, countHelp;
        while(i<=n){
            System.out.print("*");


            countHelp = 0;
            while(countHelp<i){
                System.out.print(countHelp+1);
                countHelp++;
            }

            while(countHelp>1){
                System.out.print(countHelp-1);
                countHelp--;
            }

            if(i!=0){
                System.out.print("*");
            }
            System.out.println();
            i++;

        }

        i=n;
        while(i>=0){
            if(i!=0 || n==0){
                System.out.print("*");
            }

            countHelp = 1;

            while(countHelp<i){
                System.out.print(countHelp);
                countHelp++;
            }
            countHelp--;
            while(countHelp>1){
                System.out.print(countHelp-1);
                countHelp--;
            }

            if(i!=1 && i!=0){
                System.out.print("*");
            }
            System.out.println();
            i--;

        }
    }
}
