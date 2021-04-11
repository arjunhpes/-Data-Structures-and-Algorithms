/*
Sample Input
abbcccddddeeeeedcba
Sample Output
5
Explanation
The substring "eeeee" is of length 5 with the character 'e' only.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(maxPower(str));
    }
    
        public static int maxPower(String s) {
        
            int max=1;
             
            for(int i=1; i<s.length(); i++){
                 
                int count=1;
                while(i < s.length() && s.charAt(i-1) == s.charAt(i)){
                    count++;
                    i++;
                    max=Math.max(count, max);
                }
            }
             
            return max;
        }
}
