package com.rahulnsanand.javadatastructures.test;
// 8 Balls total
// Red - 4/8 Probability
// Blue - 2/8 Probability
// Green - 2/8 Probability

// =1 − (8-n)CX/8CX


import java.util.Scanner;

public class Probability {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int nValue = scanner.nextInt();
        int xValue = scanner.nextInt();
        int totalNumberOfRedBalls = 4, totalNumberOfBalls = 8;
        double totalNumberOfBallsFactorial = 1,
                diffTotalBallsN = totalNumberOfBalls - nValue,
                diffTotalBallsNFactorial = 1;
        double totalNumberOfRedBallsFactorial = 1,
                diffRedBallsX = totalNumberOfRedBalls - xValue,
                diffRedBallsXFactorial = 1;
        double totalNonRedBalls = totalNumberOfBalls-totalNumberOfRedBalls;
        double totalNonRedBallsFactorial = 1;
        double nFactorial = 1, xFactorial = 1,
                diffNAndX = nValue - xValue, diffNAndXFactorial = 1,
                diffTotalNonRedBallsNX = totalNonRedBalls - diffNAndX, diffNXNonRedBallFactorial=1;


        //8Cn
        for(int i=1; i<=totalNumberOfBalls; i++){ // 8!
            totalNumberOfBallsFactorial = totalNumberOfBallsFactorial * i;
        }
        for(int i=1; i<=diffTotalBallsN; i++){ // (8-n)!
            diffTotalBallsNFactorial = diffTotalBallsNFactorial * i;
        }
        for(int i=1; i<=nValue; i++){ // n!
            nFactorial = nFactorial * i;
        }
        for(int i=1; i<=xValue; i++){ // x!
            xFactorial = xFactorial * i;
        }

        //4Cx
        for(int i=1; i<=totalNumberOfRedBalls; i++){ // 4! (Red Balls)
            totalNumberOfRedBallsFactorial = totalNumberOfRedBallsFactorial * i;
        }
        for(int i=1; i<=diffRedBallsX; i++){ // 4-x!  (Red Balls)
            diffRedBallsXFactorial = diffRedBallsXFactorial * i;
        }

        //8-4Cn-x
        for(int i=1; i<=totalNonRedBalls; i++){ // 4! (Non Red Balls)
            totalNonRedBallsFactorial = totalNonRedBallsFactorial * i;
        }
        for(int i=1; i<=diffNAndX; i++){ // n-x!
            diffNAndXFactorial = diffNAndXFactorial * i;
        }
        for(int i=1; i<=diffTotalNonRedBallsNX; i++){ // 4 - n-x!
            diffNXNonRedBallFactorial = diffNXNonRedBallFactorial * i;
        }

        double numerator = (totalNumberOfBallsFactorial / (diffTotalBallsNFactorial * nFactorial));

        double leftDenom = totalNumberOfRedBallsFactorial / (diffRedBallsXFactorial * xFactorial);

        double rightDenom = totalNonRedBallsFactorial / (diffNAndXFactorial * diffNXNonRedBallFactorial);

        int finalOutput = (int) (((leftDenom * rightDenom) / numerator) * 100);

        System.out.println(finalOutput);

    }
}
