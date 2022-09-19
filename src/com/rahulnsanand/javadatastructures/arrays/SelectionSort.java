package com.rahulnsanand.javadatastructures.arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SelectionSort {
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
            selectionSort(input);
            printArray(input);

            t -= 1;
        }
    }

    public static void selectionSort(int[] arr) {
        int temp, index;
        for(int i=0; i<arr.length-1; i++){
            index = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[index]>arr[j]){
                    index = j;
                }
            }

            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }


}
