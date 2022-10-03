package com.rahulnsanand.javadatastructures.recursion.assignments;

import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int input){
        // Write your code here
        if(input/10==0){
            return input;
        }

        return input%10 + sumOfDigits(input/10);
    }
    public static void run() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(sumOfDigits(n));
    }
}
