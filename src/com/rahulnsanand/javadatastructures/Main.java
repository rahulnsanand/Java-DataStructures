package com.rahulnsanand.javadatastructures;
// Created by Rahul Anand (C) 2022
// This is the main file to run in order to access the whole project

import com.rahulnsanand.javadatastructures.arrays.*;
import com.rahulnsanand.javadatastructures.arrays.assignments.*;
import com.rahulnsanand.javadatastructures.functionsandscope.FahrenheitToCelsius;
import com.rahulnsanand.javadatastructures.functionsandscope.FibonacciNumber;
import com.rahulnsanand.javadatastructures.fundamentals.assignments.*;
import com.rahulnsanand.javadatastructures.debug.DebugClass;
import com.rahulnsanand.javadatastructures.fundamentals.HelloWorld;
import com.rahulnsanand.javadatastructures.fundamentals.SumOfNumbers;
import com.rahulnsanand.javadatastructures.operatorsandloop.AllPrimeNumbers;
import com.rahulnsanand.javadatastructures.operatorsandloop.NthFibonacciNumber;
import com.rahulnsanand.javadatastructures.operatorsandloop.assignment.*;
import com.rahulnsanand.javadatastructures.pattern.*;
import com.rahulnsanand.javadatastructures.pattern.assignments.HalfDiamondPattern;
import com.rahulnsanand.javadatastructures.pattern.assignments.OddSquare;
import com.rahulnsanand.javadatastructures.pattern.assignments.ParallelogramPattern;
import com.rahulnsanand.javadatastructures.pattern.assignments.SumPattern;
import com.rahulnsanand.javadatastructures.test.*;
import com.rahulnsanand.javadatastructures.timecomplexity.ArrayEquilibriumIndex;
import com.rahulnsanand.javadatastructures.timecomplexity.ArrayIntersection;
import com.rahulnsanand.javadatastructures.timecomplexity.assignment.DuplicateInArray;
import com.rahulnsanand.javadatastructures.timecomplexity.assignment.FindUniqueElement;
import com.rahulnsanand.javadatastructures.timecomplexity.assignment.PairSumInArray;
import com.rahulnsanand.javadatastructures.twodimensionalarrays.LargestRowSum;
import com.rahulnsanand.javadatastructures.twodimensionalarrays.RowWiseSum;
import com.rahulnsanand.javadatastructures.twodimensionalarrays.assignment.PrintSpiral;
import com.rahulnsanand.javadatastructures.twodimensionalarrays.assignment.TotalSumOfBoundariesAndDiagonals;

