package com.rahulnsanand.javadatastructures.recursion;

import java.util.Scanner;

public class LastIndexOfNumberInArray {

    static Scanner s = new Scanner(System.in);

    public static int[] takeInput(){
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void run() {
        int[] input = takeInput();
        int x = s.nextInt();
        System.out.println(lastIndex(input, x));
    }

    public static int lastIndex(int input[], int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        if(input.length==0){
            return -1;
        } else if(input[input.length-1]==x){
            return input.length - 1;
        } else {
            int[] smallerArray = new int[input.length-1];
            for(int i=input.length-2; i>=0; i--){
                smallerArray[i]=input[i];
            }
            int returnedValue = lastIndex(smallerArray, x);

            if(returnedValue==-1){
                return -1;
            } else {
                return returnedValue;
            }
        }
    }
}
