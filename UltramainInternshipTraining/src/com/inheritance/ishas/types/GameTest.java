package com.inheritance.ishas.types;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileGame mg=new MobileGame();
		mg.displayAll();
	}

}
class Sports{
	public void sport() {
		System.out.println("In sports,there are lot of games available..");
	}
	
}
class Game extends Sports{
	public void game() {
	System.out.println("Games are help make people to fresh and healthy..");
	}
	public void cricket() {
		System.out.println("Cricket is the only game having huge fan base");
	}
}
class MobileGame extends Game{
	public void mobileGame() {
		System.out.println("Animated version of a real life game is mobilegame");
	}
	public void trent() {
		System.out.println("Childrens are mostly addicted of pubg mobile game");
	}
    public int display() {
		return new Cricket().playerCount("cricket");
	}
	public void displayAll() {
		this.mobileGame();
		this.trent();
		super.cricket();
		super.game();
		System.out.println("count : "+display());
	}	
}
class Cricket{
	public int  playerCount(String str) {
		if(str.equals("cricket")) {
			return 11;
		}
		return 0;
	}
}
