package Imp;

import java.util.ArrayList;
import java.util.Collections;

public class Diagonal_Traversal {
	public static void diagonal(int[][] arr) {
		int res[] = new int[arr.length * arr[0].length];
		int p = 0;
		int n = arr.length;// row
		int m = arr[0].length;// col
		for (int d = 0; d < n + m - 1; d++) {

			ArrayList<Integer> list = new ArrayList<Integer>();
			int r = d < m ? 0 : d - m + 1;
			int c = d < m ? d : m - 1;
			while (r < n && c >= 0) {
				list.add(arr[r][c]);
				r++;
				c--;
			}
			if (d % 2 == 0) {
				Collections.reverse(list);
				for (int i = 0; i < list.size(); i++) {
					res[p] = list.get(i);
					p++;
				}
			} else {
				for (int i = 0; i < list.size(); i++) {
					res[p] = list.get(i);
					p++;
				}
			}

		}
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		
		diagonal(arr);
	
	}
}