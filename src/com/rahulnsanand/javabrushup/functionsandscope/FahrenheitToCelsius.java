package com.rahulnsanand.javabrushup.functionsandscope;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int E = scanner.nextInt();
        int W= scanner.nextInt();
        int currentCelsiusValue;
        // [(°F-32)×5]/9
       while(S<=E){
           currentCelsiusValue = ((S - 32) * 5)/9;
           System.out.println(S+" "+currentCelsiusValue);
           S += W;
       }

    }
}
