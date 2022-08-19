package com.rahulnsanand.javabrushup.fundamentals.assignments;

import java.util.Scanner;

public class FindFactors {

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int currentValue = 2;
        while(currentValue<inputValue){
            if(inputValue%(currentValue)==0){
                System.out.print(currentValue+" ");
            }
            currentValue++;
        }
    }

}
