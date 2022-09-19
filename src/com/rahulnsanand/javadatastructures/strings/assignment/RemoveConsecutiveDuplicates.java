package com.rahulnsanand.javadatastructures.strings.assignment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveConsecutiveDuplicates {

    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

    public static String removeConsecutiveDuplicates(String str) {
        //Your code goes here
        if (str == null) {
            return null;
        }

        char[] chars = str.toCharArray();
        char prev = 0;
        int k = 0;

        for (char c: chars) {
            if (prev != c) {
                chars[k++] = c;
                prev = c;
            }
        }

        return new String(chars).substring(0, k);
    }

    public static void run() throws NumberFormatException, IOException {
        String str = br.readLine();
        if (str != null) {
            str = str.trim ();
        } else {
            str = "";
        }

        String ans = removeConsecutiveDuplicates(str);

        System.out.println(ans);

    }
}
