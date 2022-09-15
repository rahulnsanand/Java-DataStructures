package com.rahulnsanand.javabrushup.test;

import java.util.Scanner;

public class FindMaximumSubArray {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] inputArray = new int[size];
        int kValue = sc.nextInt();

        for(int i=0; i<size; i++){
            inputArray[i]=sc.nextInt();
        }

        calcSum(inputArray, inputArray.length, kValue);
    }

    static void calcSum(int arr[], int n, int k) {
        int currentSum = 0, finalSumValue = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        if(currentSum > finalSumValue){
            finalSumValue = currentSum;
        }
        for (int i = k; i < n; i++) {
            currentSum = (currentSum - arr[i - k]) + arr[i];
            if(currentSum > finalSumValue){
                finalSumValue = currentSum;
            }
        }
        System.out.println(finalSumValue);
    }
}
