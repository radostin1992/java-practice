package com.radostin.intro.gcdAndLcm;

/**
 * Class which finds Greatest common divisor of two integer numbers.
 * 
 * @author Radostin Ivanov
 *
 */
public class GCD {

	static boolean negative = false;

	/**
	 * Method which finds Greatest common divisor of two integer numbers.
	 * 
	 * @param firstNumber
	 *            is the first given number.
	 * @param secondNumber
	 *            is the second given number.
	 * @return greatest common divisor of the two given numbers.
	 */
	public static int find(int firstNumber, int secondNumber) {
		if (check(firstNumber, secondNumber)) {
			if (negative) {
				firstNumber = Math.abs(firstNumber);
				secondNumber = Math.abs(secondNumber);
			}
			while (firstNumber != secondNumber) {
				if (firstNumber > secondNumber) {
					firstNumber = firstNumber - secondNumber;
				} else {
					secondNumber = secondNumber - firstNumber;
				}
			}
			System.out.println("GCD: " + firstNumber);
		}
		return firstNumber;
	}

	/**
	 * Initial check of the numbers.
	 * 
	 * @param firstNumber
	 *            is the first given integer number.
	 * @param secondNumber
	 *            is the second given integer number.
	 * @return true if the two numbers are correct for calculating greatest common
	 *         divisor.
	 */
	public static boolean check(int firstNumber, int secondNumber) {
		if (firstNumber == 0 && secondNumber == 0) {
			System.out.println("The two numbers are zeros, so GCD = 0.");
			return false;
		} else if (firstNumber > 0 && secondNumber == 0) {
			System.out.println("Second number is zero, so GCD is firstNumber = " + firstNumber);
			return false;
		} else if (firstNumber == 0 && secondNumber > 0) {
			System.out.println("First number is zero so GCD is secondNumber = " + secondNumber);
			return false;
		} else if (firstNumber < 0 || secondNumber < 0) {
			System.out.println(
					"We find negative number/numbers, so we will take the absolute value of the number/numbers.");
			negative = true;
		}
		return true;
	}

}
