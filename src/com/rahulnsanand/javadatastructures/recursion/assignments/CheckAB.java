package com.rahulnsanand.javadatastructures.recursion.assignments;
import java.util.Scanner;

public class CheckAB {
    public static boolean checkAB(String input) {
        // Write your code here
        if(input.length() == 0){
            return true;
        }

        if(input.charAt(0) == 'a'){
            if(input.substring(1).length() > 1 && input.startsWith("bb", 1)){
                return checkAB(input.substring(3));
            }else{
                return checkAB(input.substring(1));
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        System.out.println(checkAB(input));
    }
}
