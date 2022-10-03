package com.rahulnsanand.javadatastructures.recursion;

import java.util.Scanner;

public class TowerOfHanoiRecursive {

    public static void run() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        towerOfHanoi(n, 'a', 'b', 'c');
    }

    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
        // Write your code here
        if(disks==1) {
            System.out.println(source+" "+destination);
            return;
        } else if(disks==0){
            System.out.println("");
            return;
        }
        towerOfHanoi(disks-1, source, destination, auxiliary);
        System.out.println(source+" "+destination);
        towerOfHanoi(disks-1, auxiliary, source, destination);
    }
}
