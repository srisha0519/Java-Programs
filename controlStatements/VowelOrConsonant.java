package controlStatements;
//char by using ifelse
import java.util.Scanner;
class Alphabet{ 

	 
void symbol(char y) {
if (y == 'a' || y == 'e' || y == 'i' || y == 'o'|| y == 'u' || y=='A'||y=='E'||y=='I'||y=='O'||y=='U') 
System.out.println("It is a Vowel"); 
else if(y>='a'&& y<='z'&& y>='A'&& y<='Z')
System.out.println("It is a Consonant"); 
else 
System.out.println("special character");
} 
}

public class VowelOrConsonant{ 
public static  void main(String args[]) 
{ 
System.out.println("enter a Character");
Scanner sc=new Scanner(System.in);
char alphabet=sc.next().charAt(0);
    Alphabet a1=new Alphabet();
    a1.symbol(alphabet);
    
} 
}
