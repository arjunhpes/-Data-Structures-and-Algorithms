/*
Sample Input
1
1538023
Sample Output
4
*/


import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        
        for (int i = 1; i <= tc; i++) {
            String str = sc.nextLine();
            subString(str);
        }
    }
    public static void subString(String str) {
        int lc = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j<=str.length(); j++) {
                String ss = str.substring(i, j);
                if (ss.length() % 2 == 0) {
                    lc = Math.max(lc, longestLength(ss));
                }
            }
        }
        System.out.println(lc);
    }
    public static int longestLength(String str) {
        int longestCount = 0;
        int i = 0;
        int j = str.length() - 1;
        int len = str.length() / 2;
        int leftSum = 0;
        int rightSum = 0;
        while (i < len && j >= len) {
            int num1 = str.charAt(i) - '0';
            int num2 = str.charAt(j) - '0';
            leftSum += num1;
            rightSum += num2;
            i++;
            j--;
        }
        if (leftSum == rightSum) {
            longestCount = str.length();
        }
        return longestCount;
    }
}
