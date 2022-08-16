package com.rahulnsanand.javabrushup;
// Created by Rahul Anand (C) 2022
// This is the main file to run in order to access the whole project

import com.rahulnsanand.javabrushup.assignments.*;
import com.rahulnsanand.javabrushup.debug.DebugClass;
import com.rahulnsanand.javabrushup.fundamentals.HelloWorld;
import com.rahulnsanand.javabrushup.fundamentals.SumOfNumbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("0 - Debug Class Run");
        System.out.println("1 - Hello World");
        System.out.println("2 - Sum of two Numbers");
        System.out.println("3 - Character Case Check");
        System.out.println("4 - Fahrenheit To Celcius");
        System.out.println("5 - Salary Calculator");
        System.out.println("6 - Multiplication Table");
        System.out.println("7 - Sum of Even & Odd");
        int choice = scannerInput.nextInt();
        switch (choice) {
            case 0 -> DebugClass.debugThis();
            case 1 -> HelloWorld.print();
            case 2 -> {
                System.out.println("Enter Number 1: ");
                int a = scannerInput.nextInt();
                System.out.println("Enter Number 2: ");
                int b = scannerInput.nextInt();
                SumOfNumbers.sum(a, b);
            }
            case 3 -> CharCaseCheck.run();
            case 4 -> FahrenheitToCelcius.run();
            case 5 -> SalaryCalculator.run();
            case 6 -> MultiplicationTable.run();
            case 7 -> SumOfEvenOdd.run();
        }
    }

}
