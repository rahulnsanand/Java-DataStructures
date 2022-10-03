package com.rahulnsanand.javadatastructures.recursion;

public class NumberOfDigits {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(count(n));
    }
    public static int count(int n){
        //Write your code here
        if(n==0){
            return 0;
        }
        int prevCount = count(n/10);

        return prevCount+1;
    }
}
