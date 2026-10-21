package com.pluralsight;

import java.util.Scanner;

public class PresentValue {

    static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Monthly Payout: $");
        double payout = myScanner.nextDouble();

        System.out.print("Annual Interest Rate: %");
        double interestRate = myScanner.nextDouble();

        System.out.print("Years: ");
        double years = myScanner.nextDouble();

        double interestDecimal = interestRate / 100;
        double monthlyInterest = interestDecimal / 12;
        double months = years * 12;

        double invest = investCalculation(payout, monthlyInterest, months);

        System.out.printf("value of annuity: $%.2f", invest);
    }

    private static double investCalculation(double payout, double monthlyInterest, double months) {
        return (payout * (1 - Math.pow((1.0 + monthlyInterest), (months * -1)))) / monthlyInterest;
    }

}
