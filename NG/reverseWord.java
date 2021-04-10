package Array;

//import jdk.internal.org.jline.utilsDisplay;

public class reverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Nagarro";
		String reversed = reverseString(str);
		System.out.println("The reversed string is: " + reversed);  //orragaN ot emocleW

	}

	public static String reverseString(String s) {
		if (s.isEmpty()) // checks the string if empty
			return s;
		return reverseString(s.substring(1)) + s.charAt(0); // recursively called function
	}
}
