package com.rahulnsanand.javabrushup.twodimensionalarrays.assignment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TotalSumOfBoundariesAndDiagonals {
    public static void totalSum(int[][] mat) {
        int requiredSum = 0;
        int rowLen = mat.length, colLen;
        if(rowLen>0){
            for (int i = 0; i < rowLen; i++) {
                colLen = mat[i].length;
                for (int j = 0; j < colLen; j++) {

                    if (i == j || (i + j) == colLen - 1) {
                        requiredSum += mat[i][j];
                    }

                    else if (i == 0 || j == 0 || i == colLen - 1|| j == colLen - 1) {
                        requiredSum += mat[i][j];
                    }
                }
            }
        }

        System.out.println(requiredSum);
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[][] take2DInput() throws IOException {
        int n = Integer.parseInt(br.readLine().trim());

        if (n == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[n][n];

        for (int row = 0; row < n; row++) {
            String[] strNums;
            strNums = br.readLine().trim().split("\\s");

            for (int col = 0; col < n; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }


    public static void run()  throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            totalSum(mat);
            System.out.println();

            t -= 1;
        }
    }
}
