package com.rahulnsanand.javabrushup.arrays.assignments;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindUnique {
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


    public static void run() throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input = takeInput();
            System.out.println(findUnique(input));

            t -= 1;
        }
    }

    public static int findUnique(int[] arr){
        //Your code goes here

        boolean isUnique;

        for(int i=0; i<arr.length; i++){
            isUnique = true;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j] && i!=j){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                return arr[i];
            }
        }
        return -1;
    }

}
