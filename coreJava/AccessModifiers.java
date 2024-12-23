package coreJava;

public class AccessModifiers {
	public int num1;
	private int num2;
	protected int num3;
	int num4;
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
	this.num2 = num2;
	}
	public int getNum3() {
	return num3;
	}
	public int getNum4() {
	return num4;
	}
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	void setNum4(int num4) {
		this.num4 = num4;
	}
}