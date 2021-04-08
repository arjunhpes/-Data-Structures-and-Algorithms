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
