package com.radostin.intro.summingLargeNumbers;

/**
 * Runner class with main method.
 * 
 * @author Radostin Ivanov
 *
 */
public class Runner {

	/**
	 * Main method which starts program for summing large numbers.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// The two large numbers
		String firstNumber = "7777555511111111";
		String secondNumber = "3332222221111";

		// Calculating
		String sum = SumLargeNums.calculate(firstNumber, secondNumber);

		// Prints result
		if (!sum.isEmpty()) {
			System.out.println("Sum is: " + sum);
		}

	}

}
