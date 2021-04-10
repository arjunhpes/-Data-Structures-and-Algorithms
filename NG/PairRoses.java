package Array;

import java.util.Arrays;

import java.util.Scanner;

public class PairRoses {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tc = scn.nextInt();
		
		while(tc>0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<arr.length;i++) {
				arr[i] = scn.nextInt();
			}
			int target = scn.nextInt();
			
			targetSumPair(arr, target);
			tc--;
		}
	}
	
	public static void targetSumPair(int[] arr, int target) {
		// array sort
		Arrays.sort(arr);
		
		// logic ...
		int i = 0;
		int j = arr.length - 1;

		while (i < j) {

			if (arr[i] + arr[j] > target)
				j--;
			else if (arr[i] + arr[j] < target)
				i++;
			else {

				i++;
				j--;

			}
		}
		System.out.println("Deepak should buy roses whose prices are " + arr[i] + " and " + arr[j] + ".");

	}

}
