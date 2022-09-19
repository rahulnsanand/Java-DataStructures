package com.rahulnsanand.javadatastructures.recursion.assignments;

import java.util.Scanner;

public class CountZeroes {
    public static int countZerosRec(int input){
        // Write your code here
        if(input==0){
            return 1;
        } else if(input/10==0){
            return 0;
        }
        int countValue;
        if(input%10==0){
            countValue = 1 + countZerosRec(input/10);
        } else {
            countValue = countZerosRec(input / 10);
        }

        return countValue;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(countZerosRec(n));
    }
}
