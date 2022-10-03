package com.rahulnsanand.javadatastructures.test;

import java.util.Scanner;

public class MaximiseSum {
    static long max(long x, long y) { return (x > y) ? x : y; }
    public static long maximumSumPath(int[] input1, int[] input2) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, they are passed as function arguments.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int m = input1.length, n = input2.length;

        long maxsum=0;
        long s1=0,s2=0;
        int i=0,j=0;

        while(i<m && j<n){
            if(input1[i]<input2[j]){
                s1+=input1[i];
                i++;
            }
            else if(input1[i]>input2[j]){
                s2+=input2[j];
                j++;
            }
            else{
                maxsum+=max(s1,s2)+input1[i];
                s1=0;
                s2=0;
                i++;
                j++;
            }
        }
        while (i<m)
            s1+=input1[i++];
        while (j<n)
            s2+=input2[j++];
        maxsum+=max(s1,s2);
        return maxsum;
    }
    public static void run() {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int input1[] = new int[m];
        for(int i = 0; i < m; i++) {
            input1[i] = s.nextInt();
        }
        int n = s.nextInt();
        int input2[] = new int[n];
        for(int i = 0; i < n; i++) {
            input2[i] = s.nextInt();
        }
        System.out.println(maximumSumPath(input1, input2));
    }
}
