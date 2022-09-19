package com.rahulnsanand.javadatastructures.twodimensionalarrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RowWiseSum {
    public static void rowWiseSum(int[][] mat) {
        //Your code goes here
        int rowLength = mat.length;
        if(rowLength>0){
            int colLength = mat[0].length;
            int currentSum;
            for(int j=0; j<rowLength; j++){
                currentSum = 0;
                for(int i=0; i<colLength; i++){
                    currentSum += mat[j][i];
                }
                System.out.print(currentSum+" ");
            }

        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[][] take2DInput() throws IOException {
        String[] strRowsCols = br.readLine().trim().split("\\s");
        int n_rows = Integer.parseInt(strRowsCols[0]);
        int m_cols = Integer.parseInt(strRowsCols[1]);

        if (n_rows == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[n_rows][m_cols];

        for (int row = 0; row < n_rows; row++) {
            String[] strNums;
            strNums = br.readLine().trim().split("\\s");

            for (int col = 0; col < m_cols; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }


    public static void run() throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            rowWiseSum(mat);
            System.out.println();

            t -= 1;
        }
    }
}
