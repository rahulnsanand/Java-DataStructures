package com.rahulnsanand.javadatastructures.test;

import java.util.Scanner;

public class FindLeadersInArray {

    public static void leaders(int[] input) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */
        int size = input.length, position = 0;
        int[] outputArray = new int[size];

        for (int i=size-1; i>0; i--){
            int j;
            for (j=i+1; j<size; j++) {
                if (input[i] < input[j])
                    break;
            }
            if (j == size) {
                System.out.print(input[i]+" ");
            }
        }

    }
    public static void run() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i = 0; i < n; i++){
            input[i] = s.nextInt();
        }
        leaders(input);
    }
}
