package Array;

import java.util.*;

public class shiftMatrixByK {
    public static void shiftMatrixByK(int[][] mat, int k) {
        if (k > mat.length) {
            System.out.print("Shifting is" + " not possible");
            return;
        }

        int j = 0;
        while (j < mat.length) {
            for (int i = k; i < mat.length; i++)
                System.out.print(mat[j][i] + " ");
            for (int i = 0; i < k; i++)
                System.out.print(mat[j][i] + " ");

            System.out.println();
            j++;
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int[][] mat = new int[m][m];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        int k = scn.nextInt();
        shiftMatrixByK(mat, k);
    }
}
