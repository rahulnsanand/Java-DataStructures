package com.rahulnsanand.javadatastructures.timecomplexity.assignment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindUniqueElement {
    public static int findUnique(int[] arr) {
        if(arr.length % 2!=0){
            int listLen=arr.length;
            int currentMask=0;
            for(int i=0;i<listLen;i++){
                currentMask=currentMask ^ arr[i];
            }

            return currentMask;
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

            int[] arr = takeInput();
            System.out.println(findUnique(arr));

            t -= 1;
        }
    }
}
