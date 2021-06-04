package DP;

import java.util.*;
import java.lang.*;

public class binaryPalindrome {
	public static long reverseBits(long n) {
		long rev = 0;

		while (n > 0) {
			rev <<= 1;

			if ((n & 1) == 1)
				rev ^= 1;

			n >>= 1;
		}

		return rev;
	}

	public static boolean isPalindrome(long n) {
		// representation of 'n'
		long rev = reverseBits(n);

		return (n == rev);
	}

	// Driver function
	public static void main(String argc[]) {
		long n = 10;
		if (isPalindrome(n))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
