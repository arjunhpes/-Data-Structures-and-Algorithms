package DP;

import java.util.*;

public class countPair2Array {

	public static int countPairs(int A1[], int A2[], int n1, int n2, int K) {
		int res = 0;

		// create map of elements of array A1
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i = 0; i < n1; ++i) {
			if (m.containsKey(A1[i]))
				m.put(A1[i], m.get(A1[i]) + 1);
			else
				m.put(A1[i], 1);
		}

		// count total pairs
		for (int i = 0; i < n2; ++i) {
			int temp = K - A2[i];

			if (m.containsKey(temp) && m.get(temp) != 0) {
				res++;

				// Every element can be part
				// of at most one pair.
				m.put(temp, m.get(A1[i]) - 1);
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int A1[] = {5, 2, 7, 3, 6};
		int A2[] = {2, 1, 6, 9, 4}, K = 20;

		int n1 = A1.length;
		int n2 = A2.length;

		System.out.println(countPairs(A1, A2, n1, n2, K));
	}
}
