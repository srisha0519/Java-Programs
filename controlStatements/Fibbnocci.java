package controlStatements;
//fibonaccis  series using while
public class Fibbnocci {
	static void series(int limit) {
		int num1=0,num2=1,i=2;
		int sum=0;
		System.out.print(num1+" "+num2);
		while(i<limit) {
			sum=num1+num2;
			System.out.print(" "+sum);
			num1=num2;
			num2=sum;
			i++;
		}
	}
	public static void main(String args[]) {
		series(10);
	}
}
