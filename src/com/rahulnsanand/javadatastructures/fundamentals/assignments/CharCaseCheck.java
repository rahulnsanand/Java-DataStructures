package com.rahulnsanand.javadatastructures.fundamentals.assignments;

import java.util.Scanner;

public class CharCaseCheck {

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        char inputCharacter = scanner.next().charAt(0);

        if (Character.isLowerCase(inputCharacter)){
            System.out.println("It's Lowercase");
        } else if (Character.isUpperCase(inputCharacter)){
            System.out.println("It's Uppercase");
        } else {
            System.out.println("Dunno what that was");
        }
    }

}
