package com.radostin.intro.hangman;

import java.util.Scanner;

/**
 * Class which implements classic hangman game.
 * 
 * @author Radostin Ivanov
 *
 */
public class Hangman {
	private static final int MAX_ERRORS = 6;
	private static int errors = 0;
	private static String knownLetters = "";
	private static String wrongLetters = "";
	private static boolean finish = false;

	/**
	 * The main method of the program. It gets random word. Then asks player to
	 * enter a letter and checks if entered match to the word. The player play the
	 * game until he guess the word or until he gets "hanged".
	 * 
	 * @param word
	 *            is random word from specially designed RandomWord.class
	 */
	public static void play(String word) {
		Scanner scanner = new Scanner(System.in);
		knownLetters = Character.toString(word.charAt(0));
		knownLetters += Character.toString(word.charAt(word.length() - 1));
		print(word);

		do {
			System.out.println("Enter a letter: ");
			String enteredLetter = scanner.nextLine();
			boolean valid = check(enteredLetter);

			if (valid) {
				enteredLetter = enteredLetter.toLowerCase();
				if (word.contains(enteredLetter) && !knownLetters.contains(enteredLetter)) {
					knownLetters += enteredLetter;
					System.out.println("Good job! You guessed a letter!");
					print(word);
				} else {
					errors++;
					wrongLetters += enteredLetter + " ";

					if (errors != 6) {
						System.out
								.println("The word doesn't contain the entered letter. Your list with wrong letter/s: "
										+ wrongLetters);
						print(word);

					} else {
						System.out.println("The word was: " + word);
					}
					printError(errors);

				}
			}
		} while (MAX_ERRORS != errors && finish != true);
		if (finish == true) {
			System.out.println("Congratulations you guessed the word.");
			printCongrats();
		}
		scanner.close();
	}

	/**
	 * Method which checks entered content by the player.
	 * 
	 * @param enteredLetter
	 *            is the entered content by the player.
	 * @return true if entered is valid - contains only letters (capital or
	 *         lowercase).
	 */
	private static boolean check(String enteredLetter) {
		String regex = "[A-Za-z]";
		if (enteredLetter.length() == 0) {
			System.out.println("Nothing entered. You should enter only one letter.");
			return false;
		} else if (enteredLetter.length() > 1) {
			System.out.println("Only one letter allowed.");
			return false;
		} else if (!enteredLetter.matches(regex)) {
			System.out.println("Only letters allowed.");
			return false;
		} else if (knownLetters.contains(enteredLetter)) {
			System.out.println("You have already guessed that letter. Try another one.");
			return false;
		} else if (wrongLetters.contains(enteredLetter)) {
			System.out.println("You have already tried this letter and it was wrong. Try another one.");
			return false;
		}
		return true;
	}

	/**
	 * Method which prints the word in the console according to hangman game rules -
	 * with dashes on missing letters.
	 * 
	 * @param word
	 *            is the word which player have to guess. With help of the other
	 *            class parameter knownLetters we can print the word with dashes on
	 *            unknown letters or to print the letter on that place.
	 */
	private static void print(String word) {
		String letter;
		int printedLettersCounter = 0;
		for (int i = 0; i < word.length(); i++) {
			letter = Character.toString(word.charAt(i));
			if (knownLetters.contains(letter)) {
				System.out.print(letter + " ");
				printedLettersCounter++;
			} else {
				System.out.print("_ ");
			}
		}
		System.out.print("\n");
		if (printedLettersCounter == word.length()) {
			finish = true;
		}
	}

	/**
	 * Method which prints congratulation message.
	 */
	private static void printCongrats() {
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("+ \\(0 0)/                        +");
		System.out.println("+    |      Yee, you saved me :) +");
		System.out.println("+   / \\                          +");
		System.out.println("++++++++++++++++++++++++++++++++++");

	}

	/**
	 * Method which draws the stickman to the gibbet.
	 * 
	 * @param error
	 *            is the count of the errors which player makes.
	 */
	private static void printError(int error) {
		switch (error) {
		case 1:
			System.out.println("  |---");
			System.out.println("  |  |");
			System.out.println("  | ( )");
			System.out.println("  |    ");
			System.out.println("  |    ");
			System.out.println("__|__");

			break;

		case 2:
			System.out.println("  |---");
			System.out.println("  |  |");
			System.out.println("  | ( )");
			System.out.println("  |  | ");
			System.out.println("  |    ");
			System.out.println("__|__");

			break;

		case 3:
			System.out.println("  |---");
			System.out.println("  |  |");
			System.out.println("  | ( )");
			System.out.println("  | /| ");
			System.out.println("  |    ");
			System.out.println("__|__");

			break;

		case 4:
			System.out.println("  |---");
			System.out.println("  |  |");
			System.out.println("  | ( )");
			System.out.println("  | /|\\");
			System.out.println("  |     ");
			System.out.println("__|__");

			break;

		case 5:
			System.out.println("  |---");
			System.out.println("  |  |");
			System.out.println("  | ( )");
			System.out.println("  | /|\\");
			System.out.println("  | /   ");
			System.out.println("__|__");

			break;

		case 6:
			System.out.println("  |---");
			System.out.println("  |  |");
			System.out.println("  |(x x)");
			System.out.println("  | /|\\");
			System.out.println("  | / \\");
			System.out.println("__|__");
			System.out.println("GAME OVER! YOU DIED!");
			break;
		default:
			break;
		}

	}

}
