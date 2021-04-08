import java.util.*;
public class Main {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // cin >> n;
        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int space = 1; space <= (n - i + 1); space++) {
                System.out.print("");

            }
            for (int j = 1; j <= i; j++) {
                if (j == 1)
                    System.out.print(j + "\t");
                else {
                    num = num * (i - j + 1) / (j - 1);
                    System.out.print(num + "\t");
                }

            }
            System.out.println();
        }
    }

}
