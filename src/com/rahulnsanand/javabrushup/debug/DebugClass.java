package com.rahulnsanand.javabrushup.debug;

import java.util.Scanner;

public class DebugClass {

    public static void debugThis(){

        int arr[] = new int[5];
        arr[1] = 10;
        arr = new int[2];
        System.out.println(arr.length);

        System.out.println();
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
