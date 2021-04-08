
/*
Take as input str, a string. We are concerned with all the possible ascii-subsequences of str. E.g. “ab” has following ascii-subsequences “”, “b”, “98”, “a”, “ab”, “a98”, “97”, “97b”, “9798”

a. Write a recursive function which returns the count of ascii-subsequences for a given string. Print the value returned.

b. Write a recursive function which prints all possible ascii-subsequences for a given string (void is the return type for function).

Input Format
Enter the string

Constraints
None

Output Format
Display the number of ASCII-subsequences and display all the ASCII- subsequences

Sample Input
ab
Sample Output
 b 98 a ab a98 97 97b 9798
9
*/

import java.util.*;

public class Main {
    static int count = 0;
	public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
		printSSWAscii(str, "");
        System.out.println();
        System.out.println(count);
	}

	public static void printSSWAscii(String str, String result) {
        
		if (str.length() == 0) {
			System.out.print(result);
            System.out.print(" ");
            count++;

			return;
		}

		char c = str.charAt(0);
		String ros = str.substring(1);
        
		printSSWAscii(ros, result);

		printSSWAscii(ros, result + c);
		
		printSSWAscii(ros, result + (int)c);
        
	}
}