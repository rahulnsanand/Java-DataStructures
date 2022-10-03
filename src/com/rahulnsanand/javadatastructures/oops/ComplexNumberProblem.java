package com.rahulnsanand.javadatastructures.oops;

import java.util.Scanner;

public class ComplexNumberProblem {
    public static void run() {
        Scanner s = new Scanner(System.in);

        int real1 = s.nextInt();
        int imaginary1 = s.nextInt();

        int real2 = s.nextInt();
        int imaginary2 = s.nextInt();

        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

        int choice = s.nextInt();


        if(choice == 1) {
            // Add
            c1.plus(c2);
            c1.print();
        }
        else if(choice == 2) {
            // Multiply
            c1.multiply(c2);
            c1.print();
        }
        else {
            return;
        }
    }
}

class ComplexNumbers {
    // Complete this class

    private int realNumber, imaginaryNumber;

    public ComplexNumbers(int realNumber, int imaginaryNumber){
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public void plus(ComplexNumbers complexNumbers){
        this.realNumber = this.realNumber + complexNumbers.realNumber;
        this.imaginaryNumber = this.imaginaryNumber + complexNumbers.imaginaryNumber;
    }

    public void multiply(ComplexNumbers complexNumbers){
        int realProduct = (this.realNumber * complexNumbers.realNumber)
                - (this.imaginaryNumber * complexNumbers.imaginaryNumber);
        int imaginaryProduct = (this.realNumber * complexNumbers.imaginaryNumber)
                + (this.imaginaryNumber * complexNumbers.realNumber);
        this.realNumber = realProduct;
        this.imaginaryNumber = imaginaryProduct;
    }

    public void print(){
        System.out.println(this.realNumber+" + i"+this.imaginaryNumber);
    }


}
