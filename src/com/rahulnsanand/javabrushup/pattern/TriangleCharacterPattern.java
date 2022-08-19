package com.rahulnsanand.javabrushup.pattern;

import java.util.Scanner;

public class TriangleCharacterPattern {
    public static void run(){
        System.out.println("Enter the value of row x col :");
        Scanner scanner=new Scanner (System.in);
        int n = scanner.nextInt();
        int charAValue = 'A';
        int i = 1;
        while(i<=n){
            int j=0;
            while(j<i){
                System.out.print((char) (charAValue+j));
                j += 1;
            }
            charAValue += 1;
            System.out.println();
            i += 1;
        }
    }
}
