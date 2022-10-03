package com.rahulnsanand.javadatastructures.test;

import java.util.Scanner;

public class MinimumLengthWord {
    public static String minLengthWord(String input){

        String[] words = input.split(" ");
        String shortestWord = words[0];
        for (int i = 1; i < words.length; i++){
            if(words[i].length()<shortestWord.length()){
                shortestWord = words[i];
            }
        }

        return shortestWord;

    }
    public static void run() {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.println(minLengthWord(str));
    }
}
