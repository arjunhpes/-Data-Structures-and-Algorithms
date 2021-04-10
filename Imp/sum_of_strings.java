
/*
 * acfv45sd45
 * output : 18
 * */

package Imp;

import java.util.Scanner;

public class sum_of_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0) {
			String str = sc.next();
			System.out.println(sumofString(str));
		}

	}

	public  static long sumofString(String str) {
		// TODO Auto-generated method stub
		long sum=0;
		String t = "0";
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				t+=ch;
			}
			else {
				sum+=Long.parseLong(t);
				t="0";
			}
			
		}
		sum+=Long.parseLong(t);
		return sum;
	}

}