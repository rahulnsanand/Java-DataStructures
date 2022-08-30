package com.rahulnsanand.javabrushup.arrays.assignments;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortZeroOne {
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
            sortZeroesAndOne(input);
            printArray(input);

            t -= 1;
        }
    }

    public static void sortZeroesAndOne(int[] arr) {
        //Your code goes here
        int zeroCount = 0, oneCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zeroCount++;
            } else {
                oneCount++;
            }
        }
        int position =0;
        for(int i=0; i<zeroCount; i++){
            arr[position]=0;
        }
        for(int i=0; i<oneCount; i++){
            arr[position]=1;
        }
    }
}
