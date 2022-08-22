package com.rahulnsanand.javabrushup.test;

import java.util.Scanner;

public class CheckAP {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int numberOfValues = scanner.nextInt();
        int currentValue, previousValue = 0, currentDifferenceValue, prevDifferenceValue = 0;

        for(int i=1; i<=numberOfValues; i++){
            currentValue = scanner.nextInt();
            if(i > 2){
                currentDifferenceValue = currentValue - previousValue;
                if(currentDifferenceValue != prevDifferenceValue){
                    System.out.println("false");
                    return;
                }
            } else if (i==2){
                prevDifferenceValue = currentValue - previousValue;
            }

            previousValue = currentValue;
        }
        System.out.println("true");

    }
}
