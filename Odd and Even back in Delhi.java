import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        if(t<=1000) {
            for(int i =1;i<=t;i++)
            {
                int n = s.nextInt();
                if(n>=0 && n<=1000000000)
                {
                    int sodd =0;
                    int seven =0;
                    while(n !=0) {
                        int r = n%10;
                        if(r%2==0)
                        {
                            seven = seven + r;

                        }
                        else
                        {
                            sodd = sodd +r;
                        }
                        n = n/10;

                    }
                    if(seven %4 ==0 || sodd %3 ==0)
                    {
                        System.out.println("Yes");
                    }
                    else
                    {
                        System.out.println("No");
                    }
                }
            }
        }
    }
}