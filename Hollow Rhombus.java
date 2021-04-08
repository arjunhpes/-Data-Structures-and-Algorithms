import java.util.*;
public class Main {
    static void hollowRhombus(int rows) 
    { 
        int i, j; 
        for (i=1; i<=rows; i++) 
        { 
            for (j=1; j<=rows - i; j++) 
                System.out.print(" "); 
            if (i==1 || i==rows) 
                for (j=1; j<=rows; j++) 
                    System.out.print("*"); 
            else
                for (j=1; j<=rows; j++) 
                    if (j==1 || j==rows) 
                        System.out.print("*"); 
                    else
                        System.out.print(" "); 
            System.out.println(); 
        } 
    } 
   
    static void printPattern(int rows) 
    { 
        hollowRhombus(rows); 
    } 
    public static void main (String[] args)  
    { 
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        printPattern (rows); 
    } 
} 