import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        boolean repeatCheck = true;
        Scanner scannerInput = new Scanner(System.in);
        int choice;

        while(repeatCheck){

            System.out.println("0 - Debug Class Run");
            System.out.println("1 - Test ");
            System.out.println("2 - Exit");
            System.out.println("3 - Fundamentals");
            System.out.println("4 - Patterns");
            System.out.println("5 - Operators & For Loop");
            System.out.println("6 - Functions & Scope");
            System.out.println("7 - Arrays");
            System.out.println("8 - 2D Arrays");
            System.out.println("9 - Strings");
            System.out.println("10 - Time Complexity");
            System.out.println("11 - Time Complexity");

            choice = scannerInput.nextInt();
            switch (choice) {
                case 0 -> DebugClass.debugThis();
                case 1 -> showTestCases();
                case 2 -> repeatCheck=false;
                case 3 -> showFundamentals();
                case 4 -> showPatterns();
                case 5 -> showOperatorsForLoop();
                case 6 -> showFunctionsAndScope();
                case 7 -> showArrays();
                case 8 -> showTwoDArrays();
                case 9 -> showStrings();
                case 10 -> showTimeComplexity();

            }
        }

    }

    private static void showTimeComplexity() throws IOException {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("0 - Array Intersection");
        System.out.println("1 - Array Equilibrium Index");
        System.out.println("2 - Find Unique Element");
        System.out.println("3 - Duplicate In Array");
        System.out.println("4 - Pair Sum In Array");
        System.out.println("5 - Triplet Sum");
        System.out.println("6 - Rotate Array");

        int choice = scannerInput.nextInt();
        switch (choice) {
            case 0 -> ArrayIntersection.run();
            case 1 -> ArrayEquilibriumIndex.run();
            case 2 -> FindUniqueElement.run();
            case 3 -> DuplicateInArray.run();
            case 4 -> PairSumInArray.run();
            case 5 -> TripletSum.run();
            case 6 -> RotateArray.run();
        }
    }

    private static void showStrings() throws IOException {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("0 - Row Wise Sum");
        System.out.println("1 - Largest Row Sum");
        System.out.println("2 - Total Sum Of Boundaries And Diagonals");
        System.out.println("3 - Print Spiral");

        int choice = scannerInput.nextInt();
        switch (choice) {
            case 0 -> RowWiseSum.run();
            case 1 -> LargestRowSum.run();
            case 2 -> TotalSumOfBoundariesAndDiagonals.run();
            case 3 -> PrintSpiral.run();
        }
    }

    private static void showTwoDArrays() throws IOException {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("0 - Row Wise Sum");
        System.out.println("1 - Largest Row Sum");
        System.out.println("2 - Total Sum Of Boundaries And Diagonals");
        System.out.println("3 - Print Spiral");

        int choice = scannerInput.nextInt();
        switch (choice) {
            case 0 -> RowWiseSum.run();
            case 1 -> LargestRowSum.run();
            case 2 -> TotalSumOfBoundariesAndDiagonals.run();
            case 3 -> PrintSpiral.run();
        }
    }

    private static void showArrays() throws IOException {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("0 - Return Array Sum");
        System.out.println("1 - Linear Search");
        System.out.println("2 - Arrange Numbers In Array");
        System.out.println("3 - Swap Alternate");
        System.out.println("4 - Find Unique");
        System.out.println("5 - Find Duplicate");
        System.out.println("6 - Intersection Of Two Arrays");
        System.out.println("7 - Pair Sum");
        System.out.println("8 - Triplet Sum");
        System.out.println("9 - Binary Search");
        System.out.println("10 - Selection Sort");
        System.out.println("11 - Bubble Sort");
        System.out.println("12 - Insertion Sort");
        System.out.println("13 - Push Zero To End");
        System.out.println("14 - Sort Zero One Two");
        System.out.println("15 - Sum Of Two Array");
        System.out.println("16 - Rotate Array");
        System.out.println("17 - Second Largest In Array");
        System.out.println("18 - Check Array Rotation");
        System.out.println("19 - Merge Two Sorted Array");

        int choice = scannerInput.nextInt();
        switch (choice) {
            case 0 -> ReturnArraySum.run();
            case 1 -> LinearSearch.run();
            case 2 -> ArrangeNumbersInArray.run();
            case 3 -> SwapAlternate.run();
            case 4 -> FindUnique.run();
            case 5 -> FindDuplicate.run();
            case 6 -> IntersectionOfTwoArrays.run();
            case 7 -> PairSum.run();
            case 8 -> TripletSum.run();
            case 9 -> BinarySearch.run();
            case 10 -> SelectionSort.run();
            case 11 -> BubbleSort.run();
            case 12 -> InsertionSort.run();
            case 13 -> PushZeroToEnd.run();
            case 14 -> SortZeroOneTwo.run();
            case 15 -> SumOfTwoArray.run();
            case 16 -> RotateArray.run();
            case 17 -> SecondLargestInArray.run();
            case 18 -> CheckArrayRotation.run();
            case 19 -> MergeTwoSortedArray.run();
        }
    }

    private static void showFunctionsAndScope() {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("0 - Fahrenheit To Celsius Table");
        System.out.println("1 - Fibonacci Number");

        int choice = scannerInput.nextInt();
        switch (choice) {
            case 0 -> FahrenheitToCelsius.run();
            case 1 -> FibonacciNumber.run();
        }
    }

    private static void showTestCases() {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("0 - Palindrome Number Check");
        System.out.println("1 - Check AP");
        System.out.println("2 - Number Star Pattern 1");
        System.out.println("3 - Number Star Pattern");
        System.out.println("4 - Probability");
        System.out.println("5 - Maximum Number");
        System.out.println("6 - ");
        System.out.println("7 - ");
        System.out.println("8 - ");
        System.out.println("9 - ");
        System.out.println("10 - ");
        System.out.println("11 - ");
        System.out.println("12 - ");
        System.out.println("13 - ");
        System.out.println("14 - ");
        System.out.println("15 - ");
        System.out.println("16 - ");
        System.out.println("17 - ");
        System.out.println("18 - ");

        int choice = scannerInput.nextInt();
        switch (choice) {
            case 0 -> PalindromeNumber.run();
            case 1 -> CheckAP.run();
            case 2 -> NumberStarPattern1.run();
            case 3 -> NumberStarPattern.run();
            case 4 -> Probability.run();
            case 5 -> MaximumNumber.run(1111);
            case 6 -> AlphaPattern.run();
            case 7 -> CharacterPattern.run();
            case 8 -> TriangleCharacterPattern.run();
            case 9 -> InterestingAlphabets.run();
            case 10 -> MirrorImageNumberPattern.run();
            case 11 -> InvertedNumberPattern.run();
            case 12 -> StarPattern.run();
            case 13 -> TriangleOfNumbers.run();
            case 14 -> DiamondOfStars.run();
            case 15 -> HalfDiamondPattern.run();
            case 16 -> ParallelogramPattern.run();
            case 17 -> SumPattern.run();
            case 18 -> OddSquare.run();
        }
    }

    private static void showOperatorsForLoop() {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("0 - Nth Fibonacci Number");
        System.out.println("1 - All Prime Numbers");
        System.out.println("2 - Sum Or Product");
        System.out.println("3 - Terms of AP");
        System.out.println("4 - Reverse Of A Number");
        System.out.println("5 - Binary To Decimal");
        System.out.println("6 - Decimal To Binary");
        System.out.println("7 - Square Root");
        System.out.println("8 - Check Number Sequence");

        int choice = scannerInput.nextInt();
        switch (choice) {
            case 0 -> NthFibonacciNumber.run();
            case 1 -> AllPrimeNumbers.run();
            case 2 -> SumOrProduct.run();
            case 3 -> TermsOfAP.run();
            case 4 -> ReverseOfANumber.run();
            case 5 -> BinaryToDecimal.run();
            case 6 -> DecimalToBinary.run();
            case 7 -> SquareRoot.run();
            case 8 -> CheckNumberSequence.run();        }
    }

    public static void showPatterns(){
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("0 - Simple Pattern");
        System.out.println("1 - Square Pattern");
        System.out.println("2 - Triangle Pattern");
        System.out.println("3 - Triangle Star Pattern");
        System.out.println("4 - Triangle Number Pattern");
        System.out.println("5 - Reverse Number Pattern");
        System.out.println("6 - Alpha Pattern");
        System.out.println("7 - Character Pattern");
        System.out.println("8 - Triangle Character Pattern");
        System.out.println("9 - Interesting Character Pattern");
        System.out.println("10 - Mirror Image Number Pattern");
        System.out.println("11 - Inverted Number Pattern");
        System.out.println("12 - Star Pattern");
        System.out.println("13 - Triangle Of Numbers");
        System.out.println("14 - Diamond Of Stars");
        System.out.println("15 - Half Diamond Pattern");
        System.out.println("16 - Parallelogram Pattern");
        System.out.println("17 - Sum Pattern");
        System.out.println("18 - Odd quare");

        int choice = scannerInput.nextInt();
        switch (choice) {
            case 0 -> SimplePattern.run();
            case 1 -> SquarePattern.run();
            case 2 -> TrianglePattern.run();
            case 3 -> TriangularStarPattern.run();
            case 4 -> TriangleNumberPattern.run();
            case 5 -> ReverseNumberPattern.run();
            case 6 -> AlphaPattern.run();
            case 7 -> CharacterPattern.run();
            case 8 -> TriangleCharacterPattern.run();
            case 9 -> InterestingAlphabets.run();
            case 10 -> MirrorImageNumberPattern.run();
            case 11 -> InvertedNumberPattern.run();
            case 12 -> StarPattern.run();
            case 13 -> TriangleOfNumbers.run();
            case 14 -> DiamondOfStars.run();
            case 15 -> HalfDiamondPattern.run();
            case 16 -> ParallelogramPattern.run();
            case 17 -> SumPattern.run();
            case 18 -> OddSquare.run();
        }
    }

    public static void showFundamentals(){
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("0 - Hello World");
        System.out.println("1 - Sum of two Numbers");
        System.out.println("2 - Character Case Check");
        System.out.println("3 - Fahrenheit To Celcius");
        System.out.println("4 - Salary Calculator");
        System.out.println("5 - Multiplication Table");
        System.out.println("6 - Sum of Even & Odd");
        System.out.println("7 - Find Factors");
        System.out.println("8 - Find Power Of Number");
        int choice = scannerInput.nextInt();
        switch (choice) {
            case 0 -> HelloWorld.print();
            case 1 -> {
                System.out.println("Enter Number 1: ");
                int a = scannerInput.nextInt();
                System.out.println("Enter Number 2: ");
                int b = scannerInput.nextInt();
                SumOfNumbers.sum(a, b);
            }
            case 2 -> CharCaseCheck.run();
            case 3 -> FahrenheitToCelcius.run();
            case 4 -> SalaryCalculator.run();
            case 5 -> MultiplicationTable.run();
            case 6 -> SumOfEvenOdd.run();
            case 7 -> FindFactors.run();
            case 8 -> FindPowerOfNum.run();
        }
    }

}
