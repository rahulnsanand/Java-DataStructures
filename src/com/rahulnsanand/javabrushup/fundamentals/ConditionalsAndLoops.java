package com.rahulnsanand.javabrushup.fundamentals;

public class ConditionalsAndLoops {

    static int a = 10, b = 10;

    public static void relationalOperators(){
        // < Less Than
        // > Greater Than
        // == Is Equal To
        // != Is Not Equal To

        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);
    }

    public static void logicalOperators(){
        // && AND
        // || OR
        // ! NOT

        System.out.println(a < b && a > b);
        System.out.println(a < b || a > b);
        System.out.println(!(a == b) && a != b);
        System.out.println(a != b || !(a == b));

    }

    public static void conditionalOperators(){
        // if, for, while, switch

        int i = 1;
        while(i<=5){
            System.out.println("Hello ->"+i);
            i++;
        }



    }
}
