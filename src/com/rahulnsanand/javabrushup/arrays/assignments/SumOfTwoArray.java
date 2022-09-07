package com.rahulnsanand.javabrushup.arrays.assignments;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfTwoArray {


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

            int[] arr1 = takeInput();
            int[] arr2 = takeInput();

            int[] output = new int[1 + Math.max(arr1.length, arr2.length)];

            sumOfTwoArrays(arr1, arr2, output);
            printArray(output);

            t -= 1;
        }
    }

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        long firstNumber=0, secondNumber=0, resultantValue;


        for(int i=0; i<arr1.length; i++) {
            firstNumber = (firstNumber*10) + arr1[i];
        }
        for(int i=0; i<arr2.length; i++) {
            secondNumber = (secondNumber*10) + arr2[i];
        }

        resultantValue = firstNumber+secondNumber;

        int position=output.length-1;

        while(resultantValue>0){
            output[position] = (int) (resultantValue%10);
            position--;
            resultantValue /= 10;
        }

    }
}
