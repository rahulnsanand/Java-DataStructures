package com.rahulnsanand.javadatastructures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapAlternate {
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
            swapAlternate(input);
            printArray(input);

            t -= 1;
        }
    }

    private static void swapAlternate(int[] input) {
        int prev, current;
        for(int i=0; i<input.length; i++){
            if((i + 1) % 2 == 0){
                prev = input[i-1];
                current = input[i];
                input[i-1]=current;
                input[i]=prev;
            }

        }

    }
}
