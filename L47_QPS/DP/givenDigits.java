package DP;

import java.io.*;
import java.lang.*;
import java.util.*;

public class givenDigits {

	// Function to check sum
	// of digit using tail recursion
	public static int sumDig(int n, int val)
	{
		if (n < 10) {
			val = val + n;
			return val;
		}
		return sumDig(n / 10, (n % 10) + val);
	}

	// Driven Program to check above
	public static void main(String args[])
	{
		int num = 12345;
		int result = sumDig(num, 0);
		System.out.println("Sum of digits is " + result);
	}
}
