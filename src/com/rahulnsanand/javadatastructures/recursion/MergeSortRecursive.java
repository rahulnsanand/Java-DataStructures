package com.rahulnsanand.javadatastructures.recursion;
import java.util.Scanner;
public class MergeSortRecursive {

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void printArray(int input[]) {
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }

    public static void run() {
        int[] input = takeInput();
        mergeSort(input);
        printArray(input);
    }

    public static void mergeSort(int[] input){
        // Write your code here
        int l = 0;
        int r = input.length-1;

        recursiveSortFunction(input, l, r);

    }

    private static void recursiveSortFunction(int[] input, int l, int r) {
        if (l < r) {
            int m = l + (r-l)/2;
            recursiveSortFunction(input, l, m);
            recursiveSortFunction(input, m + 1, r);
            merge(input, l, m, r);
        }
    }

    static void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
