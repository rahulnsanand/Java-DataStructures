package com.rahulnsanand.javadatastructures.operatorsandloop;

public class AssignmentOperators {

    public static void run(){
        int a = 10, b = 2;
        // 1010, 0010

        a += 1;
        a *= 1;
        a <<= 1;
        a >>= 1;
        a ^= 1;

        System.out.println(a); // AND Bitwise Operator (1 && 0, 0 && 0, 1 && 1, 0 && 0)
    }

}
