package controlStatements;
//result using ifelse ladder
import java.util.Scanner;
 class ScannerGrade {
	public void result(int percent) {
	if(percent>=80) 
		{
		System.out.println("Grade A");
		}
	else if(percent>=65) 
		{
		System.out.println("Grade B");
		}
	else if(percent>=50) 
		{
		System.out.println("Grade C");
		}
	else if(percent>=40) 
		{
		System.out.println("Grade D");
		}
	else 
		{
		System.out.println("Fail");
		}
	}
}
 public class IfElseLadder{
	 public static void main(String args[]){
		 System.out.println("enter percent");
		 Scanner sc=new Scanner(System.in);
		 int percentage=sc.nextInt();
		 ScannerGrade pg=new ScannerGrade();
		 pg.result(percentage);
	 }
	 
 }
