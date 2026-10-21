package com.pluralsight;

import java.util.Scanner;

public class FutureValue {

    static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Initial Deposit: $");
        double principal = myScanner.nextDouble();

        System.out.print("Annual Interest Rate: %");
        double interestPercentage = myScanner.nextDouble();

        System.out.print("Number of Years: ");
        double years = myScanner.nextDouble();

        double interestDecimal = interestPercentage / 100;
        double days = years * 365;

        double futureValue = valueCalculation(principal, interestDecimal, days);
        double interestEarned = interestCalculation(futureValue, principal);

        System.out.printf("CD's Ending Balance: $%.2f", futureValue);
        System.out.printf("\nInterest Earned: $%.2f", interestEarned);
    }

    private static double interestCalculation(double futureValue, double principal) {
        return futureValue - principal;
    }

    private static double valueCalculation(double principal, double interestDecimal, double days) {
        return principal * Math.pow(1 + (interestDecimal / 365), days);
    }

}
