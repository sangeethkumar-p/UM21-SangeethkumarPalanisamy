package com.project;

public class Principle {
	public int count;
	
	public void setCount() {
		count++;
	}
	public int getcount() {
		return count;
	}

}
class FirstYear{
	public Principle display(Principle p) {
		p.setCount();
		return p;
	}
	
}
class SecondYear{
	public Principle display(Principle p) {
		p.setCount();
		return p;
	}
	
}
class ThirdYear{
	public Principle display(Principle p) {
		p.setCount();
		return p;
	}
	
}
class FourthYear{
	public Principle display(Principle p) {
		p.setCount();
		return p;
	}
	
}
class PrincipleAssistance{
	public void displayDetails(Principle p) {

		FirstYear fs=new FirstYear();
		SecondYear sy=new SecondYear();
		ThirdYear ty=new ThirdYear();
		FourthYear fy=new FourthYear();
		Display disply=new Display();
		
		p=fs.display(p);
		p=sy.display(p);
		p=ty.display(p);
		p=fy.display(p);
	
		disply.getCount(p);
		
	}
}
class Display{
	public void getCount(Principle p) {
		System.out.println("count : "+p.getcount());
	}
}

