import java.util.*;
public class Main {
    public static int fib(int n)
    {
        if (n <= 1) {
            return n;
        }
 
        return fib(n - 1) + fib(n - 2);
    }
 
    public static void main(String[] args)
    {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fib(n));
    }
}
