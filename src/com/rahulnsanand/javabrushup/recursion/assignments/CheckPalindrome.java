package com.rahulnsanand.javabrushup.recursion.assignments;
import java.util.Scanner;

public class CheckPalindrome {
    public static boolean isStringPalindrome(String input) {
        // Write your code here
        int n = input.length();
        if (n == 0) {
            return true;
        }
        return recursiveFunction(input, 0, n - 1);
    }
    static boolean recursiveFunction(String str, int s, int e) {
        if (s == e) {
            return true;
        }
        if ((str.charAt(s)) != (str.charAt(e))) {
            return false;
        }
        if (s < e + 1) {
            return recursiveFunction(str, s + 1, e - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(isStringPalindrome(input));
    }
}
