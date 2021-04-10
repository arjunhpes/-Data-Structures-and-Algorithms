package Array;

public class electrostaticNagarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[] = {4,8,45};
		char a2[] = {'P', 'P', 'P'};
		int a3 = 3;
		System.out.println(eField(a1, a2, a3));
	}
	public static int eField(int a1[], char a2[], int a3) {
		for(int i = 0; i < a3; i++) {
			if(a2[i] =='N') {
				a1[i] = -1* a1[i];
			}
			
		}
		int sum = 0;
		for(int i = 0; i < a3; i++) {
			sum = sum + a1[i];
		}
		return sum * 100;
	}

}
