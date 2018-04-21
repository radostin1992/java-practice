
package com.radostin.intro.gcdAndLcm;

/**
 * Class which finds Greatest common divisor of two integer numbers.
 * 
 * @author Radostin Ivanov
 *
 */
public class GCD {

	static boolean negative = false;

	public static int find(int a, int b) {
		if (check(a, b)) {
			if (negative) {
				a = Math.abs(a);
				b = Math.abs(b);
			}
			while (a != b) {
				if (a > b) {
					a = a - b;
				} else {
					b = b - a;
				}
			}
			System.out.println("GCD: " + a);
		}
		return a;
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
		if (a == 0 && b == 0) {
			System.out.println("The two numbers are zeros, so GCD = 0.");
			return false;
		} else if (a > 0 && b == 0) {
			System.out.println("Number b is zero, so GCD is a = " + a);
			return false;
		} else if (a == 0 && b > 0) {
			System.out.println("Number a is zero so GCD is b = " + b);
			return false;
		} else if (a < 0 || b < 0) {
			System.out.println(
					"We find negative number/numbers, so we will take the absolute value of the number/numbers.");
			negative = true;
		}
		return true;
	}

}
