package com.rahulnsanand.javabrushup.test;

import java.util.Scanner;

public class MaximiseSum {
    public static long maximumSumPath(int[] input1, int[] input2) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, they are passed as function arguments.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        int i = 0, j = 0;
        int currSumArr1 = 0, currSumArr2 = 0, maximumSum = 0;

        while (i < input1.length && j < input2.length){
            if (input1[i] < input2[j]){
                currSumArr1 += input1[i];
                i++;
            } else if (input1[i] > input2[j]){
                currSumArr2 += input2[j];

                j++;
            } else {
                maximumSum += Math.max(currSumArr1, currSumArr2);
                maximumSum += input1[i];
                currSumArr1 = 0;
                currSumArr2 = 0;
                i++;
                j++;
            }
        }

        while (i < input1.length){
            currSumArr1 += input1[i];
            i++;
        }

        while (j < input2.length){
            currSumArr2 += input2[j];
            j++;
        }
        maximumSum += Math.max(currSumArr1, currSumArr2);

        return maximumSum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int input1[] = new int[m];
        for(int i = 0; i < m; i++) {
            input1[i] = s.nextInt();
        }
        int n = s.nextInt();
        int input2[] = new int[n];
        for(int i = 0; i < n; i++) {
            input2[i] = s.nextInt();
        }
        System.out.println(maximumSumPath(input1, input2));
    }
}
