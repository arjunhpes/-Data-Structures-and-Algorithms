import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row, col, n2 = 1, n1 = 0, sum = 0;

        for (row = 1; row <= n; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print(n1 + "\t");
                sum = n1 + n2;
                n1 = n2;
                n2 = sum;

            }
            System.out.println();
        }
    }
}
