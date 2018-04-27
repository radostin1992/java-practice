package com.radostin.intro.hangman;

/**
 * Runner class with main method.
 * 
 * @author Radostin Ivanov
 *
 */
class Runner {

	/**
	 * Main method which starts the game.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Generating random word for the game
		String word = RandomWord.generate();

		// Actual starting of the game
		Hangman.play(word);
	}

}
