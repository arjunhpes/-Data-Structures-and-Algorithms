package someQst;

import java.util.*;
//import java.awt.Point;
import java.awt.Point;

class maximumSumISsubPrint {

//Function to construct and print the Maximum Sum
//Increasing Subsequence
	static void constructMaxSumIS(List<Integer> arr, int n) {

		List<Point> L = new ArrayList<Point>();

		int index = 0;
		for (int i : arr) {
			L.add(new Point(i, index));
			index++;
		}

		// Set L[0].second equal to -1
		L.set(0, new Point(L.get(0).x, -1));

		// Start from index 1
		for (int i = 1; i < n; i++) {

			// For every j less than i
			for (int j = 0; j < i; j++) {
				if (arr.get(i) > arr.get(j) && L.get(i).x < arr.get(i) + L.get(j).x) {
					L.set(i, new Point(arr.get(i) + L.get(j).x, j));
				}
			}
		}

		int maxi = -100000000, currIndex = 0, track = 0;

		for (Point p : L) {
			if (p.x > maxi) {
				maxi = p.x;
				currIndex = track;
			}
			track++;
		}

		// Stores the final Subsequence
		List<Integer> result = new ArrayList<Integer>();
		int prevoiusIndex;

		while (currIndex >= 0) {
			result.add(arr.get(currIndex));
			prevoiusIndex = L.get(currIndex).y;

			if (currIndex == prevoiusIndex)
				break;

			currIndex = prevoiusIndex;
		}

		for (int i = result.size() - 1; i >= 0; i--)
			System.out.print(result.get(i) + " ");
	}

	public static void main(String[] s) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(101);
		arr.add(2);
		arr.add(3);
		arr.add(100);
		arr.add(4);
		arr.add(5);

		int n = arr.size();

		// Function call
		constructMaxSumIS(arr, n);
	}
}

