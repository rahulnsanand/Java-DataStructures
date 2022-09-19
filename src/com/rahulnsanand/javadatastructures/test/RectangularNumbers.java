package com.rahulnsanand.javadatastructures.test;

import java.util.Scanner;

public class RectangularNumbers {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        print(n);
        s.close();
    }

    public static void print(int n) {
        //Write your code here
        int sizeOfArray = (n*2)-1;
        int[][] outputArray = new int[sizeOfArray][sizeOfArray];
        int leftIndex = 0, rightIndex = sizeOfArray-1;
        while(n>0){
            for(int i=leftIndex; i<=rightIndex; i++){
                for(int j=leftIndex; j<=rightIndex; j++){
                    if(i==leftIndex || i==rightIndex || j==leftIndex || j==rightIndex){
                        outputArray[i][j]=n;

                    }
                }
            }
            leftIndex++;
            rightIndex--;
            n--;
        }

        for(int i=0; i<=sizeOfArray-1; i++){
            for(int j=0; j<=sizeOfArray-1; j++){
                System.out.print(outputArray[i][j]);
            }
            System.out.println();
        }


    }

}
