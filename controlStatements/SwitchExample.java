package controlStatements;

//switch example for number and character
import java.util.Scanner;
public class SwitchExample {
	public static void main(String[] args) {
		/*System.out.println("enter nuum between 1 to 7");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		switch(num) {
		case 1:System.out.println("Sunday");
		break;
		case 2:System.out.println("Monday");
		break;
		case 3:System.out.println("Tuesday");
		break;
		case 4:System.out.println("Wednesday");
		break;
		case 5:System.out.println("Thursday");
		break;
		case 6:System.out.println("Friday");
		break;
		case 7:System.out.println("Saturday");
		break;
		default:System.out.println("invalid input");
		break;*/
		System.out.println("enter a char");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		switch(ch) {
		case 'a':System.out.println("junnu");
		break;
		case 'b':System.out.println("jannu");
		break;
		case 'c':System.out.println("Chitti");
		break;
		case 'd':System.out.println("Nikki");
		break;
		default:System.out.println("invalid");
		break;
		}
	}

}
