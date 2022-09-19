package com.rahulnsanand.javadatastructures.strings.assignment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HighestOccuringCharacter {

    public static char highestOccuringChar(String str) {
        //Your code goes here
        int count[] = new int[256];
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;

        int max = -1;
        char result = ' ';

        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }

    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

    public static void main (String [] args) throws NumberFormatException, IOException {
        String str = br.readLine ();
        if (str != null) {
            str = str.trim ();
        } else {
            str = "";
        }

        char ans = highestOccuringChar(str);

        System.out.println(ans);

    }
}
