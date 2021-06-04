package DP;

public class GFGfrequencyString
{
	
	static int MAX = 26;
	
	public static void compressString(String s, int n)
	{
		int freq[] = new int[MAX] ;
	
		for (int i = 0; i < n; i++)
		{
			freq[s.charAt(i) - 'a']++;
		}
	
		for (int i = 0; i < MAX; i++)
		{
			if (freq[i] == 0)
				continue;
	
			System.out.print((char)(i + 'a') +""+ freq[i]);
		}
	}
	
	public static void main (String[] args)
	{
		String s = "geeksforgeeks";
		int n = s.length();
	
		compressString(s, n);
	}
}


