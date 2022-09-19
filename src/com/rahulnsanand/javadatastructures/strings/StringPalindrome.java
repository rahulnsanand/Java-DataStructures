package com.rahulnsanand.javadatastructures.strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StringPalindrome {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void run() throws NumberFormatException, IOException {
        String str = br.readLine();
        if (str != null) {
            str = str.trim();
        } else {
            str = "";
        }

        boolean ans = isPalindrome(str);
        System.out.println(ans);
    }

    public static boolean isPalindrome(String str) {
        int i = 0, stringLength = str.length() - 1;
        while (i < stringLength) {
            if (str.charAt(i) != str.charAt(stringLength)) {
                return false;
            }
            i++;
            stringLength--;
        }
        return true;
    }
}
