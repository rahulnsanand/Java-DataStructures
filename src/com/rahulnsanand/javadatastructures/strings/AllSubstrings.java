package com.rahulnsanand.javadatastructures.strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AllSubstrings {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void run() throws NumberFormatException, IOException {
        String str = br.readLine();
        if (str != null) {
            str = str.trim();
        } else {
            str = "";
        }

        printSubstrings(str);

    }
    public static void printSubstrings(String str) {
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            for (int j = i + 1; j <= strLen; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
