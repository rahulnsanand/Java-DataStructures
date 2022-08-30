package com.rahulnsanand.javabrushup.debug;

import java.util.Scanner;

public class DebugClass {

    public static void debugThis(){

        int arr[] = new int[5];
        arr=change(arr);
        System.out.println(arr[0]);

        System.out.println();
    }

    public static int[] change(int input[]){
        input = new int[5];
        input[0] = 15;
        return input;
    }
    public static boolean isPrime(int x)
    {
        for(int i=2;i<x/2;i++)
        {
            if(x%i==0)
                return false;
        }
        return true;

    }
}
