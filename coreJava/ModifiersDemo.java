
package coreJava;
public class ModifiersDemo {
	public static void main(String args[]){

	AccessModifiers access=new AccessModifiers();
	access.num1=30;
	access.num3=40;
	access.num4=50;
	access.setNum2(10);
	System.out.println("public num="+access.num1);
	System.out.println("private num="+access.getNum2());
	System.out.println("protected num="+access.num3);
	System.out.println("default num="+access.num4);
	}
	}

