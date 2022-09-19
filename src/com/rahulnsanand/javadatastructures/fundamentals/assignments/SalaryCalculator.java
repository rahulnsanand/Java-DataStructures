package com.rahulnsanand.javadatastructures.fundamentals.assignments;

import java.util.Scanner;

public class SalaryCalculator {

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        double hraValue, daValue, pfValue;
        int allowanceValue, basicSalary = scanner.nextInt();
        char gradeValue = scanner.next().charAt(0);
        hraValue = (basicSalary * (20.0/100));
        daValue = (basicSalary * (50.0/100));
        pfValue = (basicSalary * (11.0/100));
        if(gradeValue == 'A'){
            allowanceValue = 1700;
        } else if (gradeValue == 'B'){
            allowanceValue = 1500;
        } else {
            allowanceValue = 1300;
        }

        System.out.println(Math.round((basicSalary + hraValue + allowanceValue + daValue - pfValue)));

    }
}
