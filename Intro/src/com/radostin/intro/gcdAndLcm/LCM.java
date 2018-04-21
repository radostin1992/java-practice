
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

	public static void find(int a, int b, int gcd) {
		if (check(a, b)) {
			if (negative) {
				a = Math.abs(a);
				b = Math.abs(b);
			}
			int lcm = (a * b) / gcd;
			System.out.println("LCM: " + lcm);
		}
	}

	/**
	 * Initial check of the numbers.
	 * 
	 * @param a
	 *            is the first given integer number.
	 * @param b
	 *            is the second given integer number.
	 * @return
	 */
	public static boolean check(int a, int b) {
		if (a == 0 || b == 0) {
			System.out.println("We find zero number/numbers, so LCM = 0.");
			return false;
		} else if (a < 0 || b < 0) {
			System.out.println(
					"We find negative number/numbers, so we will take the absolute value of the number/numbers.");
			negative = true;
		}
		return true;
	}

}
