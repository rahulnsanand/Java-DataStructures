package com.rahulnsanand.javadatastructures.arrays;

import java.util.Scanner;

public class LinearSearch {

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[], size, x;
        for(int i=1; i<=n; i++){
            size = scanner.nextInt();
            arr = new int[size];
            for(int j=0; j<size; j++){
                arr[j] = scanner.nextInt();
            }
            x = scanner.nextInt();
            System.out.println(linearSearch(arr, x));

        }
    }

    public static int linearSearch(int arr[], int x) {

        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                return i;
            }
        }

        return -1;
    }

}
