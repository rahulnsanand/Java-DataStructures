package com.rahulnsanand.javabrushup.test;

import java.util.Scanner;

public class PalindromeNumber {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int originalNumber = scanner.nextInt();
        int reversedValue = 0, tempValue = originalNumber;

        while(tempValue>0){

            reversedValue = (reversedValue*10) + tempValue%10;

            tempValue = tempValue/10;
        }

        if(originalNumber == reversedValue){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
