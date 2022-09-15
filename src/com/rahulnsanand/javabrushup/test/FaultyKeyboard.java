package com.rahulnsanand.javabrushup.test;

public class FaultyKeyboard {

    public static boolean faultyKeyboard(String expectedWord, String keyboardUnderstoodWord) {
        int n = expectedWord.length();
        int m = keyboardUnderstoodWord.length();

        int startIndex = 0, endIndex = 0;

        while(true){
            if(startIndex == n && endIndex == m) {
                return true;
            } else if (startIndex == n || endIndex == m) {
                return false;
            }
            if(expectedWord.charAt(startIndex) != keyboardUnderstoodWord.charAt(endIndex)) {
                return false;
            }

            startIndex++;
            endIndex++;

            if(startIndex != n) {
                if (endIndex != m && expectedWord.charAt(startIndex) != keyboardUnderstoodWord.charAt(endIndex)) {
                    while (endIndex != m && keyboardUnderstoodWord.charAt(endIndex) == keyboardUnderstoodWord.charAt(endIndex - 1)) {
                        endIndex++;
                    }
                }
            }
            else {
                while (endIndex != m && keyboardUnderstoodWord.charAt(endIndex) == keyboardUnderstoodWord.charAt(endIndex - 1)) {
                    endIndex++;
                }
            }
        }
    }
}
