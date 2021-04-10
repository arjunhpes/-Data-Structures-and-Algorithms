package Imp;
/*
 * Given a list(Arr) of N integers, print sums of all subsets in it.
 *  Output should be printed in increasing order of sums.
Example 1:
Input:
N = 2
Arr = [2, 3]
Output:
0 2 3 5
Explanation:
When no elements is taken then Sum = 0.
When only 2 is taken then Sum = 2.
When only 3 is taken then Sum = 3.
When element 2 and 3 are taken then 
Sum = 2+3 = 5.
Example 2:
Input:
N = 3
Arr = [5, 2, 1]
Output:
0 1 2 3 5 6 7 8
Your Task:  
You don't need to read input or print anything. Your task is to complete
 the function subsetSum() which takes a list/vector and an integer N as an
  input parameter and return the list/vector of all the subset sums in 
  increasing order.
 */
import java.util.*;
public class Print_Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3};
		ArrayList<Integer> list = new ArrayList<Integer>();
		//print_subSet(arr, "", 0);
		subSet_sum(arr, 0, 0, list);
		Collections.sort(list);
		System.out.println(list);

	}
	public static void print_subSet(int []arr, String ans, int i) {
		if(i==arr.length) {
			System.out.println(ans);
			return ;
		}
		
		print_subSet(arr, ans+arr[i]+" ", i+1);// yes
		print_subSet(arr, ans, i+1);// no
	}
	public static void subSet_sum(int []arr, int  ans, int i, ArrayList<Integer> list) {
		if(i==arr.length) {
			//System.out.println(ans);
			list.add(ans);
			return ;
		}
		
		subSet_sum(arr, ans+arr[i],i+1,list);// yes
		subSet_sum(arr, ans, i+1,list);// no
	}

}