/**
 * 
 */
package com.radostin.objects.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Runner class with main method.
 * 
 * @author Radostin Ivanov
 *
 */
public class Runner {

	/**
	 * Main method which starts sumator program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Testing int sumator
		int intA = 5;
		int intB = 105;
		int intResult = Sumator.sum(intA, intB);
		System.out.println(intA + " + " + intB + " = " + intResult);

		// Testing float sumator
		float floatA = 2.3f;
		float floatB = 3.3f;
		float floatResult = Sumator.sum(floatA, floatB);
		System.out.println(floatA + " + " + floatB + " = " + floatResult);

		// Testing string sumator
		String stringA = "soul";
		String stringB = "mate";
		String stringResult = Sumator.sum(stringA, stringB);
		System.out.println(stringA + " + " + stringB + " = " + stringResult);

		// Testing big integer sumator
		BigInteger bigIntA = new BigInteger("12345");
		BigInteger bigIntB = new BigInteger("67890");
		BigInteger bigIntResult = Sumator.sum(bigIntA, bigIntB);
		System.out.println(bigIntA + " + " + bigIntB + " = " + bigIntResult);

		// Testing big decimal sumator
		BigDecimal bigDecA = new BigDecimal("12345.6789");
		BigDecimal bigDecB = new BigDecimal("67890.12345");
		BigDecimal bigDecResult = Sumator.sum(bigDecA, bigDecB);
		System.out.println(bigDecA + " + " + bigDecB + " = " + bigDecResult);
	}

}
