import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] one = takeInput();
		int[] two = takeInput();
		union(one, two);
		intersection(one, two);
	}

	public static int[] takeInput() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	public static void union(int[] a, int[] b) {
		ArrayList<Integer> l = new ArrayList<>();
		for (int i = 0; i < (a.length > b.length ? a.length : b.length); i++) {
            if (i < a.length) {
                int c = 0;
                while (c <= l.size()) {
                    if (l.contains(a[i]) == false) {
                        l.add(a[i]);
                    }
                    c++;
                }
            }
            if (i < b.length) {
                int c = 0;
                while (c <= l.size()) {
                    if (l.contains(b[i]) == false) {
                        l.add(b[i]);
                    }
                    c++;
                }

            }

        }
		Collections.sort(l);
        for (int r = 0; r < l.size(); r++) {
            if (r == 0)
                System.out.print(l.get(r));
            else System.out.print(" " + l.get(r));
        }
        System.out.println();
        //System.out.println(l);
	}

	public static void intersection(int[] one, int[] two) {
		ArrayList<Integer> intersection = new ArrayList<>();
		int i = 0;
		int j = 0;
		while (i < one.length && j < two.length) {
			if (one[i] < two[j])
				i++;
			else if (one[i] > two[j])
				j++;
			else {
				intersection.add(one[i]);
				i++;
				j++;
			}
		}
		Collections.sort(intersection);
		for (int r = 0; r < intersection.size(); r++) {
			if (r == 0)
				System.out.print(intersection.get(r));
			else
				System.out.print(" " + intersection.get(r));
		}
	}
}