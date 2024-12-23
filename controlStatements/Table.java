package controlStatements;
//table and sum of nums by using while
import java.util.Scanner;
public class Table {
	static void naturalNumbers(int num) {
		int i=1,sum=0;
	/*while(i<=10) {
		System.out.println(num+"*"+i+"="+num*i);
		i++;
	}
}
public static void main(String args[]) {
	System.out.println("Enter number for printing the table:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	printTable(n);*/
		while(i<=10)
		{
			sum=sum+i;
			i++;
		}System.out.println(sum);
		}
		public static void main(String args[]) {
	    	System.out.println("Enter n value:");
	    	Scanner sc=new Scanner(System.in);
	    	int n=sc.nextInt();
	    	naturalNumbers(n);
    }
    	
}