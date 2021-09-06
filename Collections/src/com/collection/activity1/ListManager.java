package com.collection.activity1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManager{
	public static List<String>removeElements(){
		List<String>list1=new ArrayList();
		List<String>list2=new ArrayList();
		
		// list 1 ==>animals
		list1.add("Cat");
		list1.add("Dog");
		list1.add("Lion");
		list1.add("Tiger");
		
		//list2 ==>birds
		list2.add("Peacock");
		list2.add("Crow");
		list2.add("Dove");
		list2.add("Sparrow");
		
		//new list for combine list1  and 2
		List<String>list=new ArrayList();
		list.addAll(list1);
		list.addAll(list2);
		
		//return only list2 ,list1->removed
		list.retainAll(list2);
	    return list;	
	}
	public static void main(String args[]) {
		System.out.println(" Your resultant list ==>"+removeElements());
	}

}
