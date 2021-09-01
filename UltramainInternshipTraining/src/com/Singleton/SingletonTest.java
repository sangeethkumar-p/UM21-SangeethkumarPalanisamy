package com.Singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj1=Singleton.getObject();
		Singleton obj2=Singleton.getObject();
		obj1.setFirstInns(100);
		obj2.setFirstInns(200);
		System.out.println(obj1.getFirstInns());

	}

}
