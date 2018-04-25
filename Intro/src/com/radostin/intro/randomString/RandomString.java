package com.radostin.intro.randomString;

import java.util.Random;

/**
 * Class which generates random string with given length[0-100 000].
 * 
 * @author Radostin Ivanov
 */
public class RandomString {
	private static int randomNumber;

	private static int randomRange;
	private static final int CAPITAL_LETTERS = 1;
	private static final int LOWERCASE_LETTERS = 2;
	private static final int NUMBERS = 3;

	private static final int CAPITAL_LETTERS_MIN_ASCII_CHARACTER = 65;
	private static final int CAPITAL_LETTERS_MAX_ASCII_CHARACTER = 90;

	private static final int LOWERCASE_LETTERS_MIN_ASCII_CHARACTER = 97;
	private static final int LOWERCASE_LETTERS_MAX_ASCII_CHARACTER = 122;

	private static final int NUMBERS_MIN_ASCII_CHARACTER = 48;
	private static final int NUMBERS_MAX_ASCII_CHARACTER = 57;

	private static Random rand = new Random();
	private static String randomString = "";

	/**
	 * Method which generate random string with given length. We use ASCII table to
	 * define our alphabet.
	 * 
	 * @param length
	 *            is the desired length for the generated string.
	 * @return generated string.
	 */
	public static final String generate(int length) {
		if (length <= 0 || length > 100000) {
			System.out.println("Invalid length! We accept [0-100 000]!");
			return randomString;
		} else {
			for (int i = 0; i < length; i++) {
				randomRange = rand.nextInt((NUMBERS - CAPITAL_LETTERS) + 1) + CAPITAL_LETTERS;

				if (randomRange == CAPITAL_LETTERS) {
					randomNumber = rand
							.nextInt((CAPITAL_LETTERS_MAX_ASCII_CHARACTER - CAPITAL_LETTERS_MIN_ASCII_CHARACTER) + 1)
							+ CAPITAL_LETTERS_MIN_ASCII_CHARACTER;
				} else if (randomRange == LOWERCASE_LETTERS) {
					randomNumber = rand.nextInt(
							(LOWERCASE_LETTERS_MAX_ASCII_CHARACTER - LOWERCASE_LETTERS_MIN_ASCII_CHARACTER) + 1)
							+ LOWERCASE_LETTERS_MIN_ASCII_CHARACTER;
				} else if (randomRange == NUMBERS) {
					randomNumber = rand.nextInt((NUMBERS_MAX_ASCII_CHARACTER - NUMBERS_MIN_ASCII_CHARACTER) + 1)
							+ NUMBERS_MIN_ASCII_CHARACTER;
				}
				randomString += (char) randomNumber;
			}
			return randomString;
		}

	}
}
