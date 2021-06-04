package DP;

public class countDecodingDP {
	public static int count(int x) {
		// convert `x` to a sequence of digits
		char[] chars = String.valueOf(x).toCharArray();

		// keep track of the results of only the last two subproblems
		int prev_of_prev = 1;
		int prev = 1;

		for (int i = 2; i <= chars.length; i++) {
			int curr = 0;

			// consider single-digit numbers (1, 2, … 8, 9)
			if (chars[i - 1] > '0') {
				curr = prev;
			}

			// consider 2-digit numbers (10, 11, … 19, 20, … 25, 26)
			if (chars[i - 2] == '1' || (chars[i - 2] == '2' && chars[i - 1] <= '6')) {
				curr += prev_of_prev;
			}

			prev_of_prev = prev;
			prev = curr;
		}

		return prev;
	}

	public static void main(String[] args) {
		int x = 964652459;
		System.out.println("The total number of decodings are " + count(x));
	}
}