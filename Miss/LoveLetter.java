package Array;

import java.util.*;

public class LoveLetter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		for (int i = 1; i <= a; i++) {
			char[] string = in.next().toCharArray();
			
			
			int si = 0, ei = string.length - 1, count = 0;
			while (si < ei) {
				if (string[si] > string[ei])
					count += (string[si] - string[ei]);
				else
					count += (string[ei] - string[si]);
				si++;
				ei--;
			}
			System.out.println(count);
		}
	}
}