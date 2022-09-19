package com.rahulnsanand.javadatastructures.operatorsandloop.assignment;

import java.util.Scanner;

public class SumOrProduct {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int numberValue = scanner.nextInt();
        int choiceValue = scanner.nextInt();
        int sumValue = 0, productValue = 1;
        if(choiceValue==1){
            for(int i=1; i<=numberValue; i++){
                sumValue += i;
            }
            System.out.println(sumValue);
        } else if (choiceValue==2){
            for(int i=1; i<=numberValue; i++){
                productValue *= i;
            }
            System.out.println(productValue);
        } else {
            System.out.println(-1);
        }


    }
}
