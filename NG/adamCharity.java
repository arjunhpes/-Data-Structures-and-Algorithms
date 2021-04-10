package Array;

public class adamCharity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println(totalCharity(n));
	}
	public static int totalCharity(int n) {
		
		return (n*(n+1)*(2*n+1))/6;
	}

}
