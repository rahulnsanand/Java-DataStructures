package com.rahulnsanand.javabrushup.timecomplexity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEquilibriumIndex {
    public static int arrayEquilibriumIndex(int[] arr) {

        int arrayLen = arr.length;

        int sum = 0;
        int leftsum = 0;

        for (int i = 0; i < arrayLen; ++i)
            sum += arr[i];

        for (int i = 0; i < arrayLen; ++i) {
            sum -= arr[i];

            if (leftsum == sum)
                return i;

            leftsum += arr[i];
        }

        return -1;
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

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] arr = takeInput();
            System.out.println(arrayEquilibriumIndex(arr));

            t -= 1;
        }
    }
}
