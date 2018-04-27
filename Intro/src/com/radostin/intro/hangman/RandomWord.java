package com.radostin.intro.hangman;

import java.util.Random;

/**
 * Class which generates random word for hangman game. It contains array with
 * words.
 * 
 * @author Radostin Ivanov
 *
 */
public class RandomWord {
	private static String[] words = { "eggs", "apple", "banana", "cheese", "meat", "cereals", "noodles", "pie", "salad",
			"sandwich", "sauce" };
	private static final int minLength = 0;
	private static Random rand = new Random();

	/**
	 * Generates random number from 0 to array length-1. Then we use that number as
	 * a random index.
	 * 
	 * @return word from the array with the specific index (random generated).
	 */
	public static String generate() {
		int index = rand.nextInt(((words.length - 1) - minLength) + 1) + minLength;
		return words[index];
	}

}
