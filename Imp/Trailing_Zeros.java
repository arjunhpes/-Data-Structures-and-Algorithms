package Imp;

public class Trailing_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int count = 0;
		for (int i = 5; n / i >= 1; i *= 5) {
			count += n / i;// 100/5 , 100/25, 100/125
		}
		System.out.println(count);

	}

}