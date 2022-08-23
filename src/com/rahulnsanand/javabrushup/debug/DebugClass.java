package com.rahulnsanand.javabrushup.debug;

import java.util.Scanner;

public class DebugClass {

    public static void debugThis(){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int maxnum = 0;
        int i = 1;
        while(n/i>0){

            int newnum = (n / (i*10)) * i + n%i;

            System.out.println(newnum);

            i=i*10;
            if(maxnum<newnum){
                maxnum=newnum;
            }
        }
        System.out.println(maxnum);
    }

}

//1929
//1930
//1931
//1938