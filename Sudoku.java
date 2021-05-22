
/*
Sample Input
9
5 3 0 0 7 0 0 0 0 
6 0 0 1 9 5 0 0 0 
0 9 8 0 0 0 0 6 0 
8 0 0 0 6 0 0 0 3 
4 0 0 8 0 3 0 0 1 
7 0 0 0 2 0 0 0 6 
0 6 0 0 0 0 2 8 0 
0 0 0 4 1 9 0 0 5 
0 0 0 0 8 0 0 7 9 
Sample Output
5 3 4 6 7 8 9 1 2 
6 7 2 1 9 5 3 4 8 
1 9 8 3 4 2 5 6 7 
8 5 9 7 6 1 4 2 3 
4 2 6 8 5 3 7 9 1 
7 1 3 9 2 4 8 5 6 
9 6 1 5 3 7 2 8 4 
2 8 7 4 1 9 6 3 5 
3 4 5 2 8 6 1 7 9 
*/

import java.util.*;

public class Main {
  public static void display(int[][] board){
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[0].length; j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void solveSudoku(int[][] board, int i, int j) {
    if (i == board.length){
      display(board);
      return;
    }

    int ni = 0;
    int nj = 0;

    if(j == board[0].length - 1){
      ni = i + 1;
      nj = 0;
    } else {
      ni = i;
      nj = j + 1;
    }

    if(board[i][j] != 0){
      solveSudoku(board, ni, nj);
    } else {
      for(int val = 1; val <= 9; val++){
        if(isValid(board, i, j, val)){
          board[i][j] = val;
          solveSudoku(board, ni, nj);
          board[i][j] = 0;
        }
      }
    }
  }

  public static boolean isValid(int[][] board, int x, int y, int val) {
    int n = board.length;
    for (int i = 0; i < n; i++) {
      if (board[x][i] == val) {
        return false;
      }
    }

    for (int i = 0; i < n; i++) {
      if (board[i][y] == val) {
        return false;
      }
    }

    x = x / 3 * 3;
    y = y / 3 * 3;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (board[x + i][y + j] == val) {
          return false;
        }
      }
    }

    return true;
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[][] arr = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    solveSudoku(arr, 0, 0);
  }
}
