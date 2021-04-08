import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = 1;
		int nsp = 2 * n - 3;

		int row = 1;
		while (row <= n) {

			// stars
			for (int cst = 1; cst <= nst; cst = cst + 1)
				System.out.print(cst+ " ");

			// spaces
			for (int csp = 1; csp <= nsp; csp = csp + 1)
				System.out.print("  ");

			// stars
			int cst = nst ;
			
			if(row == n )
				cst = nst-1;
				
			
			for ( ; cst >=1 ; cst --)
				System.out.print(cst + " ");

			// update
			System.out.println();

			nst = nst + 1;
			nsp = nsp - 2;

			row = row + 1;

		}
	}
}