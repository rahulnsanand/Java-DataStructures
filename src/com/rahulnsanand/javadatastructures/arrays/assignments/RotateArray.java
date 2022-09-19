package com.rahulnsanand.javadatastructures.arrays.assignments;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateArray {

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

    public static void rotate(int[] arr, int d) {
        int[] firstHalf = new int[d];
        int[] secondHalf = new int[arr.length-d];

        for(int i=0; i<d; i++){
            firstHalf[i] = arr[i];
        }
        int inputPosition = d;
        for(int i=0; i<secondHalf.length; i++){
            secondHalf[i] = arr[inputPosition];
            inputPosition++;
        }
        int position = 0;
        for(int i=0; i<secondHalf.length; i++){
            arr[i] = secondHalf[i];
            position++;
        }
        for(int i=0; i<firstHalf.length; i++){
            arr[position] = firstHalf[i];
            position++;
        }

    }
}
