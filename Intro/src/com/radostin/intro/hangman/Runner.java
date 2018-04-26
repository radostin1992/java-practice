/**
 * 
 */
package com.radostin.intro.hangman;

/**
 * @author Rado
 *
 */
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String word = RandomWord.generate();
		System.out.println(word);
		Hangman.play(word);
	}

}
