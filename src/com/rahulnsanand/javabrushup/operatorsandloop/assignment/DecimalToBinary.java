package com.rahulnsanand.javabrushup.operatorsandloop.assignment;

import java.util.Scanner;

public class DecimalToBinary {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int numberValue = scanner.nextInt();
        //12
        int currentRemainder, counter = 0;
        long decimalValue = 0;
        String reversedDecimalValue = "";

        while(numberValue>0){
            currentRemainder = numberValue%2;
            if(currentRemainder==0){
                reversedDecimalValue += '0';
            } else {
                reversedDecimalValue += '1';
            }
            counter++;
            numberValue = numberValue/2;
        }
        System.out.println();

        while(counter>0){
            if(reversedDecimalValue.charAt(counter-1)=='0'){
                decimalValue = decimalValue * 10;
            } else {
                decimalValue = decimalValue * 10 + 1;
            }
            counter--;
        }
        System.out.println(decimalValue);
    }
}
