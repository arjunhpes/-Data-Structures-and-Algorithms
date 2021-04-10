/*
 hello
 holle
*/


import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String words[] = new String[n];
        // int i,j;
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (words[i + 1].contains(words[i])) {
                String temp = words[i];
                words[i] = words[i + 1];
                words[i + 1] = temp;
            }
        }
        for (String str : words) {
            System.out.println(str);
        }
    }
}
