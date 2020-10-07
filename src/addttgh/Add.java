package addttgh;

import java.util.Scanner;

public class Add {
  public static void main(String[] args) {
    String s1String;
    String s2String;
    int s1;
    int s2;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("S1   : ");
    s1String = sc.next();
    try {
      s1 = Integer.parseInt(s1String);
    }
    catch (NumberFormatException e) {
      System.err.println("Summand 1 wurde mit 0 belegt!");
      s1 = 0;
    }
    
    System.out.print("S2   : ");
    s2String = sc.next();
    try {
      System.err.println("Summand 2 wurde mit 0 belegt!");
      s2 = Integer.parseInt(s2String);
    }
    catch (NumberFormatException e) {
      s2 = 0;
    }
    
    System.out.println("Summe: " + (s1 + s2));
  }
}
