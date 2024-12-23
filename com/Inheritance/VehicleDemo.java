package com.Inheritance;
//inheritance using constructor
public class VehicleDemo {
	//default constructor
	int wheel;
	int speed;
	String name;
	VehicleDemo(){
		System.out.println("Default constructor");
	}
	VehicleDemo(int wheel,int speed,String name){
		
	}
	//parameterized constructor
	void setValues(int w,int s,String n) {
		this.wheel=w;
		this.speed=s;
		this.name=n;
	}
	void getValues() {
		System.out.println("Vehicles details:"+wheel+","+speed+","+name);
	}
	public static void main(String[] args) {
		//VehicleDemo v=new VehicleDemo();
		VehicleDemo v1=new VehicleDemo();
		v1.setValues(2, 100, "Activa");
		//v.getValues();
		v1.getValues();

	}

}
