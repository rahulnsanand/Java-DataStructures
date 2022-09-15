package com.rahulnsanand.javabrushup.test;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaximumSubArray {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] inputArray = new int[size];
        int kValue = sc.nextInt();
        long maxSumValue = Integer.MIN_VALUE;
        int currentSumValue;

        for(int i=0; i<size; i++){
            inputArray[i]=sc.nextInt();
        }


        for(int i=0; i<=size-kValue;i++){
            currentSumValue = 0;
            for(int j=i; j<(i+kValue); j++){
                currentSumValue += inputArray[j];
            }
            if(currentSumValue>maxSumValue){
                maxSumValue = currentSumValue;
            }
        }



//        System.out.println(maxSumValue);
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
