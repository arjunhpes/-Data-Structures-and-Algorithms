import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int i = 1;
		int count = 0;

		while (count < n1) {

			int snum = 3 * i + 2;

			if (snum % n2 != 0) {
				System.out.println(snum);
				count++;
			}

			i++;

		}

    }
}
