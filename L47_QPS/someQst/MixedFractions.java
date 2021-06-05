package someQst;

import java.util.ArrayList;
import java.util.Scanner;

public class MixedFractions {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String line = reader.nextLine();

		ArrayList<String> answers = new ArrayList<String>();

		while (!(line.trim().equals("0 0"))) {
			String[] fraction = line.split(" ");
			int num = Integer.parseInt(fraction[0]); 
			int den = Integer.parseInt(fraction[1]); 

			int whole = num / den;
			num = num % den;

			answers.add("" + whole + " " + num + " / " + den);
			line = reader.nextLine();
		} 

		for (int i = 0; i < answers.size(); i++) {
			System.out.println(answers.get(i));
		} 
	} 
}