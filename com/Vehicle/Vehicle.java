package com.Vehicle;
class VehicleDemo {
 int speed;
 int capacity;
 String model;
 int year;
 void displayInfo() {
     System.out.println(speed+","+capacity+","+model+","+year);
 }
}
//Main class
public class Vehicle {
 public static void main(String[] args) {
     VehicleDemo car=new VehicleDemo();
     car.speed=250;
     car.capacity=5;
     car.model="BMW";
     car.year=2019;
     car.displayInfo();
     VehicleDemo car1= new VehicleDemo();
     car1.speed=250;
     car1.capacity=4;
     car1.model="DMW";
     car1.year=2019;
     car1.displayInfo();
 }
}
	