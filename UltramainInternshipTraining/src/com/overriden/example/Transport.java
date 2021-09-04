package com.overriden.example;

public class Transport {

	public static void main(String[] args) {
		Car mc=new MaruthiCar();
		mc.horn();
		mc.breakSystem();
		mc.steering();
	}
}
class Vehicle {
	public void steering() {
		System.out.println("Vehicle has steering..");
	}
	
}
class Car extends Vehicle{
	public void horn() {
		System.out.println("Car has horn ..");
	}
	public void breakSystem() {
		System.out.println("In car ,there is a breaking system..");
	}
}
class MaruthiCar extends Car{
	public void horn() {
		System.out.println("MaruthiCar having modern horn system..");
		super.horn();
	}
	public void music() {
		System.out.println("In Maruthi car ,music system feature was available.. ");
	}
}
class Honda extends Car{
	public void music() {
		System.out.println("Honda music is ultimate...");
	}
}
