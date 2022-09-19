package com.rahulnsanand.javadatastructures.pattern;

import java.util.Scanner;

public class AlphaPattern {
    public static void run(){
        System.out.println("Enter the value of row x col :");
        Scanner scanner=new Scanner (System.in);
        int n = scanner.nextInt();
        int charAValue = 'A';
        int i = 1;
        while(i<=n){
            int j=i;
            while(j>0){
                System.out.print((char) (charAValue));
                j -= 1;
            }
            charAValue += 1;
            System.out.println();
            i += 1;
        }
    }
}
