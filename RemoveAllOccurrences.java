import java.util.Scanner;

public class Main {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		String str = scn.nextLine(); //codingblocks
		
		char ch = scn.next().charAt(0); 
		occuren(str, ch);
	}
	
	public static void occuren(String str, char ch) {
		String s1 = "";
		//int j = 0;
		char y[] = str.toCharArray();
		for(int i=0; i < str.length(); i++) {
			//char c = str.charAt(i);
			
			if (str.charAt(i) != ch) {
				s1 = s1+ y[i];
				
			}
			
		}
		System.out.println(s1);
		
		
	}

}
