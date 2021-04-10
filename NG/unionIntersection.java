package Array;

import java.util.Arrays;
import java.util.Scanner;

public class unionIntersection {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	
		int m = scn.nextInt();
		int[] a1 = new int[m];
		for( int i = 0; i < a1.length; i++) {
			a1[i] = scn.nextInt();
		}
		
		int n = scn.nextInt();
		int[] b2 = new int[n];
		
		
		for(int j = 0 ; j < b2.length; j++) {
			b2[j] = scn.nextInt();
		}
		
		
		uAndi(a1, b2, m, n);
		System.out.println();
		Intersection(a1, b2);
		
	}
	
	
	public static void uAndi(int [] arr1, int[] arr2, int m, int n) {
	{ 
		Arrays.sort(arr1);
		Arrays.sort(arr2);
        int i = 0, j = 0; 
        while (i < m && j < n) { 
            if (arr1[i] < arr2[j]) 
                System.out.print(arr1[i++] + " "); 
            else if (arr2[j] < arr1[i]) 
                System.out.print(arr2[j++] + " "); 
            else { 
                System.out.print(arr2[j++] + " "); 
                i++; 
            } 
        } 
  
        /* Print remaining elements of  
         the larger array */
        while (i < m) 
            System.out.print(arr1[i++] + " "); 
        while (j < n) 
            System.out.print(arr2[j++] + " "); 
  
        //return 0; 
	}
	
    } 
	public static void Intersection(int[] myArray1, int[] myArray2) {
		
		 for(int i = 0; i<myArray1.length; i++ ) {
	         for(int j = 0; j<myArray2.length; j++) {
	            if(myArray1[i]==myArray2[j]) {
	               System.out.print(myArray2[j] + " ");
	            }
	         }
	      }
	}
}

//
//int i = 0;
//int j = 0;
//
//while(i < a.length && j < b.length) {
//	if (a[i] < b[j]) {
//		System.out.print(a[i] + " ");
//		i++;
//	}
//	else {
//		if(b[j] < a[i]) {
//			System.out.print(b[j]+ " ");
//			j++;
//		}
//		
//		else {
//			//System.out.print(a[i] + " ");
//			i++;
//			j++;
//		}
//	}
//}
//
//
//}
