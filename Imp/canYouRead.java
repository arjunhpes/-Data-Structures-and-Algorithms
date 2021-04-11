
/*
Sample Input
IAmACompetitiveProgrammer
Sample Output
I
Am
A
Competitive
Programmer
*/
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String str = scanner.next();
        int i;
        int start = 0;
        int end = 0;
        boolean flag = false;
        for (i=0; i<str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                if (flag) {
                    end = i;
                    System.out.println(str.substring(start, end));
                    start = i;
                } else {
                    start = i;
                    flag = true;
                }
            }
        }
        System.out.println(str.substring(start));
    }
}
