package com.rahulnsanand.javadatastructures.strings.assignment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CompressTheString {
    public static String getCompressedString(String str) {
        // Write your code here.
        String stringValue = str.charAt(0) + "";
        int count = 1;

        for(int i=1; i<str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr == prev){
                count++;
            } else {
                if(count>1){
                    stringValue += count;
                    count = 1;
                }
                stringValue += curr;
            }
        }

        if(count > 1){
            stringValue += count;
        }

        return stringValue;
    }

    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

    public static void run() throws NumberFormatException, IOException {
        String str = br.readLine ();
        if (str != null) {
            str = str.trim ();
        } else {
            str = "";
        }

        String ans = getCompressedString(str);
        System.out.println(ans);

    }
}
