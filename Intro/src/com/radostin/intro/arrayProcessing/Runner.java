/**
 * 
 */
package com.radostin.intro.arrayProcessing;

/**
 * @author Rado
 *
 */
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 0, 5 };

		int index = ArraysProcessing.getMinElementIndex(array);
		System.out.println("The min element is at index: " + index);

		int arraySum = ArraysProcessing.sum(array);
		System.out.println("Array sum is: " + arraySum);

		ArraysProcessing.print(array);

		System.out.println("====================================");

		int[] array2 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.print("New array >>> ");
		ArraysProcessing.print(array2);

		int largestSumOfContiguousSubarray = ArraysProcessing.largestSumOfContiguousSubarray(array2);
		System.out.println("The largest sum of contiguous subarray is: " + largestSumOfContiguousSubarray);

		System.out.println("====================================");
		int[] medianTestArr = {4,5,99,-1,5,6};
		System.out.print("New array >>> ");
		ArraysProcessing.print(medianTestArr);
		int median = ArraysProcessing.findMedian(medianTestArr);
		System.out.println("The median of the array is at index: " + median + " (index starts from 1)");

	}

}
