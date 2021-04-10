package Imp;

import java.util.*;

public class maxOcc {
	

	public static char MaxOccuringChar(String str1) {
		final int N = 256;
		int ctr[] = new int[N];
		int l = str1.length();
		for (int i = 0; i < l; i++)
			ctr[str1.charAt(i)]++;
		int max = -1;
		char result = ' ';

		for (int i = 0; i < l; i++) {
			if (max < ctr[str1.charAt(i)]) {
				max = ctr[str1.charAt(i)];
				result = str1.charAt(i);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		String str1 = "Nagarro Test";
		System.out.println( str1);
		System.out.println(MaxOccuringChar(str1));
	}
}
