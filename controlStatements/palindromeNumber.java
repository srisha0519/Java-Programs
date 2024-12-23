package controlStatements;
//palindrome using 
import java.util.Scanner;
public class palindromeNumber {
	static void palindrome(int num) {
	int rev=0,rem=0,res=0;
	int temp=num;
	while(num>0)
	{
		rem=num%10;
		res=res*10+rem;
		num=num/10;
	}
	if(temp==res) 
		System.out.println("palindrome");
	else
		System.out.println("not palindrome");
	}
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		palindrome(n);
	}
}
