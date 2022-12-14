package com.rahulnsanand.javadatastructures.recursion.assignments;
import java.text.DecimalFormat;
import java.util.Scanner;

public class GeometricSum {


    public static double findGeometricSum(int k){
        // Write your code here
        if(k==0) {
            return 1;
        }

        return 1 / Math.pow(2, k) + findGeometricSum(k-1);


    }


    public static void run() {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        double ans = findGeometricSum(k);
        DecimalFormat dec = new DecimalFormat("#0.00000");
        System.out.println(dec.format(ans));
    }
}
