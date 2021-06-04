package DP;

//Java program to find k closest elements to a given value
public class kClosest {

	public static int findCrossOver(int arr[], int low, int high, int x) {
		// Base cases
		if (arr[high] <= x)
			return high;
		if (arr[low] > x)
			return low;

		// Find the middle point
		int mid = (low + high) / 2;

		if (arr[mid] <= x && arr[mid + 1] > x)
			return mid;

		if (arr[mid] < x)
			return findCrossOver(arr, mid + 1, high, x);

		return findCrossOver(arr, low, mid - 1, x);
	}

	public static void printKclosest(int arr[], int x, int k, int n) {
		int l = findCrossOver(arr, 0, n - 1, x);
		int r = l + 1;
		int count = 0;

		if (arr[l] == x)
			l--;

		while (l >= 0 && r < n && count < k) {
			if (x - arr[l] < arr[r] - x)
				System.out.print(arr[l--] + " ");
			else
				System.out.print(arr[r++] + " ");
			count++;
		}

		while (count < k && l >= 0) {
			System.out.print(arr[l--] + " ");
			count++;
		}

		while (count < k && r < n) {
			System.out.print(arr[r++] + " ");
			count++;
		}
	}

	public static void main(String args[]) {
		int arr[] = { 12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56 };
		int n = arr.length;
		int x = 35, k = 4;
		printKclosest(arr, x, 4, n);
	}
}
