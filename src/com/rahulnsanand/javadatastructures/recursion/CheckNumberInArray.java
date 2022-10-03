package com.rahulnsanand.javadatastructures.recursion;

import java.util.Scanner;

public class CheckNumberInArray {

    static Scanner s = new Scanner(System.in);

    public static void run() {
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        int x = s.nextInt();
        System.out.println(checkNumber(input, x));
    }

    public static boolean checkNumber(int input[], int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if(input.length==1){
            if(input[0]!=x){
                return false;
            }
        }

        int[] smallerArray = new int[input.length-1];

        for(int i=1; i<input.length; i++){
            smallerArray[i-1] = input[i];
        }
        boolean isExists;

        if(input[0]==x){
            isExists = true;
        } else {
            isExists = checkNumber(smallerArray, x);
        }

        return isExists;

    }
}
