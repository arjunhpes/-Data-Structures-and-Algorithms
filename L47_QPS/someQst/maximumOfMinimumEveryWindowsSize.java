package someQst;

import java.util.Stack;
/*
 * Time Complexity
 * 
 * O(N), where ‘N’ is the number of elements present in the array.
 * 
 * The Time Complexity for creating the next array and the prev array from
 * Monotonic Stack takes linear time. For each element, we update our answer
 * using next and prev in constant time. Hence, the overall Time Complexity is
 * O(N). Space Complexity
 * 
 * O(N), where ‘N’ is the number of elements present in the array.
 * 
 * We are using two extra arrays, next and prev of size N. Hence, the overall
 * Space Complexity is O(N).
 *
*/

public class maximumOfMinimumEveryWindowsSize {

	public static int[] maxMinWindow(int[] arr, int n) {
		int[] answer = new int[n];

		for (int i = 0; i < n; ++i) {
			answer[i] = Integer.MIN_VALUE;
		}
		int[] next = nextSmaller(arr, n);

		int[] prev = previousSmaller(arr, n);

		for (int i = 0; i < n; i++) {
			int length = next[i] - prev[i] - 1;

			answer[length - 1] = Math.max(answer[length - 1], arr[i]);
		}

		for (int i = n - 2; i >= 0; i--) {
			answer[i] = Math.max(answer[i], answer[i + 1]);
		}

		return answer;
	}

	public static int[] previousSmaller(int[] arr, int n) {
		int[] prev = new int[n];
		Stack<Integer> s = new Stack<>();

		for (int i = 0; i < n; i++) {
			while (!s.empty() && arr[s.peek()] >= arr[i]) {
				s.pop();
			}

			if (s.empty()) {
				prev[i] = -1;
			} else {
				prev[i] = s.peek();
			}

			s.push(i);
		}

		return prev;
	}

	public static int[] nextSmaller(int[] arr, int n) {
		Stack<Integer> s = new Stack<>();
		int[] next = new int[n];

		for (int i = n - 1; i >= 0; i--) {
			while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
				s.pop();
			}

			if (s.empty()) {
				next[i] = n;
			} else {
				next[i] = s.peek();
			}

			s.push(i);
		}

		return next;
	}

	public static void main(String[] args) {
		int a[] = { 45, -2, 42, 5, -11  };
		maxMinWindow(a, a.length);

		int[] finalCall = maxMinWindow(a, a.length);
		for (int i = 0; i <= finalCall.length - 1; i++)
			System.out.print(finalCall[i] + " ");
	}
}

