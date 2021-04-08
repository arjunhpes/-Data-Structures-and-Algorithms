package Array;

import java.util.Scanner;

public class shortest_palindrome {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(shortPalin(str));
		
		
	}
	public static String shortPalin(String str) {
		
		int i = 0;
		int j = str.length()-1;
		while(j >= 0) {
			if(str.charAt(i) == str.charAt(j)) {
				i++;
			}
			j--;
		}
		if(i == str.length()) {
			return str;
		}
		String start = str.substring(i);
		StringBuilder sb = new StringBuilder(start);
		String end = sb.reverse().toString();
		String middle = shortPalin(str.substring(0,i));
		String rev = end+middle+start;
		return rev;
	}

}
