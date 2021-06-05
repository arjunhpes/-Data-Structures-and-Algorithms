package someQst;

import java.util.*;

public class unknown {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashMap<Integer, Boolean> m = new HashMap<>();
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < N; i++)
		{
			int x = sc.nextInt();
			while (m.containsKey(x))
			{
				x = x + 1;
			}
			m.put(x, true);
			a.add(x);
		}
		int sum = 0;
		for (int i = 0; i < a.size(); i++)
		{
			sum = sum + a.get(i);
		}
		System.out.print(sum);
	}
}
