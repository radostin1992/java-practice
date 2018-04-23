/**
 * 
 */
package com.radostin.intro.arrayProcessing;

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
		int leftIndex = 0;
		int rightIndex = array.length - 1;
		int median = 0;

		int sumL = array[0];
		int sumR = array[array.length - 1];

		for (int i = 1; i < array.length; i++) {
			if (leftIndex != rightIndex - 1) {
				if (sumL > sumR) {
					rightIndex--;
					sumR = sumR + array[rightIndex];
				} else {
					leftIndex++;
					sumL = sumL + array[leftIndex];
				}
			} else {
				if (sumL < sumR) {
					median = rightIndex + 1;
				} else
					median = leftIndex + 1;
				return median;
			}
		}
		return median;
	}

	public static void quickSort(int[] array, int low, int high) {
		if (low < high) {
			int pi = partition(array, low, high);
			quickSort(array, low, pi - 1);
			quickSort(array, pi + 1, high);
		}
	}

	static int partition(int array[], int low, int high) {
		int pivot = array[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;

		return i + 1;
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
