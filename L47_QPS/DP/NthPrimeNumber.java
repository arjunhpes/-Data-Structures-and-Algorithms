package DP;

import java.util.*;

/*
 * O(Log n)
 * */
public class NthPrimeNumber {
	public static int nthprimedigitsnumber(int number) {
		int rem;
		String num = "";
		while (number > 0) {
			rem = number % 4;
			switch (rem) {

			case 1:
				num += '2';
				break;

			case 2:
				num += '3';
				break;

			case 3:
				num += '5';
				break;

			case 0:
				num += '7';
				break;
			}

			if (number % 4 == 0)
				number--;

			number = number / 4;
		}
		String sb = new StringBuilder(num).reverse().toString();
		return Integer.parseInt(sb);
	}

	public static void main(String[] args) {
		int number = 2336416;
		System.out.println(nthprimedigitsnumber(number));
		System.out.println(nthprimedigitsnumber(21));
	}
}
