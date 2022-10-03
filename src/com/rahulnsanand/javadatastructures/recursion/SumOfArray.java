package com.rahulnsanand.javadatastructures.recursion;

import java.util.Scanner;

public class SumOfArray {
    static Scanner s = new Scanner(System.in);

    public static void run() {
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        System.out.println(sum(input));
    }
    public static int sum(int input[]) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        if(input.length == 1){
            return input[0];
        }

        int[] smallerArray = new int[input.length-1];

        for(int i=1; i<input.length; i++){
            smallerArray[i-1] = input[i];
        }

        int totalSum = 0;
        totalSum = input[0] + sum(smallerArray);

        return totalSum;

    }
}
