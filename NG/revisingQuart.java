package Array;
import java.util.Scanner;
import java.lang.Math;

public class revisingQuart{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = b * b - 4 * a * c;
		int r1, r2;
		if (d < 0)
			System.out.println("Imaginary");
		else if (d > 0) {
			System.out.println("Real and Distinct");
			r1 = ((-b - (int) (Math.sqrt(d))) / (2 * a));
			r2 = ((-b + (int) (Math.sqrt(d))) / (2 * a));
			System.out.print(r1 + " ");
			System.out.println(r2);
		} else {
			System.out.println("Real and Equal");
			r1 = (-b) / (2 * a);
			System.out.print(r1+" ");
			System.out.print(r1);

		}
	}
}