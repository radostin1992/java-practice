package com.radostin.intro.hangman;

import java.util.Random;

/**
 * @author Rado
 *
 */
public class RandomWord {
	private static String[] words = { "test", "apple", "banana", "cheese" };
	private static final int minLength = 0;
	private static Random rand = new Random();

	public static String generate() {
		int index = rand.nextInt(((words.length - 1) - minLength) + 1) + minLength;
		return words[index];
	}

}
