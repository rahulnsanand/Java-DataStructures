package com.rahulnsanand.javadatastructures.operatorsandloop.assignment;

import java.util.Scanner;

public class TermsOfAP {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int numberValue = scanner.nextInt();
        int currentValue = 0, counter = 0, i=1;
        // 3N + 2 (%4 !=0)

        while(true){
            if(counter==numberValue){
                break;
            }
            currentValue = (3 * i) + 2;
            if(currentValue%4 != 0){
                System.out.print(currentValue+" ");
                counter++;
            }
            i++;
        }


    }
}
