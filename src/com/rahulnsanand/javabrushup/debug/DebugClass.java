package com.rahulnsanand.javabrushup.debug;

import java.util.Scanner;

public class DebugClass {

    public static void debugThis(){
        int a=50;
        int b=Integer.MIN_VALUE;
        if(a/0==b)
        {

            System.out.println("Hello");
        }
        else
        {
            System.out.println("Hi");
        }
    }

}
