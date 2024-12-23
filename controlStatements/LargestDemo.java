package controlStatements;
//greatest among 3 using ifelse
import java.util.Scanner;
class Largest{
void largest(int a, int b, int c) {
if(a>b && a>c)
 System.out.println("A is Largest Number.");
else if(b>c && b>a) 
System.out.println("B is Largest Number.");
else if(c>a && c>b) 
 System.out.println("C is Largest Number.");
else
System.out.println("NULL");
}
}
public class LargestDemo {
 public static void main(String args[]) {
  System.out.println("Enter a, b and c :");
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b=sc.nextInt();
  int c= sc.nextInt();
  Largest l = new Largest();
  l.largest(a,b,c);
  }
}