package com.rahulnsanand.javadatastructures.arrays.assignments;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortZeroOneTwo {

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
            sort012(input);
            printArray(input);

            t -= 1;
        }
    }


    public static void sort012(int[] arr){
        int i=0 ,  countZero=0 , countOne=0 ,  countTwo=0, size=arr.length;;
        while(i<size){
            if (arr[i]==0){
                countZero = countZero + 1 ;
            }
            else if (arr[i]==1){
                countOne = countOne+1 ;
            }
            else{
                countTwo = countTwo+2 ;
            }
            i = i+1;
        }
        for(i=0; i<countZero; i++){
            arr[i] = 0 ;
        }
        for(i=countZero; i<countZero+countOne; i++){
            arr[i] = 1 ;
        }
        for(i=countZero+countOne; i<size; i++){
            arr[i] = 2 ;
        }
    }
}
