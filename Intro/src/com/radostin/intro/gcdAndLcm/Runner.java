package com.radostin.intro.gcdAndLcm;
/**
 * Runner class with main method. 
 * @author Radostin Ivanov
 *
 */
public class Runner {

	public static void main(String[] args) {
		int a = -21;
		int b = 6;
		int gcd = GCD.find(a,b);
		LCM.find(a, b, gcd);
		
	}

}
