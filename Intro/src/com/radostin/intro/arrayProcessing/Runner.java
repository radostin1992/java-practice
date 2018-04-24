package com.radostin.intro.arrayProcessing;

/**
 * Runner class with main method.
 * 
 * @author Radostin Ivanov
 *
 */
public class Runner {

	/**
	 * Main method which starts programs that work with arrays.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("================= Starting programs for array processing ==================");
		System.out.println("");
		System.out.println("===========================================================================");

		System.out.println("=== Second task ===========================================================");
		System.out.println("= 1. Testing method which returns index of the element with minimum value =");

		int[] array = { 0, 1, 2, 3, -4, 5 };
		System.out.print("Test array -> ");
		ArraysProcessing.print(array);

		int index = ArraysProcessing.getMinElementIndex(array);
		System.out.println("The min element is at index: " + index);

		System.out.println("==========================================================================");
		System.out.println("= 2. Testing method which sums array elements ============================");

		System.out.println("We will use the same array.");
		int arraySum = ArraysProcessing.sum(array);
		System.out.println("Array sum is: " + arraySum);

		System.out.println("==========================================================================");
		System.out.println("= 3. Testing printing of the array =======================================");

		System.out.println("We will use the same array.");
		ArraysProcessing.print(array);

		System.out.println("==========================================================================");
		System.out.println("= 4. Finds contiguous subarray with largest sum ==========================");

		int[] arrayForTestingLargestSumOfContiguousSubarrayMethod = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.print("Test array -> ");
		ArraysProcessing.print(arrayForTestingLargestSumOfContiguousSubarrayMethod);

		int largestSumOfContiguousSubarray = ArraysProcessing
				.largestSumOfContiguousSubarray(arrayForTestingLargestSumOfContiguousSubarrayMethod);
		System.out.println("The largest sum of contiguous subarray is: " + largestSumOfContiguousSubarray);

		System.out.println("");
		System.out.println("===========================================================================");
		System.out.println("=== Third task ============================================================");
		System.out.println("===========================================================================");

		int[] medianTestArr = { 4, 5, 99, -1, 5, 6 };
		System.out.print("Test array -> ");
		ArraysProcessing.print(medianTestArr);

		int median = ArraysProcessing.findMedian(medianTestArr);
		System.out.println("The median of the array is at index: " + median + " (index starts from 1)");

		System.out.println("");
		System.out.println("===========================================================================");
		System.out.println("=== Fourth task ===========================================================");
		System.out.println("===========================================================================");

		int[] quickSortTestArr = { 10, 80, 30, 90, 40, 50, 70 };
		System.out.print("Test array -> ");
		ArraysProcessing.print(quickSortTestArr);

		int arrayLength = quickSortTestArr.length;
		ArraysProcessing.quickSort(quickSortTestArr, 0, arrayLength - 1);
		System.out.print("Sorted array: ");
		ArraysProcessing.print(quickSortTestArr);

		System.out.println("");
		System.out.println("===========================================================================");
		System.out.println("=== Fifth task ============================================================");
		System.out.println("===========================================================================");
		System.out.println("We will use the same array.");

		ArraysProcessing.reverse(quickSortTestArr);
		System.out.print("Reversed array: ");
		ArraysProcessing.print(quickSortTestArr);

	}

}
