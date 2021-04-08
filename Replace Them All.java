import java.util.*;
public class Main {
    public static void main(String args[]) {
       
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long ans = 0;
        
        if (n == 0){
            System.out.println(5);
        }
        else{
            
            long mult = 1;
            while(n>0){
            long rem = n % 10;
            if (rem == 0){
                rem = 5;
            }
            ans = rem * mult + ans;
            mult = mult * 10;
            n = n/10;
            }
            System.out.println(ans);
        }
        
    }
}
