package com.Inheritance;
//program for car odels using inheritance
public class Car {
	String model;
	String type;
	int capacity;
	void setCarValues(String m, String t, int c) {
		model=m;
		type=t;
		capacity=c;
		
	}
	void getCarValues() {
	    System.out.println("Car Details: " +model+ "," +type+ "," +capacity);
	}
	public static void main(String[] args) {
		Vehicle c= new Vehicle();
		Car car=new Car();
		car.setCarValues("Celerio","petrol",4);
		car.setCarValues("Fiasta","Petrol",50);
		car.getCarValues();
		car.getCarValues();

}

}
