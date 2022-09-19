package com.rahulnsanand.javadatastructures.functionsandscope;

import java.util.Scanner;
// 0 1 2  3 4 5
// 0 1 1  2 3 5
public class FibonacciNumber {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int first = 0, second = 1, currentValue = 0, i = 0;

        while(i<=n){
            if(currentValue == n || n == 1){
                System.out.println("true");
                return;
                // return true;
            }

            currentValue = first + second;
            first = second;
            second = currentValue;

            i++;
        }

        System.out.println("false");

    }
}
