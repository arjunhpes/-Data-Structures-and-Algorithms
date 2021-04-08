import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		long t = scn.nextLong();

		while (t > 0) {
			long AyushLimit = scn.nextInt();
			long HarshitLimit = scn.nextInt();

			long AyushPhones = 0;
			long HarshitPhones = 0;

			long nextBuyingNo = 1;

			while (true) {

				AyushPhones += nextBuyingNo;
				nextBuyingNo++;
				HarshitPhones += nextBuyingNo;
				nextBuyingNo++;

				if (AyushPhones > AyushLimit) {
					System.out.println("Harshit");
					break;
				}

				if (HarshitPhones > HarshitLimit) {
					System.out.println("Aayush");
					break;
				}

			}

		}

		t--;
	}

}