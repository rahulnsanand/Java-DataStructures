package com.rahulnsanand.javabrushup.timecomplexity.assignment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateArray {
    public static void rotate(int[] arr, int num) {
        //Your code goes here
        int n = arr.length;
        int temp[] = new int[n];

        int k = 0;

        for (int i = num; i < n; i++) {
            temp[k] = arr[i];
            k++;
        }

        for (int i = 0; i < num; i++) {
            temp[k] = arr[i];
            k++;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

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

            int[] input = takeInput();
            int d = Integer.parseInt(br.readLine().trim());
            rotate(input, d);
            printArray(input);

            t -= 1;
        }
    }
}
