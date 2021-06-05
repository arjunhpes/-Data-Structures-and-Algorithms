package someQst;

public class minimumOperations {

	public static int minOperations(int n) {

		int dp[] = new int[n + 1];

		// Initilal state
		dp[1] = 0;

		for (int i = 2; i <= n; i++) {
			dp[i] = Integer.MAX_VALUE;

			if (i % 2 == 0) {
				int x = dp[i / 2];
				if (x + 1 < dp[i]) {
					dp[i] = x + 1;
				}
			}

			if (i % 3 == 0) {
				int x = dp[i / 3];
				if (x + 1 < dp[i]) {
					dp[i] = x + 1;
				}
			}

			int x = dp[i - 1];
			if (x + 1 < dp[i]) {
				dp[i] = x + 1;
			}
		}

		return dp[n];
	}

	public static void main(String[] args) {
		int n = 1456354;

		System.out.print(minOperations(n));
	}
}

