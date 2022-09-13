package com.rahulnsanand.javabrushup.debug;

import java.util.Scanner;

public class DebugClass {

    public static void debugThis(){

        int num = 3;
        print(num);


        System.out.println();
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
