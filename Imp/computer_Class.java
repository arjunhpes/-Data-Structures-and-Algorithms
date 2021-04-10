package Imp;

import java.util.Arrays;

public class computer_Class {
	public static void main(String[] args) {
		int [] a= {0,4,5,4,1,5};
		int n = a.length;
		System.out.println(minDeletion(a, n));
	}
	
	public static int minDeletion(int[] a, int n) {
		int count = 0;
		int k = 1;
		Arrays.sort(a);
		for(int i = 2; i < n ; i++ ) {
			for(int j = k; j< i; j++) {
				if(a[i] > 2*a[j]) {
					count ++;
					k++;
				}
			}
		}
		return count;
	}
}
