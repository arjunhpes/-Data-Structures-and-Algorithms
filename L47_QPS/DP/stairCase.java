package DP;

public class stairCase {
	public static void main(String[] args) {
		int n = 5;
		int[] arr = {16, 19, 10, 12, 18};
//		System.out.println(countPath(n));
//		System.out.println(countPathTD(n, new int[n+1]));
		System.out.println(countPathBU(n));
		System.out.println(countPathTDJumps(arr));
	}
	
	public static int countPath(int n ) {
		//Base Case
		if (n == 0)
			return 1;
		if(n < 0)
			return 0;
		
		System.out.println("Hello" + n);
		//Smaller Problem
		int nm1 = countPath(n-1);
		int nm2 = countPath(n-2);
		int nm3 = countPath(n-3);
		
		//Self Work
		int cp = nm1 + nm2 + nm3;
		
		return cp;
		
	}

	public static int countPathTD(int n, int[] qb) {
		//Base Case
		if (n == 0)
			return 1;
		if(n < 0)
			return 0;
		if( qb[n] != 0)
			return qb[n];
		
		System.out.println("Hello" + n);
		//Smaller Problem
		int nm1 = countPathTD(n-1, qb);
		int nm2 = countPathTD(n-2, qb);
//		int nm3 = countPathTD(n-3, qb);
		
		//Self Work
		int cp = nm1 + nm2;
		
		qb[n] = cp;
		return cp;
		
	}

	public static int countPathBU(int n) {
		
		int[] dp = new int[n+1];
		
		dp[0] = 1;
		for( int i = 1; i <= n; i++) {
			if (i == 1) {
				dp[i] = dp[i-1];
			}
			else if(i == 2) {
				dp[i] = dp[i-1] + dp[i-2];
			}
			else
				dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		return dp[n];
	}

	public static int countPathTDJumps(int[] arr) {
		int n = arr.length;
		int[] dp = new int[n + 1];
		dp[n] = 1;
		
		for(int i =n-1; i >=0; i-- ) {
			for(int j = 1; j <= arr[i] && i + j <dp.length; j++) {
				dp[i] += dp[i+j];
			}
		}
		return dp[0];
		
	}
}
