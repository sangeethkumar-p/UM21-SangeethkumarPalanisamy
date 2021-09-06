package com.collection.activity1.own;
import java.util.*;

public class ListManager{
	public static List<String>removeElements(String str){
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
		
		
	    List<String>list3=new ArrayList();
	    list3.addAll(list1);
	    list3.addAll(list2);
	   
	    List<String>list4=new ArrayList();
	    list4.addAll(list1);
	    list4.addAll(list2);
	    
	    //for animals
	    list3.retainAll(list1);
	    //for birds
	    list4.retainAll(list2);
	    
	    
	    
	    if(str.equals("animals"))
	    	return list3;
	    if(str.equals("birds"))
	    	return list4;
	    return list;	
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=>type 'animals' to get animal list \n=>type 'birds' to get bird list\n=>type except these to get combination of bird and animal list");
		System.err.print("what list you want ? :");
		String str=sc.next();
		System.out.println(" Your resultant list ==>"+removeElements(str));
	}

}
