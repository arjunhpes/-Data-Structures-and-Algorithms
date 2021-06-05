package someQst;

import java.util.Stack;

public class Pattern_132_Geeky_Buildings {

	public static void main(String[] args) {

		int[] nums = {-1,3,2,0};
		
		System.out.println(find132pattern(nums));
	}

	public static boolean find132pattern(int[] arr) {
		int N = arr.length;
		if (N < 3) {
			return false;
		}

		int preMin[] = new int[N];
		preMin[0] = arr[0];

		for (int i = 1; i < N; i++) {
			preMin[i] = Math.min(preMin[i - 1], arr[i]);
		}

		Stack<Integer> stack = new Stack<Integer>();

		for (int j = N - 1; j >= 0; j--) {

			if (arr[j] > preMin[j]) {

				while (stack.empty() == false && stack.peek() <= preMin[j]) {

					stack.pop();
				}

				if (stack.empty() == false && stack.peek() < arr[j]) {
					return true;
				}

				stack.push(arr[j]);
			}
		}

		return false;
	}
}
