package com.rahulnsanand.javadatastructures.arrays.assignments;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondLargestInArray {
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

            int[] input = takeInput();
            int ans = secondLargestElement(input);
            System.out.println(ans);

            t -= 1;
        }
    }

    public static int secondLargestElement(int[] arr) {
        //Your code goes here
        int largestCount = 0;
        int largestValue = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largestValue){
                largestValue = arr[i];
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] < largestValue && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
            largestCount++;
        }

        return secondLargest;
    }

}
