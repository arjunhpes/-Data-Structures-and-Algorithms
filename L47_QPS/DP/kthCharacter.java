package DP;

public class kthCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a1b1c3";
		
		System.out.println(kthCh(str, 0));
	}
	
	public static String kthCh(String str, int k)
	{	int count = 0;
		StringBuilder sb = new StringBuilder(str);
		
		for( int i = 1; i < sb.length(); i+=2) {
			char ch = sb.charAt(i);
			 
		}
		return null;
	}

}
