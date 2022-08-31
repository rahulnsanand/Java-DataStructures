package com.rahulnsanand.javabrushup.arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BinarySearch {
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
        int[] input = takeInput();
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int x = Integer.parseInt(br.readLine().trim());
            System.out.println(binarySearch(input, x));

            t -= 1;
        }
    }

    public static int binarySearch(int[] arr, int x) {
        int halfPoint = arr.length/2;
        if(halfPoint<arr.length){
            if(x==arr[halfPoint]){
                return halfPoint;
            } else if(x>arr[halfPoint]){
                for(int i=halfPoint; i<arr.length; i++){
                    if(arr[i]==x){
                        return i;
                    }
                }
            } else {
                for(int i=0; i<halfPoint; i++){
                    if(arr[i]==x){
                        return i;
                    }
                }
            }
        }
        return -1;

    }
}
