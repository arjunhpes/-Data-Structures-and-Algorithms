import java.util.*;
public class Main {
     public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1;
        int nsp = n-1;
        int row=1;
        int value =1;
        while(row<=n){
            value = row;
            //Number 
            for(int cst=1; cst<=nst; cst++)
                if (cst == 1 || cst == nst )
                {
                    System.out.print(value+"\t");
                }
                    
                else
                    {
                        System.out.print(0 + "\t");
                    }

                for(int csp=1; csp<=nsp;csp++){
                    System.out.print(" ");
                }

                //Update
                System.out.println();

                nst++;
                nsp--;
                
                row++;

        }
    }
}
