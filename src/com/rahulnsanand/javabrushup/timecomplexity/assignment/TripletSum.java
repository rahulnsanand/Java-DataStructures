package com.rahulnsanand.javabrushup.timecomplexity.assignment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TripletSum {
    public static int tripletSum(int[] arr, int num) {
        ArrayList <ArrayList<Integer>> ans = new ArrayList<>();
        int n = arr.length, counter = 0;
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            int target = num-arr[i];
            int front = i + 1;
            int back = n - 1;

            while (front < back) {
                int sum = arr[front] + arr[back];

                // Finding answer which starts from arr[i].
                if (sum < target) {
                    front++;
                }
                else if (sum > target) {
                    back--;
                }
                else {
                    int x = arr[front];
                    int y = arr[back];

                    ArrayList<Integer> list = new ArrayList<>();

                    list.add(arr[i]);
                    list.add(arr[front]);
                    list.add(arr[back]);
                    counter++;

                    // Incrementing front pointer until we reach a different number.
                    while (front < back && arr[front] == x) {
                        front++;
                    }

                    // Decrementing last pointer until we reach a different number.
                    while (front < back && arr[back] == y) {
                        back--;
                    }
                }
            }
            // Ensuring that we don't encounter duplicate values for arr[i].
            while (i + 1 < n && arr[i] == arr[i + 1]) {
                i++;
            }
        }
        return counter;
    }

    static void quickSort(int A[], int si, int ei) {
        int pi;

        if (si < ei) {
            pi = partition(A, si, ei);
            quickSort(A, si, pi - 1);
            quickSort(A, pi + 1, ei);
        }
    }
    static int partition(int A[], int si, int ei) {
        int x = A[ei];
        int i = (si - 1);
        int j;

        for (j = si; j <= ei - 1; j++) {
            if (A[j] <= x) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i + 1];
        A[i + 1] = A[ei];
        A[ei] = temp;
        return (i + 1);
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

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] arr = takeInput();
            int num = Integer.parseInt(br.readLine().trim());
            System.out.println(tripletSum(arr, num));

            t -= 1;
        }
    }
}
