package com.typecasting;

/**
 * @author Sangeethkumar
 * 
 *In Display class -->object casting is takesplace
 */
public class Main {

	public static void main(String[] args) {
		Son son =new Son();
		
		Daughter daughter=new Daughter();
		Display display=new Display();
		
		display.displayKidsDetails(son);
		display.displayKidsDetails(daughter);
	}

}
class Grandfather{
	public void sleep() {
		System.out.println("A decade ago ,grandfather would sleep more the 7 hrs");
		}
}
class Dad extends Grandfather{
	public void eat() {
		System.out.println("Dad asks to eat only veg food");
	}
	public void earnMoney() {
		System.out.println("Dad earns money by doing business");
	}
	
}
class Son extends Dad{
	public void eat() {
		System.out.println("Son like non-veg than veg");
	}
	public void swim() {
		System.out.println("Weekly once son will going to swimming pool");
	}
	
}
class Daughter extends Dad{
	public void sing() {
		System.out.println("Daughter always impress her dad by singing");
	}
	public void eat() {
		System.out.println("Daughter eats icecream...");
	}
}

class Display{
	public void displayKidsDetails(Dad mydad) {
		
		if(mydad instanceof Son) {
			Son myson=(Son)mydad;
			mydad.earnMoney();
			mydad.eat();
			mydad.sleep();
			//((Son)mydad).swim();
			myson.swim();
			System.out.println("------------------------------------------");
		}
		
		if(mydad instanceof Daughter) {
			Daughter mydaughter=(Daughter)mydad;
			mydad.earnMoney();
			mydad.eat();
			mydad.sleep();
			mydaughter.sing();
		}
		
	}
}