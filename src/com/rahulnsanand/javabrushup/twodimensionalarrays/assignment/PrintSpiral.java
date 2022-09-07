package com.rahulnsanand.javabrushup.twodimensionalarrays.assignment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintSpiral {
    public static void spiralPrint(int matrix[][]){
        //Your code goes here
        int i, k = 0, l = 0;
        int rowLen = matrix.length;
        if (rowLen > 0) {
            int colLen = matrix[0].length;
            while (k < rowLen && l < colLen) {
                for (i = l; i < colLen; ++i) {
                    System.out.print(matrix[k][i] + " ");
                }
                k++;

                for (i = k; i < rowLen; ++i) {
                    System.out.print(matrix[i][colLen - 1] + " ");
                }
                colLen--;
                if (k < rowLen) {
                    for (i = colLen - 1; i >= l; --i) {
                        System.out.print(matrix[rowLen - 1][i] + " ");
                    }
                    rowLen--;
                }

                if (l < colLen) {
                    for (i = rowLen - 1; i >= k; --i) {
                        System.out.print(matrix[i][l] + " ");
                    }
                    l++;
                }
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

            spiralPrint(mat);
            System.out.println();

            t -= 1;
        }
    }
}
