package Array;

public class sumOfNumbeInAString {

	static int findSum(String str)
	{
		String temp = "0";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch))
				temp += ch;
			else {
				sum += Integer.parseInt(temp);

				temp = "0";
			}
		}
		return sum + Integer.parseInt(temp);
	}
	public static void main(String[] args)
	{
		String str = "1abc23a68";
		System.out.println(findSum(str));
	}
}
