package com.radostin.intro.gcdAndLcm;

/**
 * Class which finds least common multiple of two integer numbers with help of
 * the greatest common divisor.
 * 
 * @author Radostin Ivanov
 *
 */
public class LCM {

	static boolean negative = false;

	/**
	 * Method which finds least common multiple of two integer numbers with help of
	 * the greatest common divisor and prints it in the console.
	 * 
	 * @param firstNumber
	 *            is the first given number.
	 * @param secondNumber
	 *            is the second given number.
	 * @param gcd
	 *            is greatest common divisor of the numbers.
	 */
	public static void find(int firstNumber, int secondNumber, int gcd) {
		if (check(firstNumber, secondNumber)) {
			if (negative) {
				firstNumber = Math.abs(firstNumber);
				secondNumber = Math.abs(secondNumber);
			}
			int lcm = (firstNumber * secondNumber) / gcd;
			System.out.println("LCM: " + lcm);
		}
	}

	/**
	 * Initial check of the numbers.
	 * 
	 * @param firstNumber
	 *            is the first given integer number.
	 * @param secondNumber
	 *            is the second given integer number.
	 * @return true if the two numbers are correct for calculating least common
	 *         multiple.
	 */
	public static boolean check(int firstNumber, int secondNumber) {
		if (firstNumber == 0 || secondNumber == 0) {
			System.out.println("We find zero number/numbers, so LCM = 0.");
			return false;
		} else if (firstNumber < 0 || secondNumber < 0) {
			System.out.println(
					"We find negative number/numbers, so we will take the absolute value of the number/numbers.");
			negative = true;
		}
		return true;
	}

}
