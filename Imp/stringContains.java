package Imp;

public class stringContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		String k = "ab";
		System.out.println(strContains(str, k)); 
	}
	
	public static String strContains(String str, String k) {
		
		if (str.contains(k)) {
			return "Yes";
		}
		
		return "Not";
	}

}
