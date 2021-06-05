package someQst;

import java.util.Arrays;
import java.util.Stack;


// TC And SC = O(n)
public class nextGreaterElemenet {
	public static int[] findNextGreaterElements(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		Arrays.fill(result, -1);

		// create an empty stack
		Stack<Integer> s = new Stack<>();

		// process each element from right to left
		for (int i = n - 1; i >= 0; i--) {
			// loop till we have a greater element on top or stack becomes empty.
			while (!s.empty()) {
				// pop elements that aren't greater than the current element
				if (s.peek() <= arr[i]) {
					s.pop();
				}
				// the next greater element is now on the top of the stack
				else {
					result[i] = s.peek();
					break;
				}
			}

			// push current element into the stack
			s.push(arr[i]);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1,2,1 };

		int[] result = findNextGreaterElements(arr);
		System.out.println(Arrays.toString(result));
	}
}