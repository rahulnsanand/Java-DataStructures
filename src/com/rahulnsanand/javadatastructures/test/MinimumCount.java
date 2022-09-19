package com.rahulnsanand.javadatastructures.test;
import java.util.Scanner;


public class MinimumCount {
    public static int minCount(int n){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if (isSquare(n)) {
            return 1;
        }
        for (int i = 1; i <= (int)Math.sqrt(n)+1; i++) {
            if (isSquare(n - (i * i))) {
                return 2;
            }
        }
        while (n % 4 == 0) {
            n >>= 2;
        }
        if (n % 8 == 7) {
            return 4;
        }
        return 3;
    }
    static boolean isSquare(int x) {
        int squareRoot = (int) Math.sqrt(x);
        return (squareRoot * squareRoot == x);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(minCount(num));
    }
}
