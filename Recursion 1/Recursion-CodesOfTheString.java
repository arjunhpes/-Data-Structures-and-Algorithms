/*

Take as input str, a string. Assume that value of a=1, b=2, c=3, d=4, …. z=26. Write a recursive function (return type Arraylist) to print all possible codes for the string. E.g. for “1123” possible codes are aabc, kbc, alc, aaw, kw.

Input Format
Enter a number

Constraints
None

Output Format
Display all the possible codes

Sample Input
1125
Sample Output
[aabe, aay, ale, kbe, ky]

*/




import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        System.out.println(IntegerToString(str));
    }

    public static ArrayList<String> IntegerToString(String str) {
        if (str.length() <= 0) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rr1 = IntegerToString(ros);
        ArrayList<String> result = new ArrayList<>();

        char cvrt_ch = (char) (ch + 48);

        for (String val : rr1) {
            result.add(cvrt_ch + val);
        }

        if (str.length() >= 2) { 
            String ch2 = str.substring(0, 2);
            String ros2 = str.substring(2);
            if (Integer.parseInt(ch2) <= 26) {
                char cvrt_ch2 = (char) (Integer.parseInt(ch2) + 'a' - 1);
                ArrayList<String> rr2 = IntegerToString(ros2);
                for (String val : rr2) {
                    result.add(cvrt_ch2 + val);
                }
            }
        }
        return result;
    }

}
