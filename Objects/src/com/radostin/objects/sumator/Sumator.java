package com.radostin.objects.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Class which sums two objects with same type. We use overloading methods in
 * java.
 * 
 * @author Radostin Ivanov
 *
 */
public class Sumator {
	/**
	 * Method which sums two integer numbers.
	 * 
	 * @param a
	 *            is the first given number.
	 * @param b
	 *            is the second given number.
	 * @return the sum of the two integer numbers.
	 */
	public static int sum(int a, int b) {
		return a + b;
	}

	/**
	 * Method which sums two float numbers.
	 * 
	 * @param a
	 *            is the first given number.
	 * @param b
	 *            is the second given number.
	 * @return the sum of the two float numbers.
	 */
	public static float sum(float a, float b) {
		return a + b;
	}

	/**
	 * Method which sum(concatenate) two strings.
	 * 
	 * @param a
	 *            is the first given string.
	 * @param b
	 *            is the second given string.
	 * @return concatenated strings.
	 */
	public static String sum(String a, String b) {
		return a + b;
	}

	/**
	 * Method which sums two big integer numbers.
	 * 
	 * @param a
	 *            is the first given number.
	 * @param b
	 *            is the second given number.
	 * @return the sum of the two big integer numbers.
	 */
	public static BigInteger sum(BigInteger a, BigInteger b) {
		return a.add(b);
	}

	/**
	 * Method which sums two big decimal numbers.
	 * 
	 * @param a
	 *            is the first given number.
	 * @param b
	 *            is the second given number.
	 * @return the sum of the two big decimal numbers.
	 */
	public static BigDecimal sum(BigDecimal a, BigDecimal b) {
		return a.add(b);
	}

}
