package com.rahulnsanand.javadatastructures.pattern;

import java.util.Scanner;

public class CharacterPattern {
    public static void run(){
        System.out.println("Enter the value of row x col :");
        Scanner scanner=new Scanner (System.in);
        int n = scanner.nextInt();
        int charAValue = 'A';
        int i = 1;
        while(i<=n){
            int j=0;
            while(j<n){
                System.out.print((char) (charAValue+j));
                j += 1;
            }
            charAValue += 1;
            System.out.println();
            i += 1;
        }
    }
}
