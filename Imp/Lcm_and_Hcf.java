package Imp;


import java.util.Scanner;

public class Lcm_and_Hcf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		int l = sc.nextInt();
		System.out.println(count_pair(g, l));
	}

	public static int count_pair(int g, int l) {
		int count = 0;
		int p = g * l;
		for (int i = 1; i <= l; i++) {
			if (p % i == 0 && gcd(p / i, i) == g) {
				count++;
			}

		}
		return count;
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		while (a % b != 0) {
			int rem = a % b;
			a = b;
			b = rem;
		}
		return b;
	}

}