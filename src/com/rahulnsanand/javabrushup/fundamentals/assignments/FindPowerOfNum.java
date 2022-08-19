package com.rahulnsanand.javabrushup.fundamentals.assignments;

import java.util.Scanner;

public class FindPowerOfNum {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int finalProduct, baseNumber = scanner.nextInt();
        int powerValue = scanner.nextInt();
        if(powerValue==0 && baseNumber>0){
            finalProduct = 1;
        } else if(powerValue==0 && baseNumber==0){
            finalProduct = 1;
        } else {
            finalProduct = baseNumber;
            while(powerValue>1){
                finalProduct = baseNumber * finalProduct;
                powerValue--;
            }
        }

        System.out.println(finalProduct);
    }
}
