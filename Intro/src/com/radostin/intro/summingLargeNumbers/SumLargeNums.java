package com.radostin.intro.summingLargeNumbers;

/**
 * Class which sum two numbers with human method. It get numbers as strings so
 * it can calculate very large numbers.
 * 
 * @author Radostin Ivanov
 */

public class SumLargeNums {

	static StringBuilder sb = new StringBuilder();
	static String firstNum;
	static String secondNum;

	/**
	 * Sums the two given large numbers.
	 * 
	 * @param firstNumber
	 *            is the first number;
	 * @param secondNumber
	 *            is the second number;
	 * @return the sum of the numbers
	 */
	public static String calculate(String firstNumber, String secondNumber) {
		firstNum = firstNumber;
		secondNum = secondNumber;

		String sum = "";

		boolean check = check(firstNum, secondNum);

		if (check != false) {
			if (firstNum.length() < secondNum.length() || firstNum.length() > secondNum.length()) {
				fillWithZeros();
			}
			int inMind = 0;
			int lastIndex = 1;

			for (int i = firstNum.length(); i > 0; i--) {
				int fNumLastDigit = Character.getNumericValue(firstNum.charAt(firstNum.length() - lastIndex));
				int sNumLastDigit = Character.getNumericValue(secondNum.charAt(secondNum.length() - lastIndex));
				lastIndex++;

				int tempSum = fNumLastDigit + sNumLastDigit;

				if (inMind == 1) {
					tempSum = tempSum + inMind;
					inMind = inMind - 1;
				}
				if (tempSum > 9) {
					inMind = 1;
					tempSum = tempSum - 10;
				}
				sum = tempSum + sum;
			}

			if (inMind > 0) {
				sum = 1 + sum;
			}
		}

		return sum;
	}

	/**
	 * Method which equalizes the length of the strings. It fills the shorter string
	 * with zeros.
	 */
	private static void fillWithZeros() {
		if (firstNum.length() < secondNum.length()) {
			for (int i = firstNum.length(); i < secondNum.length(); i++) {
				sb.append("0");
			}
			sb.append(firstNum);
			firstNum = sb.toString();

		} else if (secondNum.length() < firstNum.length()) {
			for (int i = secondNum.length(); i < firstNum.length(); i++) {
				sb.append("0");
			}
			sb.append(secondNum);
			secondNum = sb.toString();
		}

	}

	/**
	 * Initial check of the given numbers. Check if numbers are empty or contains
	 * invalid inputs like letters, spaces or symbols.
	 * 
	 * @param firstNum
	 *            is the first given number.
	 * @param secondNum
	 *            is the second given number.
	 * @return true if the two numbers are valid for summing
	 */
	private static boolean check(String firstNum, String secondNum) {
		String regex = "[0-9]+";
		if (firstNum.isEmpty() || secondNum.isEmpty()) {
			System.out.println("Empty string. Fill the two strings with numbers.");
			return false;
		} else if (!firstNum.matches(regex) || !secondNum.matches(regex)) {
			System.out.println(
					"Invalid input - we found letter/s, spaces or symbols in the string/s. Fill the two strings only with numbers.");
			return false;
		}
		return true;
	}

}
