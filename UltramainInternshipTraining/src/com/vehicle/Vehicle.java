package com.vehicle;

class Vehicle {
	public Vehicle() {
		System.out.println("Vehicle helps people to move one place to another quickly");
	}

}
class Car extends Vehicle{
	public Car() {
		//this("car");
		System.out.println("Car can carry 5 to 6 people inside!!");
	}
	public Car(String msg) {
		this();
		System.out.println(msg+" can have 5 to 6 seats ");
	}	
}

class NanoCar extends Car{
	public NanoCar() {
	super("Car");
	System.out.println("Nano is a small car & available for low cost");
	}
}
