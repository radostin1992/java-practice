package com.radostin.intro.gcdAndLcm;

/**
 * Runner class with main method.
 * 
 * @author Radostin Ivanov
 *
 */
public class Runner {
	/**
	 * Main method which starts programs for finding gcd and lcm.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// The two given numbers
		int firstNumber = 24;
		int secondNumber = 54;

		// Calculating
		int gcd = GCD.find(firstNumber, secondNumber);
		LCM.find(firstNumber, secondNumber, gcd);

	}

}
