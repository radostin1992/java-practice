/**
 * 
 */
package com.radostin.intro.arrayProcessing;

import java.util.Arrays;

/**
 * @author Rado
 *
 */
public class ArraysProcessing {

	public static int getMinElementIndex(int[] array) {
		int min = array[0];
		int index = 0;
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
				index = i;
			}
		}
		return index;
	}

	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public static void print(int[] array) {
		System.out.print("The elements of the array are: ");
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + ", ");
			} else
				System.out.print(array[i] + ";\n");
		}
	}

	public static int largestSumOfContiguousSubarray(int[] array) {
		int maxSoFar = 0;
		int maxEndingHere = 0;

		for (int i = 0; i < array.length; i++) {
			maxEndingHere += array[i];
			if (maxEndingHere < 0) {
				maxEndingHere = 0;
			}
			if (maxEndingHere > 0) {
				if (maxSoFar < maxEndingHere) {
					maxSoFar = maxEndingHere;
				}
			}

		}
		return maxSoFar;
	}

	public static int findMedian(int[] array) {
		int L = 0;
		int R = array.length - 1;
		int median =0;

		int sumL = array[0];
		int sumR = array[array.length -1];

		for (int i = 1; i < array.length; i++) {
			if (L != R - 1) {
				if (sumL > sumR) {
					R--;
					sumR = sumR + array[R];
				} else {
					L++;
					sumL = sumL + array[L];
				}
			} else {
				if (sumL < sumR) {
					median = R + 1;
				} else
					median = L + 1;
				return median;
			}
		}
		return median;
	}
	
	public static int[] reverse(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length / 2; i++) {
			temp = array[i];
			array[i] = array[array.length - (i + 1)];
			array[array.length - (i + 1)] = temp;
		}
		return array;
	}

}
