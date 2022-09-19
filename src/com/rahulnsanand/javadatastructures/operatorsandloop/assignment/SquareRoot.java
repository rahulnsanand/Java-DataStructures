package com.rahulnsanand.javadatastructures.operatorsandloop.assignment;

import java.util.Scanner;

public class SquareRoot {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int numberValue = scanner.nextInt();
        long squareRootValue = numberValue/2;
        boolean stillSearching = true;
        while(stillSearching){
            if(squareRootValue * squareRootValue <= numberValue){
                stillSearching = false;
            }
            squareRootValue--;
        }
        System.out.println(squareRootValue+1);
    }
}
