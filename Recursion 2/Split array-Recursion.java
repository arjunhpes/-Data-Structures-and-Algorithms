/*
Take as input N, a number. Take N more inputs and store that in an array.

a. Write a recursive function which counts the number of ways the array could be split in two groups, so that the sum of items in both groups is equal. Each number in the array must belong to one of the two groups. Print the value returned.

b. Write a recursive function which keeps track of ways an array could be split in two groups, so that the sum of items in both groups is equal. Each number in the array must belong to one of the two groups. Return type of function should be void. Print the two groups, each time you find a successful split.

Input Format
Take as input N, a number. Take N more inputs and store that in an array.

Constraints
None

Output Format
Display all the groups in a comma separated manner and display the number of ways the array can be split

Sample Input
6
1
2
3
3
4
5
Sample Output
1 2 3 3 and 4 5 
1 3 5 and 2 3 4 
1 3 5 and 2 3 4 
2 3 4 and 1 3 5 
2 3 4 and 1 3 5 
4 5 and 1 2 3 3 
6
*/

import java.util.*;
public class Main
{
	private static Scanner sc;
	public static void main(String[] args)
	{
		sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
        Arrays.sort(a);
		int count=SplitArray1(0,a,0,"",0,"");
		System.out.println(count);
		SplitArray(0,a,0,"",0,"");
	}
	public static int SplitArray1(int i,int[]a, int sum1, String res1, int sum2, String res2)
	{
		int count=0;
		if(i==a.length)
		{
		if(sum1==sum2)
		{
			return count+1;
		}
		return 0;
		}
		int l=SplitArray1(i+1,a,sum1+a[i],res1+a[i]+" ",sum2,res2);
		int r=SplitArray1(i+1,a,sum1,res1,sum2+a[i],res2+a[i]+" ");
		return l+r;
		
	}
	public static void SplitArray(int i,int[]a, int sum1, String res1, int sum2, String res2)
	{
		if(i==a.length)
		{
		if(sum1==sum2)
		{
			System.out.println(res1+" "+"and"+" "+res2);
		}
		return;
		}
		SplitArray(i+1,a,sum1+a[i],res1+a[i]+" ",sum2,res2);
		SplitArray(i+1,a,sum1,res1,sum2+a[i],res2+a[i]+" ");
		
		
	}
}