package Imp;

import java.util.*;

public class Happy_Number_Leetcode {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (is_Happy_number(n)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

	public static boolean is_Happy_number(int n) {
		if (n == 1) {
			return true;
		}
		if (n != 7 && n < 10) {
			return false;
		}
		count++;
		return is_Happy_number(new_nmber(n));
	}

	public static int new_nmber(int n) {
		int new_num = 0;
		while (n > 0) {
			int rem = n % 10;
			new_num += (rem * rem);
			n /= 10;

		}
		return new_num;
	}
}