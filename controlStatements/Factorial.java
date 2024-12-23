package controlStatements;
//factorial using do while
import java.util.Scanner;
public class Factorial {
	static int fact(int num) {
		int res=1;
		do {
			res*=num;
			num--;
		}while(num>0);
			return res;
	}
public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fact(n));
	}
}
