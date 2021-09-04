package com.abstract1.exercise;

abstract class Grandfather {
	public abstract void play();
	public void eat() {
		System.out.println("Eat meals");
	}
}
abstract class Father extends Grandfather{
	@Override
	public void play() {
		System.out.println("play cricket");
	}
	public abstract void swim();
}

class Son extends Father{
	public void play() {
		System.out.println("Play VolleyBall");
	}
	public void sing() {
		System.out.println("sing a song for me");
	}
	public void swim() {
		System.out.println("swimming is one of the exercise");
	}
}

