package Part1;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the loan amount: ");
		double principal = input.nextDouble();

		System.out.print("Enter the annual interest rate (in percentage): ");
		double annualInterestRate = input.nextDouble() / 100;

		System.out.print("Enter the loan tenure (in years): ");
		int years = input.nextInt();

		double monthlyInterestRate = annualInterestRate / 12;
		int numberOfPayments = years * 12;

		// Calculate the monthly payment (EMI) using the formula
		double emi = principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)
				/ (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

		// Calculate the total interest paid
		double totalInterest = emi * numberOfPayments - principal;

		System.out.println("Monthly EMI: " + emi);
		System.out.println("Total Interest Paid: " + totalInterest);

		input.close();
	}
}
