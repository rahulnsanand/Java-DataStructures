package com.rahulnsanand.javabrushup.debug;

import java.util.Scanner;

public class DebugClass {

    public static void debugThis(){
        String str1 = new String ("I love coding");
        String str2 = "I love coding";
        boolean check=(str1=="I love coding");
        System.out.println((str1 == str2) + " " + str1.equals(str2)+" " + check);

        System.out.println();
    }

    public static int [] change(int input[]){
        input = new int[5];
        input[3] = 15;
        return input;
    }

}
