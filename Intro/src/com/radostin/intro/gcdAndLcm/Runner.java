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
		int num1 = 24;
		int num2 = 54;

		// Calculating
		int gcd = GCD.find(num1, num2);
		LCM.find(num1, num2, gcd);

	}

}
