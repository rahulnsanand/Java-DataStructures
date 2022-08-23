package com.rahulnsanand.javabrushup.test;

import java.util.Scanner;

public class MaximumNumber {
    public static void run(int n){

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int tempValue = n, smallestValue=0, valuePosition = 0, position = 0, finalOutput = 0;



        while(tempValue>0){
            if(position==0){
                smallestValue = tempValue % 10;
                valuePosition = position;
            } else {
                if(smallestValue>=tempValue%10){
                    smallestValue = tempValue % 10;
                    valuePosition = position;
                }
            }

            position++;
            tempValue = tempValue /10;
        }

        tempValue = n;
        position = 0;

        while(tempValue>0){
            if(valuePosition!=position){
                if(position == 0){
                    finalOutput = tempValue % 10;
                } else {
                    finalOutput = (finalOutput * 10) + (tempValue % 10);
                }
            }

            position++;
            tempValue = tempValue / 10;
        }

        tempValue = finalOutput;
        position = 0;

        while(tempValue>0){
            if(position == 0){
                finalOutput = tempValue % 10;
            } else {
                finalOutput = (finalOutput * 10) + (tempValue % 10);
            }

            position++;
            tempValue = tempValue / 10;
        }

        System.out.println(finalOutput);

    }
}
