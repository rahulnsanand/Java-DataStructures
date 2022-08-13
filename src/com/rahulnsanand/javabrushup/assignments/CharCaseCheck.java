package com.rahulnsanand.javabrushup.assignments;

import java.util.Scanner;

public class CharCaseCheck {

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        char inputCharacter = scanner.next().charAt(0);

        if (Character.isLowerCase(inputCharacter)){
            System.out.println("0");
        } else if (Character.isUpperCase(inputCharacter)){
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
    }

}
