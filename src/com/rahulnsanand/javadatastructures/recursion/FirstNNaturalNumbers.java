package com.rahulnsanand.javadatastructures.recursion;

import java.util.Scanner;

public class FirstNNaturalNumbers {
    public static void run() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(count(n));
    }
    public static int count(int n){
        //Write your code here
        if(n==0){
            return 0;
        }
        int prevCount = count(n/10);

        return prevCount+1;
    }
}
