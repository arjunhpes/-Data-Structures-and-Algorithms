import java.util.*;
public class Main {
    public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int val, nsp = n - 1, nst = 1,  nsp2 = 0;
		int row = 1;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			if (row <= n / 2)
				val = row;
			else
				val = n - row + 1;
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val + " ");
				val--;
				cst++;
			}
			if (row != 1 && row != n) {
				csp = 1;
				while (csp <= nsp2) {
					System.out.print("  ");
					csp++;
				}
				val = 1;
				cst = 1;
				while (cst <= nst) {
					System.out.print(val + " ");
					val++;
					cst++;
				}
			}
			if (row <= n / 2) {
				nsp -= 2;
				nst++;
				nsp2 += 2;
			} else {
				nsp += 2;
				nsp2 -= 2;
				nst--;
			}
			row++;
			System.out.println();
		}

	}
}
    
