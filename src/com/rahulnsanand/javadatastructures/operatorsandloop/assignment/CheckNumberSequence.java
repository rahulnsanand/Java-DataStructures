package com.rahulnsanand.javadatastructures.operatorsandloop.assignment;

import java.util.Scanner;

// 1 2 3 1

public class CheckNumberSequence {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int numberValue = scanner.nextInt();
        int currentNumber, prevNumber = -1;
        boolean isStrictIncreasing = false, isStrictDecreasing = false, lastStateIncreasing = false;
        for(int i=1; i<=numberValue; i++){
            currentNumber = scanner.nextInt();
            if(prevNumber == -1){
                prevNumber = currentNumber;
            } else {
                if(!isStrictDecreasing || !isStrictIncreasing){
                    if(currentNumber > prevNumber){
                        if(!isStrictIncreasing){
                            isStrictIncreasing = true;
                            lastStateIncreasing = true;
                        }
                        prevNumber = currentNumber;

                    } else if(currentNumber < prevNumber){
                        if(!isStrictDecreasing){
                            isStrictDecreasing = true;
                            lastStateIncreasing = false;
                        }
                        prevNumber = currentNumber;

                    } else {
                        isStrictIncreasing = false;
                        isStrictDecreasing = false;
                        break;
                    }
                } else {
                    if(currentNumber > prevNumber){
                        if(!lastStateIncreasing){
                            isStrictIncreasing = false;
                            isStrictDecreasing = false;
                            break;
                        }

                    } else if(currentNumber < prevNumber){
                        if(lastStateIncreasing){
                            isStrictIncreasing = false;
                            isStrictDecreasing = false;
                            break;
                        }

                    } else {
                        isStrictIncreasing = false;
                        isStrictDecreasing = false;
                        break;
                    }
                }
            }

        }

        if(isStrictDecreasing || isStrictIncreasing){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
