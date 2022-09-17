package com.rahulnsanand.javabrushup.test;
import java.util.Collections;
import java.util.Scanner;

public class Print2DArray {
    public static void print2DArray(int input[][]) {
        // Write your code here
        StringBuilder outputString = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            int count = input[i].length-i;
            for (int j = 0; j < input[i].length; j++) {
                outputString.append(input[i][j]).append(" ");
            }
            outputString = new StringBuilder(String.format("%0" + count + "d", 0).replace("0", outputString));
            outputString.append("\n");
        }
        System.out.println(outputString);
    }
    static Scanner s = new Scanner(System.in);

    public static int[][] takeInput(){
        int numRows = s.nextInt();
        int numCols = s.nextInt();
        int[][] input = new int[numRows][numCols];
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < numCols; j++){
                input[i][j] = s.nextInt();
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int[][] input = takeInput();
        print2DArray(input);
    }
}
