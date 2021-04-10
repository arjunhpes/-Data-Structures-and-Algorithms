package Imp;

import java.util.Scanner;
public class nthPrime {
  public static void main(String[] args) {
    int num=1, count=0, i;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to find the nth prime number: ");
    int n = sc.nextInt(); 
    
    // Write from here for Function 
    while (count < n){
      num=num+1;
      for (i = 2; i <= num; i++){
        if (num % i == 0) {
          break;
        }
      }
      if ( i == num){
        count = count+1;
      }
    }
    System.out.println(num);
  }
}