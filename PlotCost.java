package Part1;

import java.util.Scanner;

public class PlotCost {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size of the plot (in square units, e.g., square meters): ");
		double plotSize = input.nextDouble();

		System.out.print("Enter the cost per square unit (e.g., cost per square meter): ");
		double costPerSquareUnit = input.nextDouble();

		// Calculate the total cost of the plot
		double totalCost = plotSize * costPerSquareUnit;

		System.out.println("Total Cost of the Plot: " + totalCost);

		input.close();
	}
}
