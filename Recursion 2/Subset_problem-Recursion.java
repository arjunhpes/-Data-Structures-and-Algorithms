
/*
Take as input N, a number. Take N more inputs and store that in an array. Take as input target, a number

a. Write a recursive function which counts the number of subsets of the array which sum to target. Print the value returned.

b. Write a recursive function which prints subsets of the array which sum to target. Return type of functions is void.

Input Format
Take as input N, a number. Take N more inputs and store that in an array.Take as input target, a number

Constraints
None

Output Format
Display the number of subsets and print the subsets in a space separated manner.

Sample Input
3
1
2
3
3
Sample Output
1 2  3
2
*/

import java.util.Scanner;

public class Main {
    static int cnt = 0;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
        int target = scn.nextInt();
      
        subset_prblm(arr, 0, 0, "", target);
        System.out.println();
        System.out.println(cnt);
    }

    public static void subset_prblm(int[] arr, int vidx,int ssf,String ans,int target){
        if(vidx == arr.length){
            if(target == ssf){
                System.out.print(ans+" ");
                cnt++;
                return;
            }
            return;
        }
  
        
        subset_prblm(arr,vidx + 1,ssf + arr[vidx],ans + arr[vidx]+" ",target);
  
        subset_prblm(arr,vidx + 1,ssf,ans,target);
  
        
    }
    
}


