package com.rahulnsanand.javadatastructures.fundamentals.assignments;

import java.util.Scanner;

public class MultiplicationTable {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int baseNumber = scanner.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(baseNumber*i);
        }
    }
}
