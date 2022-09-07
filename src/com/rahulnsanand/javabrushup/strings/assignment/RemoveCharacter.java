package com.rahulnsanand.javabrushup.strings.assignment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RemoveCharacter {

    public static String removeAllOccurrencesOfChar(String str, char ch) {
        return str.replaceAll(String.valueOf(ch), "");
    }


    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

    public static void main (String [] args) throws NumberFormatException, IOException {
        String str = br.readLine();
        if (str != null) {
            str = str.trim ();
        } else {
            str = "";
        }

        char x = br.readLine().charAt(0);

        String ans = removeAllOccurrencesOfChar(str, x);

        System.out.println(ans);

    }
}
