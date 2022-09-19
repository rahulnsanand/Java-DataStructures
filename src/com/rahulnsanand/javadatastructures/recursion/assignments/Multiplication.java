package com.rahulnsanand.javadatastructures.recursion.assignments;
import java.util.Scanner;

public class Multiplication {
    public static int multiplyTwoIntegers(int m, int n){
        // Write your code here
        if(n==0){
            return 0;
        }
        return m + multiplyTwoIntegers(m, --n);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println(multiplyTwoIntegers(m, n));
    }
}
