package Array;

public class mangoDistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 7;
		int n = 5;
		System.out.println(mangoD(m, n));
	}

	public static int mangoD(int m, int n) {
		if (m < n) {
			return 0;
		}
		int ways = binomicalCoff(m+n-1, n-1);
		return ways;
	}
	public static int binomicalCoff(int a, int b) {
		int res = 1;
		if (b > a) {
			b = a-b;
			
		}
		for(int i = 0; i < b; i++) {
			res *= (a-i);
			res /= i+1;
		}
		return res;
	}
}
