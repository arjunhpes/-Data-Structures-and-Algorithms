package Array;

public class possibleArrangment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println(Arrangment(n));
	}

	public static int Arrangment(int n) {
		// Base cases
		if (n == 1)
			return 0;
		if (n == 2)
			return 1;

		// Arrangment(n) = (n-1)[Arrangment(n-1) + der(n-2)]
		return (n - 1) * (Arrangment(n - 1) + Arrangment(n - 2));
	}

}
