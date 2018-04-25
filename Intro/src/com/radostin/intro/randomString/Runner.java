package com.radostin.intro.randomString;

/**
 * Runner class with main method.
 * 
 * @author Radostin Ivanov
 *
 */
public class Runner {

	/**
	 * Main method which starts programs for generating random string.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Given length
		int length = 30;

		// Generating string
		String randomString = RandomString.generate(length);

		// Print string to console
		if (!randomString.isEmpty()) {
			System.out.println("The random string is: " + randomString);
		}

	}

}
