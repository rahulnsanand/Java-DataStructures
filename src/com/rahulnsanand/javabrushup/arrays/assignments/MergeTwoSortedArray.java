package com.rahulnsanand.javabrushup.arrays.assignments;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeTwoSortedArray {
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

            int[] input1 = takeInput();
            int[] input2 = takeInput();
            int[] ans = merge(input1, input2);
            printArray(ans);

            t -= 1;
        }
    }

    public static int[] merge(int arr1[], int arr2[]) {
        //Your code goes here
        int totalLen = arr1.length + arr2.length;
        int[] mergedArray = new int[totalLen];
        int[] outputArray = new int[totalLen];
        int position=0;
        for(int ar1=0; ar1<arr1.length; ar1++){
            mergedArray[position] = arr1[ar1];
            position++;
        }
        for(int ar2=0; ar2<arr2.length; ar2++){
            mergedArray[position] = arr2[ar2];
            position++;
        }

        //1 2 3 4
        //3 4 5 6
        int temp;
        for(int i=0; i<totalLen; i++){
            for(int j=i+1; j<totalLen-1; j++){
                if(mergedArray[i] > mergedArray[j]){
                    temp = mergedArray[j];
                    mergedArray[j] = mergedArray[i];
                    mergedArray[i] = temp;
                }
            }
        }


        return mergedArray;
    }
}
