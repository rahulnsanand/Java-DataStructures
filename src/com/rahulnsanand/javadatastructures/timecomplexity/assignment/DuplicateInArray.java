package com.rahulnsanand.javadatastructures.timecomplexity.assignment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DuplicateInArray {
    public static int findDuplicate(int[] arr) {
        //Your code goes here

        Arrays.sort(arr);

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                return arr[i];
            }
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

    public static void run() throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input = takeInput();
            System.out.println(findDuplicate(input));

            t -= 1;
        }
    }
}
