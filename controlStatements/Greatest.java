package controlStatements;
//greatest among 2 using ifelse
 class Greater {
	void Greaternum(int a, int b){
		if(a>b)
		System.out.println("a is greatest");
		else
		System.out.println("b is greatest");
		}
		}
		public class Greatest{
		public static void main(String args[]){
		Greater g1=new Greater();
		g1.Greaternum(6,9);
		}
}
