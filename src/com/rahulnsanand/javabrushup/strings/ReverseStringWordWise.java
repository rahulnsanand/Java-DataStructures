package com.rahulnsanand.javabrushup.strings;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ReverseStringWordWise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(reverseWordWise(input));
    }
    public static String reverseWordWise(String input) {
        Pattern pattern = Pattern.compile("\\s");
        String[] temp = pattern.split(input);
        String result = "";

        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }
}
