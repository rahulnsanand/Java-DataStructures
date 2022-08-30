package com.rahulnsanand.javabrushup.arrays.assignments;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TripletSum {
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
            int x = Integer.parseInt(br.readLine().trim());
            //System.out.println(findTriplet(input, x));
            findTriplet(input, x);
            t -= 1;
        }
    }

    public static void findTriplet(int[] arr, int x) {

        int outputCount = 0, sum=0;
        for(int i=0; i<arr.length-2; i++){
            for(int j=i+1; j<arr.length-1; j++){
                for(int k=j+1; k<arr.length; k++){
                    sum = arr[i]+arr[(j)]+arr[k];
                    if(sum==x){
                        outputCount++;
                    }
                }
            }
        }
        System.out.println(outputCount);
       // return outputCount;
    }

}
