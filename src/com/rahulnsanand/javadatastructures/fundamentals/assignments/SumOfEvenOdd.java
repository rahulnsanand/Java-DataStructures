package com.rahulnsanand.javadatastructures.fundamentals.assignments;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int currentValue, sumEven=0, sumOdd=0;
        while(inputValue>0){
            currentValue = inputValue%10;

            if(currentValue%2==0){
                sumEven += currentValue;
            } else {
                sumOdd += currentValue;
            }

            inputValue /= 10;
        }
        System.out.println(sumEven+" "+sumOdd);
    }
}
