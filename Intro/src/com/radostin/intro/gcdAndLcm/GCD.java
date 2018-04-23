
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
	 * @param num1
	 *            is the first given number.
	 * @param num2
	 *            is the second given number.
	 * @return greatest common divisor of the two given numbers.
	 */
	public static int find(int num1, int num2) {
		if (check(num1, num2)) {
			if (negative) {
				num1 = Math.abs(num1);
				num2 = Math.abs(num2);
			}
			while (num1 != num2) {
				if (num1 > num2) {
					num1 = num1 - num2;
				} else {
					num2 = num2 - num1;
				}
			}
			System.out.println("GCD: " + num1);
		}
		return num1;
	}

	/**
	 * Initial check of the numbers.
	 * 
	 * @param num1
	 *            is the first given integer number.
	 * @param num2
	 *            is the second given integer number.
	 * @return true if the two numbers are correct for calculating greatest common
	 *         divisor.
	 */
	public static boolean check(int num1, int num2) {
		if (num1 == 0 && num2 == 0) {
			System.out.println("The two numbers are zeros, so GCD = 0.");
			return false;
		} else if (num1 > 0 && num2 == 0) {
			System.out.println("Number b is zero, so GCD is num1 = " + num1);
			return false;
		} else if (num1 == 0 && num2 > 0) {
			System.out.println("Number a is zero so GCD is num2 = " + num2);
			return false;
		} else if (num1 < 0 || num2 < 0) {
			System.out.println(
					"We find negative number/numbers, so we will take the absolute value of the number/numbers.");
			negative = true;
		}
		return true;
	}

}
