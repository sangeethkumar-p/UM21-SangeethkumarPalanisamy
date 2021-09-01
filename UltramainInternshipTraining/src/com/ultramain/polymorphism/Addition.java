package com.ultramain.polymorphism;

class Addition {
	public int a;
	public int b;
	public Addition(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void add() {
		int c=a+b;
		System.out.println("Addition of a and b is :"+c);
	}
	public void add(int a,int b) {
		System.out.println("overload Addition is: "+(a+b));
	}
}

class Square extends Addition{
	public int c;
	
	public Square(int a,int b,int c) {
		super(a,b);
		this.c=c;
		
	}
	
	public void add(){
		super.add();
		System.out.println("Addition of the three variables are :"+(a+b+c));
		super.add(20,(a+b+c));
	}
	
   public void square() {
	   int d=a+b+c;
	   System.out.println("square is :"+Math.pow(d, 2));
	}

}

	
