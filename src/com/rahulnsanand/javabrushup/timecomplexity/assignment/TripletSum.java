package com.rahulnsanand.javabrushup.timecomplexity.assignment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TripletSum {

    public static int tripletSum(int[] arr, int num) {
        int n = arr.length, counter = 0, newTargetSum;
        Arrays.sort(arr);

        for (int i=0; i<n; i++) {
            newTargetSum = num-arr[i];
            int leftIndex = i+1;
            int rightIndex = arr.length - 1;

            while (leftIndex < rightIndex) {
                int sumValue = arr[leftIndex] + arr[rightIndex];

                if(sumValue < newTargetSum){
                    leftIndex++;
                } else if(sumValue > newTargetSum){
                    rightIndex--;
                } else {
                    if(arr[leftIndex]==arr[rightIndex]){
                        int numOfSameValues = rightIndex - leftIndex;
                        int countValue = (numOfSameValues*(numOfSameValues+1))/2;
                        counter += countValue;
                        break;
                    }
                    int noOfSameLeftElements = 1;
                    int noOfSameRightElements = 1;
                    while(arr[leftIndex]==arr[leftIndex+1]){
                        noOfSameLeftElements++;
                        leftIndex++;
                    }
                    while(arr[rightIndex]==arr[rightIndex-1]){
                        noOfSameRightElements++;
                        rightIndex--;
                    }

                    int numOfSameLeftAndRightElement = noOfSameLeftElements * noOfSameRightElements;

                    counter += numOfSameLeftAndRightElement;
                    leftIndex++;
                    rightIndex--;
                }
            }
        }

        return counter;
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }

        String[] strNums;
        strNums = br.readLine().split("\\s");


        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void run() throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] arr = takeInput();
            int num = Integer.parseInt(br.readLine().trim());
            System.out.println(tripletSum(arr, num));

            t -= 1;
        }
    }
}
