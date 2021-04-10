package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class spiralTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scn.nextInt();
			}
    	}
		
		
		
		ArrayList<Integer> answer = Spiral(arr);
		
		for( int i = 0; i<answer.size(); i++) {
			System.out.print(answer);
			break;
		}
		System.out.println(", END");
	
}
	public static ArrayList<Integer> Spiral(int[][] A) {
		ArrayList<Integer> ans = new ArrayList<>();
		int T,B,L,R,dir;
	    T=0;
	    B=A.length-1;
	    L=0;
	    R=A[0].length-1;
	    dir=0;
	    int i;
	       
	    while(T<=B && L<=R)
	    {
	        if(dir==0)
	        {
	            for(i=L;i<=R;i++)
	                ans.add(A[T][i]);
	            T++;
	        }
	        else if(dir==1)
	        {
	            for(i=T;i<=B;i++)
	                ans.add(A[i][R]);
	            R--;
	        }
	        else if(dir==2)
	        {
	            for(i=R;i>=L;i--)
	                ans.add(A[B][i]);
	            B--;
	        }
	        else if(dir==3)
	        {
	            for(i=B;i>=T;i--)
	                ans.add(A[i][L]);
	            L++;
	        }
	        dir=(dir+1)%4;
	    }
	    return ans;
	}

}
