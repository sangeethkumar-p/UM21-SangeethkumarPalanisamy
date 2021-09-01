package com.Singleton;

public class Singleton {
	private int firstInns;
	private int secondInns;
	private static Singleton sc;
	private Singleton() {}
	public static Singleton getObject() {
		if(sc==null) {
			sc=new Singleton();
		}
		return sc;
	}
	public int getFirstInns() {
		return firstInns;
	}
	public void setFirstInns(int firstInns) {
		this.firstInns += firstInns;
	}
	public int getSecondInns() {
		return secondInns;
	}
	public void setSecondInns(int secondInns) {
		this.secondInns += secondInns;
	}
	
}