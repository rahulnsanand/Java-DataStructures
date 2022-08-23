package com.rahulnsanand.javabrushup.operatorsandloop.assignment;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        String numberValueStr = scanner.next();
        int sizeOfValue = numberValueStr.length();
        boolean isTrailing = true;
        while(sizeOfValue>0){
            if(numberValueStr.toCharArray()[sizeOfValue-1]!='0'){
                isTrailing = false;
            }
            if(!isTrailing){
                System.out.print(numberValueStr.toCharArray()[sizeOfValue-1]);
            }
            sizeOfValue--;
        }
        if(isTrailing){
            System.out.println('0');
        }
    }
}
