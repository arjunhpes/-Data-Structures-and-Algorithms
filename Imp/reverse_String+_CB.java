/*
Sample Input
3
complex is fun
programming is an art
step on no step
Sample Output
fun is complex
art an is programming
step no on step
*/


import java.time.Year;
import java.util.Scanner;

public class Main {
    public static String WordsInReverse(String str1) {
        StringBuilder sb = new StringBuilder(str1);
        String StrRev = sb.reverse().toString();
      
        String[] words = StrRev.split(" ");
        StringBuilder reverse = new StringBuilder();
        for (String tmp: words) {
         sb = new StringBuilder(tmp);
         reverse.append(sb.reverse() + " ");
        }
        reverse.deleteCharAt(reverse.length() - 1);
        return reverse.toString();
       }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t >= 0) {
            String s1 = scn.nextLine();
            
            System.out.println(WordsInReverse(s1));
            t--;
        }

    }
}
