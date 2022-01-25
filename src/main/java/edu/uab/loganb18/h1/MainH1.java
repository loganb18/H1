/*
 * Author: Logan Burkett <Loganb18@uab.edu>
 * Assignment:  H1 - EE333 Spring 2022
 *
 * Credits:  Joel Murach - "murac's Java programming 5TH EDITION" pg.13
 */

package edu.uab.loganb18.h1;

/**
 *
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class MainH1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Future Value Calculator");
        System.out.println();

    Scanner sc = new Scanner(System.in);
    String choice = "y";

while (choice.equalsIgnoreCase("y")) {

    System.out.println("Enter monthly investment: ");
    double monthlyInvestment = sc.nextDouble();
    
    System.out.println("Enter yearly intrest rate: ");
    double interestRate = sc.nextDouble();

    System.out.println("Enter number of years: ");
    int years = sc.nextInt();

    double monthlyInterestRates = interestRate / 12 / 100;
    int months = years *12;

    double futureValue = calculateFutureValue(monthlyInvestment, monthlyInterestRates, months);

    NumberFormat currency = NumberFormat.getCurrencyInstance();
    System.out.println("Future Value: " + currency.format(futureValue) + "\n");

    System.out.println("Continue? (y/n): ");
    choice = sc.next();
    System.out.println();

    } 
}

private static double calculateFutureValue(double monthlyInvestment, double monthlyInterestRate, int months) {

double futureValue = 0;
for (int i = 1; i <= months; i++) {
    futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);

        }
    return futureValue;
    }
    
}
