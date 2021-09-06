package com.collection.activity2;
import java.util.*;
public class ListManager {
	public static List<String>getArrayList(){
		//string array
		String[] elements=new String[3];
		elements[0]="cat";
		elements[1]="dog";
		elements[2]="bird";
		
		//arraylist
		List<String>list=new ArrayList();
		
		//string array to arraylist
		list=Arrays.asList(elements);
		return list;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println(getArrayList());
		
	}

}
