/*
Using a helper stick (peg), shift all rings from peg A to peg B using peg C. All rings are initally placed in ascending order, smallest being on top.

No bigger ring can be placed over a smaller ring.

a. Write a recursive function which prints the steps required to solve the tower of Hanoi problem for N discs.

b. Write a recursive function which returns number of steps required to solve the tower of Hanoi problem for N discs.

Let T1 be the Source Tower, T2 be the Destination Tower and T3 be the Auxillary Tower.

Input Format
Enter the number of discs

Constraints
None

Output Format
Display the steps required to solve the tower and also print the total number of steps required

Sample Input
2
Sample Output
Move 1th disc from T1 to T3
Move 2th disc from T1 to T2
Move 1th disc from T3 to T2
3
*/


import java.util.*;
public class Main {
    static int tt=0;
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) 
    { 
        if (n == 1) 
        { 
            System.out.println("Move 1th disc from T" +  from_rod + " to T" + to_rod);
            tt=tt+1; 
            return; 
        } 
       towerOfHanoi(n-1, from_rod, aux_rod, to_rod); 
        //towerOfHanoi(n-1, aux_rod, to_rod, from_rod); 
        System.out.println("Move "+n+"th disc from T" +  from_rod + " to T" + to_rod);
        tt=tt+1; 
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod); 
        //towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
         //System.out.println("Move 2th disc from T" +  from_rod + " to T" + to_rod); 
    } 
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        char a='1',b='2',c='3';
        if(t>0)
        {
            towerOfHanoi(t, a, b, c); 
            System.out.print(tt);
        }
    }
}