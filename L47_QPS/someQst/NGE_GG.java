package someQst;

import java.util.Stack;

public class NGE_GG {


	public static int[] printNGE(int[] arr) {
		Stack<Integer> s = new Stack<>();
		int nge[] = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			if (!s.empty()) {
				while (!s.empty() && s.peek() <= arr[i]) {
					s.pop();
				}
			}
			nge[i] = s.empty() ? -1 : s.peek();
			s.push(arr[i]);
		}
		return nge;
	}
	
	// Not Madate But Check While Submitting The Code What They want to say to do..
	public static void displayNGE(int[] nge) {
			int[] str = printNGE(nge) ;
		
		for ( int v : str)
		{
			System.out.println(v);
		}

	}
	
	public static void main(String[] args) {
		// NextGreaterElement nge = new
		// NextGreaterElement();
		int arr[] = { 11, 13, 21, 3 };
		printNGE(arr);
		
		displayNGE(arr);
		
		
		
	}
}
