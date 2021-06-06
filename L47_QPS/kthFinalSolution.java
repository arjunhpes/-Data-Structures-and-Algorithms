package QPS;

public class kthS {

	public static void main(String[] args) {
		String str = "a3b2";
		int k = 7;

		System.out.println(solve(str, k));
	}

	public static String solve(String str, int k) {

		int i;
		int j;

		int n = str.length();
		int len;
		int num;
		int freq;
		int neg = 0;
		String ans = "";
		i = 0;
		while (i < n) {
			j = i;
			len = 0;
			freq = 0;
			while (j < n && Character.isLetter(str.charAt(j))) {
				j++;
				len++;
			}
			while (j < n && Character.isDigit(str.charAt(j))) {
				freq = freq * 10 + (str.charAt(j) - '0');
				j++;
			}

			num = freq * len;
			if (k > num) {
				k -= num;
				i = j;
			}
			else {
				k--;
				k %= len;
//				ans.push_back();
				ans += str.charAt(i + k);
				
				if ( freq < k) {
					neg = freq;
					return "-1";
				}
				return ans;
			}
		}
//		ans.push_back();
		ans += str.charAt(k - 1);
		if ( neg < k) {
			return "-1";
		}
		
		return ans;

	}

}
