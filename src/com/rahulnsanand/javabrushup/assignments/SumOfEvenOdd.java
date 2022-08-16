package com.rahulnsanand.javabrushup.assignments;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();

        while(inputValue>0){
            System.out.println(inputValue%10);
            inputValue %= 10;
        }
    }
}
