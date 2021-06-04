package DP;

public class middleElementAfterMerger2Array {

	// Function to find Index
	static int findMiddle(int[] arrA, int[] arrB) {

		// Calculating extra element
		int extra_element = sum(arrA) - sum(arrB);

		// returns index of extra element
		return indexOf(arrA, extra_element);
	}

	// function return sum of array elements
	static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// function return index of given element
	static int indexOf(int[] arr, int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return i;
			}
		}
		return -1;
	}

	// Driver Code
	public static void main(String[] args) {
		int[] arrA = { 2, 4, 6, 8, 10, 12, 13 };
		int[] arrB = { 2, 4, 6, 8, 10, 12 };
		System.out.println(findMiddle(arrA, arrB));
	}
}

/* This code contributed by PrinciRaj1992 */
