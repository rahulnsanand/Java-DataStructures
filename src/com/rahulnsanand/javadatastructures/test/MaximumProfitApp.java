package com.rahulnsanand.javadatastructures.test;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumProfitApp {
    public static int maximumProfit(int budget[]) {
        // Write your code here
        int outputValue = Integer.MIN_VALUE;
        Arrays.sort(budget);
        int N = budget.length;

        for (int i = 0; i < N; i++) {
            int count = (N - i);
            if (outputValue < count * budget[i]) {
                outputValue = count * budget[i];
            }
        }
        return outputValue;
    }

    public static void run() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i=0;i<n;i++)
            input[i] = s.nextInt();

        System.out.println(maximumProfit(input));
    }
}
