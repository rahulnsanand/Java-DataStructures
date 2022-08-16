package com.rahulnsanand.javabrushup.assignments;

import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void run(){
        int fahrenheitStartValue, fahrenheitEndValue, stepValue, currentCelValue;

        Scanner scanner = new Scanner(System.in);
        fahrenheitStartValue = scanner.nextInt();
        fahrenheitEndValue = scanner.nextInt();
        stepValue = scanner.nextInt();

        while(fahrenheitStartValue <= fahrenheitEndValue){

            currentCelValue = (int) ((fahrenheitStartValue - 32) * (.5556));
            System.out.println(fahrenheitStartValue + " " + currentCelValue);
            fahrenheitStartValue += stepValue;

        }
    }
}
