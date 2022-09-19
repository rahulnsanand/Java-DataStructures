package com.rahulnsanand.javadatastructures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrangeNumbersInArray {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void run() throws IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            arrange(arr, n);
            printArray(arr);

            t -= 1;
        }
    }
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void arrange(int[] arr, int n) {
        //Your code goes here
        int i, position=0;
        for(i=1; i<=n; i+=2){
            arr[position] = i;
            position++;
            // System.out.print(i+" ");
        }
        if((i-2)>=n){
            for(i=n-1; i>=2; i-=2){
                arr[position] = i;
                position++;
                // System.out.print(i+" ");
            }
        } else {
            for(i=n; i>=2; i-=2){
                arr[position] = i;
                position++;
                // System.out.print(i+" ");
            }
        }


    }
}
