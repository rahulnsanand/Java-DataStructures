package com.rahulnsanand.javabrushup.operatorsandloop;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int positionValue = scanner.nextInt();
        int first = 0, second = 1, temp = 1;

        if(positionValue == 1 || positionValue == 2){
            System.out.println(second);
        } else {
            for(int i=1; i<positionValue; i++){
                temp = first + second;
                first = second;
                second = temp;
            }
            System.out.println(temp);
        }
    }
}
