/*
Given a string containing alphanumeric characters, calculate sum of all numbers present in the string.

Input Format
First line contains the number of testcases.

For each testcase, input a string

Constraints
1 <= T <= 100
1 <= Length of string <= 10000

Output Format
Integer output for each testcase in a new line

Sample Input
1
1abc23
Sample Output
24
Explanation
For 1abc23,
1 + 23 = 24
*/


package Array;

import java.util.Scanner;

public class sumOfNumberInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            Long sum = 0L;
            Long n = 0L;
            int i = 0;
            Long d = 0L;

            while (i < s.length()) {
                char c = s.charAt(i);
                if (c >= 48 && c <= 57) {
                    d = (long) (c - 48);
                    n = n * 10 + d;
                }
                if (c < 48 || c > 57) {
                    sum += n;
                    n = (long) 0;
                }
                i++;
            }
            sum += n;
            System.out.println(sum);
        }
    }
}
