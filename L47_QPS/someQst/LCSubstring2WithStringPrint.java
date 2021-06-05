package someQst;

public class LCSubstring2WithStringPrint {

	public static void main(String[] args) {
	
		String s1 = "GEENVDDZKGNVDHZLHNC";
		String s2 = "ZDMOVZNDJKNJNVIXVXJXHFVJXFNIIJKDN";
		
		System.out.println(LCSubs(s1, s2));
	}
	
	public static String LCSubs(String s1, String s2) {
		
		int[][] strg = new int[s1.length()+1][s2.length()+1];
		
		int endingIndex = s1.length();
		
		int max = 0;
		
		for ( int i = 1; i < strg.length; i++) {
			for( int j = 1; j < strg[0].length; j++) {
				
				char ch1 = s1.charAt(i - 1);
				char ch2 = s2.charAt(j - 1);
				
				if ( ch1 != ch2)
					strg[i][j] = 0;
				else 
					strg[i][j] = strg[i-1][j-1] + 1;
					
				if (strg[i][j] > max) {
					max = strg[i][j];
					endingIndex =  i;
				}
			}	
		}
		return s1.substring(endingIndex - max, endingIndex);
	}
}



















