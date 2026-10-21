package com.pluralsight;

import java.util.Scanner;

public class MortgageCalculator {

    static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Total Loan Amount: $");
        double principal = myScanner.nextDouble();

        System.out.print("Annual Interest Rate: %");
        double interestRate = myScanner.nextDouble();

        System.out.print("Loan Term in Years: ");
        double years = myScanner.nextDouble();

        double decimalRate = interestRate / 100;
        double months = years * 12;
        double payment = monthlyPayment(principal, decimalRate, months);
        double interest = totalInterest(payment, months, principal);

        System.out.printf("Monthly Payment: $%.2f", payment);
        System.out.printf("\nTotal Interest Rate: $%.2f", interest);

    }

    public static double totalInterest(double payment, double month, double principal) {
        return (payment * month) - principal;
    }

    public static double monthlyPayment(double principal, double decimalRate, double months) {
        double monthlyRate = decimalRate / 12;
        double internal = Math.pow((1 + monthlyRate), months);
        double numerator = principal * (monthlyRate * internal);
        double denominator = internal - 1;

        return numerator / denominator;
    }

}
