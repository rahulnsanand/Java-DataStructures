package com.rahulnsanand.javadatastructures.operatorsandloop;

import java.util.Scanner;

public class AllPrimeNumbers {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int numberValue = scanner.nextInt(),  currentValue = 2;
        boolean numberValueMet = true;

        while(numberValueMet){
            if(isPrime(currentValue) && currentValue<=numberValue) {
                System.out.println(currentValue);
            }
            currentValue++;

            if(currentValue>numberValue){
                numberValueMet = false;
            }
        }
    }
    static boolean isPrime(int checkValue){

        if (checkValue <= 1)
            return false;
        else if (checkValue == 2)
            return true;
        else if (checkValue % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(checkValue); i += 2){
            if (checkValue % i == 0)
                return false;
        }

        return true;
    }
}

