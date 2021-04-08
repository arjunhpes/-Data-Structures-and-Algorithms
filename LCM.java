import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
      int  lcm;
      lcm = (n1 > n2) ? n1 : n2;

      while(true) {
        if( lcm % n1 == 0 && lcm % n2 == 0 ) {
          System.out.println(lcm);
          break;
        }
        ++lcm;
      }
      scn.close();
    }
}