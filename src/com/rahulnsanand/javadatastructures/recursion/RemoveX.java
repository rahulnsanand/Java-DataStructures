package com.rahulnsanand.javadatastructures.recursion;

import java.util.Scanner;

public class RemoveX {
    public static void run() {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(removeX(input));
    }
    public static String removeX(String input){
        // Write your code here
        if(input.length()==0){
            return input;
        }

        String modifiedOutput = removeX(input.substring(1));

        if(input.charAt(0)!='x'){
            modifiedOutput = input.charAt(0) + modifiedOutput;
        }

        return modifiedOutput;
    }
}
