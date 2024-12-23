package controlStatements;
//while
import java.util.Scanner;
public class rectangularTriangle {
	static void triangle(int num) {
	int i = 1; 
    while (i <= num) {
        int j = i; 
        while (j >= 1) {
            System.out.print("*");
            j--; 
        }
        System.out.println(" "); 
        i++;
    }
	}
    public static void main(String[] args) {
       
        System.out.println("Enter the number of rows for the triangle: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        triangle(num);
    }
}
