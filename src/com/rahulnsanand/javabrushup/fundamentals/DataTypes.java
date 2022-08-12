package com.rahulnsanand.javabrushup.fundamentals;
// Created by Rahul Anand (C) 2022
// Some theory to help understand the memory allocations
// 0|1 (Binary) - 1 Bit
// 4 Bits - 1 Byte
// byte/char - 1 Byte
// short/boolean - 2 Byes
// int/float - 4 Bytes
// long/double - 8 Bytes (double has higher precision)

// String Calculation Below
// header               ->  8-12 bytes (32/64 bit os)   ->  header              ->  8-12 bytes (32/64 bit os)
// hash                 ->  4 bytes                     ->  array length        ->  4 bytes
// char[] (reference)   ->  4 bytes                     ->  500 chars           ->  00  * 2 bytes = 1000 bytes
// String size          ->  16 or 24 bytes              ->  Total Array size    ->  16 (considering gap)+ 1000 bytes = 1016 bytes
// Total size           ->  (16 or 24) + 1016 = 1032 or 1040 bytes (for 32 and 64 bit os)

// () Highest Precedence
// /, %, * Same high precedence (Operated Left To Right)
// +,- Same lower precedence (Operated Left To Right)

public class DataTypes {

    public static void dataTypeCheck(){

        byte byteValue = 11;
        short shortValue = 2;
        int intValue = 1;
        long longValue = 123;
        double doubleValue = 1.24;
        float floatValue = 10.5f;
        char charValue = 'C';
        boolean booleanValue = true;



    }

}
