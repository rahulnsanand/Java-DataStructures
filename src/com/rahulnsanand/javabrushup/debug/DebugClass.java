package com.rahulnsanand.javabrushup.debug;

import java.util.Scanner;

public class DebugClass {

    public static void debugThis(){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int a = s.nextInt();
        System.out.print(str + " " + a);
    }

}
