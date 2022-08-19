package com.rahulnsanand.javabrushup.pattern.assignments;

import java.util.Scanner;

public class SumPattern {
    public static void run(){
        System.out.println("Enter the value of row x col :");
        Scanner scanner=new Scanner (System.in);
        int n = scanner.nextInt();
        int i=1, countHelp, sum;
        while(i<=n){

            if(i==1){
                System.out.print("1=1");
            } else {

                countHelp = 1;
                sum = 0;
                while(countHelp<=i){
                    if(countHelp!=i){
                        System.out.print(countHelp + "+");
                    } else {
                        System.out.print(countHelp + "=");
                    }
                    sum += countHelp;
                    countHelp++;
                }
                System.out.print(sum);
            }

            System.out.println();
            i++;
        }
    }
}
