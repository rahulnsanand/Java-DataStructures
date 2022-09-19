package com.rahulnsanand.javadatastructures.recursion.assignments;
import java.util.Scanner;

public class PairStar {
    static int lenValue = 0;
    public static String addStars(String s) {
        // Write your code here

        pairStar(s,0);

        return output;

    }

    static String output="";
    static void pairStar(String input, int i){
        output = output + input.charAt(i);

        if (i == input.length() - 1) {
            return;
        }
        if (input.charAt(i) == input.charAt(i+1)) {
            output = output + '*';
        }
        pairStar(input, i+1);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(addStars(input));
    }
}
