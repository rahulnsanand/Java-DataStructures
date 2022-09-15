package com.rahulnsanand.javabrushup.debug;

import java.util.Scanner;

public class DebugClass {

    public static void debugThis(){
        int arr[] = new int[15];
        arr=change(arr);
        System.out.println(arr[7]);

        System.out.println();
    }

    public static int [] change(int input[]){
        input = new int[5];
        input[3] = 15;
        return input;
    }

}
