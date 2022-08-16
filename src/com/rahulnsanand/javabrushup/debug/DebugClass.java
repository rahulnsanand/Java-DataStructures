package com.rahulnsanand.javabrushup.debug;

import java.util.Scanner;

public class DebugClass {

    public static void debugThis(){
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        boolean isprime=true;
        if(n%2==0)
            isprime=false;
        int i=3;
        while(isprime&&i<n)
        {
            isprime=!(n%i==0);
            i+=2;
        }
        if(isprime)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Composite");
        }

    }

}
