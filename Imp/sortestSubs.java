package Imp;

public class sortestSubs {
	

	static String searchSubString(String str, String pat) {
		final int charsNumber = 256;
		int stringLength = str.length();
		int patternLength = pat.length();
		if (stringLength < patternLength) {
			// System.out.println("No such window exists");
			return "";
		}

		int has_Pattern[] = new int[charsNumber];
		int has_String[] = new int[charsNumber];

		for (int i = 0; i < patternLength; i++)
			has_Pattern[pat.charAt(i)]++;

		int start = 0, si = -1, Min = Integer.MAX_VALUE;

		int count = 0;
		for (int j = 0; j < stringLength; j++) {

			has_String[str.charAt(j)]++;
			if (has_String[str.charAt(j)] <= has_Pattern[str.charAt(j)])
				count++;

			if (count == patternLength) {
				while (has_String[str.charAt(start)] > has_Pattern[str.charAt(start)]
						|| has_Pattern[str.charAt(start)] == 0) {

					if (has_String[str.charAt(start)] > has_Pattern[str.charAt(start)])
						has_String[str.charAt(start)]--;
					start++;
				}

				int lengthOfTheString = j - start + 1;
				if (Min > lengthOfTheString) {
					Min = lengthOfTheString;
					si = start;
				}
			}
		}

		if (si == -1) {
			// System.out.println("No such window exists");
			return "";
		}
		return str.substring(si, si + Min);
	}

	// Driver Method
	public static void main(String[] args) {
		String str = "My Name is Fran";
		String pat = "rim";

		System.out.print("Smallest window is :\n " + searchSubString(str, pat));
	}
}
