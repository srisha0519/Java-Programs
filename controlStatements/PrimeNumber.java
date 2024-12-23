package controlStatements;
//prime numbers for a range of numbers using for loop 
public class PrimeNumber {
	static void isPrime(int range) {
		for(int n=2;n<=range;n++) {
			int i;
			boolean b=false;
			for(i=2;i<=n/2;i++) {
				if(n%i==0) {
					b=true;
					break;
				}
			}
			if(!b)
				System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		isPrime(50);
	}
	}
		/*int limit=50;
		for(int i=1;i<=limit;i++) {
			boolean b=true;
			if(i<=1) {
				continue;
		}
			for(int j=2;j<i;j++) {
				
				if(i%j==0) {
				 b=false;
					break;
				}
			}
		if(b)
			System.out.println(i);
	}*/
