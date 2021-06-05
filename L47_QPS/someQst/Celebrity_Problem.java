package someQst;

import java.util.Stack;

class Celebrity_Problem {

	public static int celebrityProblem(int[][] arr) {

		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			s.push(i);
		}
		while (s.size() != 1) {
			int a = s.pop();
			int b = s.pop();
			// a knows b : a can't be a celeb
			if (arr[a][b] == 1) {
				s.push(b);
			}
			// a doesn't know b : b can't be a celeb
			else {
				s.push(a);
			}
		}
		int candidate = s.pop();
		for (int i = 0; i < arr.length; i++) {

			if (i != candidate) {

				if (arr[candidate][i] == 1 || arr[i][candidate] == 0) {
//					System.out.println("No celeb");
					return -1;
				}
			}
		}
		return candidate;
	}
	public static void main(String[] args) {
		int MATRIX[][] = { { 0, 0, 0, 0 },
						   { 1, 0, 1, 1 },
				           { 1, 1, 0, 1 },
				           { 1, 1 , 1, 0 } 
				           };
		int n = 4;
		int result = celebrityProblem(MATRIX);
		if (result == -1) {
			System.out.println("No Celebrity");
		} else
			System.out.println("Celebrity ID " + result);
	}
}
