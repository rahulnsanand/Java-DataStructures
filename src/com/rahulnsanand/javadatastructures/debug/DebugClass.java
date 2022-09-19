package com.rahulnsanand.javadatastructures.debug;

public class DebugClass {

    public static void debugThis(){

        System.out.println();
    }


    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
        // Write your code here
        if (disks == 1) {
            return;
        }
        towerOfHanoi(disks-1, source, auxiliary, destination);
        towerOfHanoi(disks-1, auxiliary, destination, source);
    }
}
