package com.rahulnsanand.javabrushup.debug;

import java.util.Scanner;

public class DebugClass {

    public static void debugThis(){


        System.out.println();
    }

    public static String removeConsecutiveDuplicates(String s) {
        // Write your code here
        //aaab

        if(s.length()==0){
            return s;
        }
        int startIndex = 0, endIndex = 1, count = 0;
        while(s.charAt(startIndex)==s.charAt(endIndex)){
            endIndex++;
            count++;
        }
        String outputValue = removeConsecutiveDuplicates(s.substring(count+1));
        outputValue = s.charAt(0) + outputValue;
        return outputValue;
    }



    public static void print(int n){
        if(n < 0){
            return;
        }
        if(n == 0){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n--);
        System.out.print(n+" ");
    }
}
