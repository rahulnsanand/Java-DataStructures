package com.rahulnsanand.javadatastructures.recursion;
import java.util.Scanner;
public class RemoveDuplicatesRecursively {

    static Scanner s = new Scanner(System.in);

    public static void run() {
        String input = s.next();
        System.out.println(removeConsecutiveDuplicates(input));
    }

    public static String removeConsecutiveDuplicates(String s) {
        // Write your code here
        int currentStringLength = s.length();

        if(currentStringLength==1){
            return s;
        }
        String shorterString = removeConsecutiveDuplicates(s.substring(1));
        if(s.charAt(0)==shorterString.charAt(0)){
            return shorterString;
        } else {
            return s.charAt(0) + shorterString;
        }
    }
}
