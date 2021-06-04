package DP;

/*
 * Time Complexity: O(N)
   Auxiliary Space: O(1)
 * */

public class MinimumNumberofAppendsofXorY {

	public static int minimumOperations(String originalStr, int m, int n) {

		String orig = originalStr;

		int turn = 1;
		int j = 1;

		for (int i = 0; i < originalStr.length(); i++) {

			String m_cut = originalStr.substring(originalStr.length() - m);

			originalStr = originalStr.substring(0, originalStr.length() - m);

			originalStr = m_cut + originalStr;

			j = j + 1;

			if (!orig.equals(originalStr)) {
				turn = turn + 1;

				String n_cut = originalStr.substring(originalStr.length() - n);
				originalStr = originalStr.substring(0, originalStr.length() - n);

				originalStr = n_cut + originalStr;

				j = j + 1;
			}

			if (orig.equals(originalStr)) {
				break;
			}

			turn = turn + 1;
		}
		return turn;
	}

	public static void main(String[] args) {

//		String S = "ArjunSinghLoopUsingDynamicProgrammingSuchThatRunFastererbdsfnciaengik vjdzfnl iegfdbkuejzbsfuksvezsbifkvbrs ilezskbgkv uszdhgbvk5165262656265265ivndzxvkjndfikgbnod;ffinli";
		String S = "GeeksforGeeks";
		int X = 5, Y = 3;

		System.out.println(minimumOperations(S, X, Y));
	}
}

