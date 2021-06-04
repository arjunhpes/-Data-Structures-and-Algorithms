package DP;

import java.io.*;

public class countDecodingsGFG {

	public static int countDecodingDP(char digits[], int n) {
		int count[] = new int[n + 1];
		count[0] = 1;
		count[1] = 1;
		if (digits[0] == '0') // for base condition "01123" should return 0
			return 0;
		for (int i = 2; i <= n; i++) {
			count[i] = 0;

			if (digits[i - 1] > '0')
				count[i] = count[i - 1];

			
			if (digits[i - 2] == '1' || (digits[i - 2] == '2' && digits[i - 1] < '7'))
				count[i] += count[i - 2];
		}
		return count[n];
	}

	public static void main(String[] args) {
		char digits[] = { '1', '2', '3', '4' };
		int n = digits.length;
		System.out.println("Count is " + countDecodingDP(digits, n));
	}
}

