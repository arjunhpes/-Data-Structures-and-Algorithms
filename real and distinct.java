import java.lang.Math;
import java.util.*;
public class Main {
   public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = (b * b - 4 * a * c);
        if (d > 0) {
            System.out.println("Real and Distinct");
            System.out.print((int) ((-b - Math.sqrt(d)) / 2 * a) + " " + (int) ((-b + Math.sqrt(d)) / 2 * a));
        } else if (d == 0) {
            System.out.println("Real and Equal");
            System.out.print((int) ((-b - Math.sqrt(d)) / 2 * a) + " " + (int) ((-b + Math.sqrt(d)) / 2 * a));

        } else
            System.out.print("Imaginary");

    }
}
