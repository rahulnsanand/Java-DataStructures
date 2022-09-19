package com.rahulnsanand.javadatastructures.strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CountWords {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void run() throws NumberFormatException, IOException {
        String str = br.readLine();
        if (str != null) {
            str = str.trim();
        } else {
            str = "";
        }

        int count = countWords(str);
        System.out.println(count);
    }

    public static int countWords(String str) {
        //Your code goes here
        if (str == null || str.isEmpty())
            return 0;
        String[] wordsValue = str.split("\\s+");
        return wordsValue.length;
    }

}
