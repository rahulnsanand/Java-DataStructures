package com.rahulnsanand.javabrushup.pattern;

import java.util.Scanner;

public class ReverseNumberPattern {
    public static void run(){
        Scanner scanner=new Scanner (System.in);
        int n = scanner.nextInt();
        int i = 1;
        while(i<=n){
            int j=i;
            while(j>0){
                System.out.print(j);
                j -= 1;
            }
            System.out.println();
            i += 1;
        }
    }
}
