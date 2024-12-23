package com.Inheritance;

public class Vehicle {
	int wheels;
	int speed;
	String name;
	void setValues(int w,int s,String n) {
		wheels=w;
		speed=s;
		name=n;
	}
	void getValues() {
		System.out.println("Vehicles details;"+wheels+","+speed+","+name);
	}

}
