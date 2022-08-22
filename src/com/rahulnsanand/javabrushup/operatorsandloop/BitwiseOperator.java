package com.rahulnsanand.javabrushup.operatorsandloop;

import java.util.Scanner;

public class BitwiseOperator {
    public static void run(){
        int a = 10, b = 2;
        // 1010, 0010

        System.out.println(a & b); // AND Bitwise Operator (1 && 0, 0 && 0, 1 && 1, 0 && 0)
        System.out.println(a | b); // OR Bitwise Operator (1 || 0, 0 || 0, 1 || 1, 0 || 0)
        System.out.println(a ^ b); // XOR Bitwise Operator (~ 1 || 0, ~ 0 || 0, ~ 1 || 1, ~ 0 || 0)
        System.out.println(~a); // NOT Bitwise Operator (~ 1, ~ 0, ~ 1, ~ 0)
        System.out.println(a << 2); // Left Shift All bits, right most vacant bit will always be 0
        System.out.println(a >> 2); // Right Shift All bits, left most vacant bit will hold the sign bit (same sign as before)
    }
}
