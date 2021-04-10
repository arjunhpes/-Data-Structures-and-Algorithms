/*
1. You are given a number n, representing the number of opening brackets ( and closing brackets )
2. You are required to find the number of ways in which you can arrange the brackets if the closing brackets should never exceed opening brackets
e.g.
for 1, answer is 1 -> ()
for 2, answer is 2 -> ()(), (())
for 3, asnwer is 5 -> ()()(), () (()), (())(), (()()), ((()))
*/

import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      long[] dp = new long[n + 1];
      dp[0] = 1;

      for(int i = 1; i < dp.length; i++){
         for(int j = 0; j < i; j++){
            dp[i] += dp[j] * dp[i - 1 - j];
         }
      }

      System.out.println(dp[n]);
   }

}
