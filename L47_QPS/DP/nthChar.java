package DP;

public class nthChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a1b1c3";
		int place = 5;
//		char charr[]  = str.toCharArray();
//		System.out.println(encodedChar(charr, place));
		
		System.out.println(helper(str, place));

	}
	public static String helper(String str, int k) {
		
		char charr[]  = str.toCharArray();
		
		char ch = encodedChar(charr, k);
		
		if ( freq < k)
			return "-1";
		
		return null;
	}
	static int freq;
	public static char encodedChar(char[] str, int k)
	{
	    int i, j;
	 
	    int n = str.length;
	 
	    // To store length of substring
	    int len;
	 
	    // To store length of substring when
	    // it is repeated
	    int num;
	 
	    // To store frequency of substring
	    
	 
	    i = 0;
	 
	    while (i < n)
	    {
	        j = i;
	        len = 0;
	        freq = 0;
	 
	        // Find length of substring by
	        // traversing the string until
	        // no digit is found.
	        while (j < n && Character.isAlphabetic(str[j]))
	        {
	            j++;
	            len++;
	        }
	 
	        // Find frequency of preceding substring.
	        while (j < n && Character.isDigit(str[j]))
	        {
	            freq = freq * 10 + (str[j] - '0');
	            j++;
	        }
	 
	        // Find length of substring when
	        // it is repeated.
	        num = freq * len;
	 
	        // If length of repeated substring is less than
	        // k then required character is present in next
	        // substring. Subtract length of repeated
	        // substring from k to keep account of number of
	        // characters required to be visited.
	        if (k > num)
	        {
	            k -= num;
	            i = j;
	        }
	 
	        // If length of repeated substring is
	        // more or equal to k then required
	        // character lies in current substring.
	        else
	        {
	            k--;
	            k %= len;
	            return str[i + k];
	        }
//	        System.out.println(freq);
	    }
	    
	 
	    return str[k - 1];
	}
	 
}
