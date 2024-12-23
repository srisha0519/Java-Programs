package controlStatements;
//result,total and grade by using switch
import java.util.Scanner;

public class studentResult {
	public static void main(String[] args) {
	System.out.println("enter 5 sub marks");
	Scanner sc=new Scanner(System.in);
	int m1,m2,m3,m4,m5;
	m1=sc.nextInt();
	m2=sc.nextInt();
	m3=sc.nextInt();
	m4=sc.nextInt();
	m5=sc.nextInt();
	if(m1>=35 && m2>=35 && m3>=35 && m4>=35 && m5>=35)
		{
		int total=m1+m2+m3+m4+m5;
		double avg=total/5;
		char ch;
		if(avg>=80) {
			ch='a';}
		else if(avg>=60) {
			ch='b';}
		else 
			ch='c';
		switch(ch) {
		case 'a':
			System.out.println("student result:\nTotal="+total+"\nAvg="+avg+"\nGrade=A");
			/*System.out.println("Grade A");*/
		break;
		case 'b':
			System.out.println("student result:\nTotal="+total+"\nAvg="+avg+"\nGrade=B");
			/*System.out.println("Grade B");*/
		break;
		case 'c':
			System.out.println("student result:\nTotal="+total+"\nAvg="+avg+"\nGrade=C");
			/*System.out.println("Grade C");*/
		break;
		default:System.out.println("Result not Found");
		break;
		}
		}
	else
		System.out.println("fail");
 }
}