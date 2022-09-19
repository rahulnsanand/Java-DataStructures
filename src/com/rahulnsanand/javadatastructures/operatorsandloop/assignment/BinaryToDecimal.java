package com.rahulnsanand.javadatastructures.operatorsandloop.assignment;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int numberValue = scanner.nextInt();
        //1100
        int decimalValue = 0, counter = 0;
        int currentPoweredValue = 2;

        while(numberValue>0){
            if(counter==0){
                if((numberValue%10)==1){
                    decimalValue = 1;
                }
            } else {
                if((numberValue%10)==1){
                    currentPoweredValue = 2;
                    for(int i=1; i<counter; i++){
                        currentPoweredValue *= 2;
                    }
                    decimalValue += currentPoweredValue;
                }
            }

            counter++;
            numberValue /= 10;
        }

        System.out.println(decimalValue);
    }
}
