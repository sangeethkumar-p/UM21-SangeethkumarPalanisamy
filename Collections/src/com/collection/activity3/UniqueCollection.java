package com.collection.activity3;

import java.util.*;

public class UniqueCollection {
	public TreeSet<String>getCollection(){
		String[] elements=new String[5];
		elements[0]="car";
		elements[1]="bike";
		elements[2]="car";
		elements[3]="bicycle";
		elements[4]="lorry";
		List<String>list=new ArrayList();
		list=Arrays.asList(elements);
		TreeSet<String> collection=new TreeSet();
		collection.addAll(list);
		return collection;
	}

}
