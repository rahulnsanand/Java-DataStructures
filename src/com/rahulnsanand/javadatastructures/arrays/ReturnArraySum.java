package com.rahulnsanand.javadatastructures.arrays;

import java.util.Scanner;

public class ReturnArraySum {

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[], size;
        for(int i=1; i<=n; i++){
            size = scanner.nextInt();
            arr = new int[size];
            for(int j=0; j<size; j++){
                arr[j] = scanner.nextInt();
            }
            System.out.println(sum(arr));

        }
    }

    public static int sum(int[] arr) {
        //Your code goes here
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }

}
