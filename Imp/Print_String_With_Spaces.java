package Imp;
/*
 * 
Given a string you need to print all possible strings that can be
 made by placing spaces (zero or one) in between them. The output
  should be printed in sorted increasing order of strings
Example 1:
Input:
S = "ABC"
Output: (A B C)(A BC)(AB C)(ABC)
Explanation:
ABC
AB C
A BC
A B C
These are the possible combination of "ABC".
 
Example 2:
Input:
S = "AB"
Output: (A B)(AB)
 */
public class Print_String_With_Spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC";
		print_String(str.substring(1), ""+str.charAt(0));

	}
	public static void print_String(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		print_String(ques.substring(1), ans+ques.charAt(0));// without space
		print_String(ques.substring(1), ans+" "+ques.charAt(0));// with space
	}

}