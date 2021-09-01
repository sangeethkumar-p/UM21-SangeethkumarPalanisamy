package com.ultramain.polymorphism;

import java.util.Scanner;

public class Polymorphism {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		Square sq=new Square(a,b,c);
		sq.add();
		sq.square();
		
		
	}

}
