import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int k = 0, count = 0, count1 = 0;

    for (int i = 1; i <= rows; ++i) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  \t");
        ++count;
      }

      while (k != 2 * i - 1) {
        if (count <= rows - 1) {
          System.out.print((i + k) + "\t");
          ++count;
        } else {
          ++count1;
          System.out.print((i + k - 2 * count1) + "\t");
        }

        ++k;
      }
      count1 = count = k = 0;

      System.out.println();
    }
  }
}
