package DP;

import java.util.HashSet;
import java.util.Set;

public class printNotPresentInFirstArray {

	public static void findMissing(int a[], int b[], int n, int m) {
		HashSet<Integer> s = new HashSet<>();
		for (int i = 0; i < n; i++)
			s.add(a[i]);

		// Print all elements of first array
		// that are not present in hash table
		for (int i = 0; i < m; i++)
			if (!s.contains(b[i]))
				System.out.print(b[i] + " ");
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 6, 3,0, 4, 5, 900 };
		int b[] = { 2, 4, 3, 1, 0 , 90};
		int n = a.length;
		int m = b.length;
		findMissing(a, b, n, m);
	}
}

