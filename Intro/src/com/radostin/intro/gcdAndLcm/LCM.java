
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
	 * Method wich finds least common multiple of two integer numbers with help of
	 * the greatest common divisor and prints it in the console.
	 * 
	 * @param num1
	 *            is the first given number.
	 * @param num2
	 *            is the second given number.
	 * @param gcd
	 *            is greatest common divisor of the numbers.
	 */
	public static void find(int num1, int num2, int gcd) {
		if (check(num1, num2)) {
			if (negative) {
				num1 = Math.abs(num1);
				num2 = Math.abs(num2);
			}
			int lcm = (num1 * num2) / gcd;
			System.out.println("LCM: " + lcm);
		}
	}

	/**
	 * Initial check of the numbers.
	 * 
	 * @param num1
	 *            is the first given integer number.
	 * @param num2
	 *            is the second given integer number.
	 * @return true if the two numbers are correct for calculating least common
	 *         multiple.
	 */
	public static boolean check(int num1, int num2) {
		if (num1 == 0 || num2 == 0) {
			System.out.println("We find zero number/numbers, so LCM = 0.");
			return false;
		} else if (num1 < 0 || num2 < 0) {
			System.out.println(
					"We find negative number/numbers, so we will take the absolute value of the number/numbers.");
			negative = true;
		}
		return true;
	}

}
