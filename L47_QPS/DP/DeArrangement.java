package DP;

import java.io.*;

public class DeArrangement {

	public static long countDer(int n) {
		// Base case
		if (n == 1 || n == 2) {
			return n - 1;
		}

		// Variable for storing prev values
		long a = 0;
		long b = 1;

		// manner using above recursive formula
		for (int i = 3; i <= n; ++i) {
			long cur = (i - 1) * (a + b);
			a = b;
			b = cur;
		}

		return b;
	}

	public static void main(String[] args) {
		int n = 3;
		System.out.println("Count of Dearrangements is " + countDer(n));

	}

}