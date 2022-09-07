package com.rahulnsanand.javabrushup.strings.assignment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReverseEachWord {
    public static String reverseEachWord(String str) {
        //Your code goes here
        StringBuffer s = new StringBuffer(str);
        str = s.reverse().toString();
        String [] rev = str.split(" ");
        StringBuffer reverse = new StringBuffer();
        for(int i = rev.length - 1; i >= 0; i--) {
            reverse.append(rev[i]).append(" ");
        }
        return reverse.toString();
    }

    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

    public static void run() throws NumberFormatException, IOException {
        String str = br.readLine();
        if (str != null) {
            str = str.trim ();
        } else {
            str = "";
        }

        String ans = reverseEachWord(str);

        System.out.println(ans);

    }
}
