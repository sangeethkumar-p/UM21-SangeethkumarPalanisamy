package com.collections.problem_statement1;
import java.util.List;
import java.util.ArrayList;

public class Solution {
	public  List<Integer>arrListA1=new ArrayList<Integer>();
	public  List<Integer>arrListA2=new ArrayList<Integer>();
	
	public  List<Integer>storeEvenNumbers(int N){
		List<Integer>A1=new ArrayList<Integer>();
		for(int i=2;i<=N;i++) {
			if(i%2==0) {
				A1.add(i);
			}
		}
		arrListA1.addAll(A1);
		return A1;
	}
	
	public  List<Integer>printEvenNumbers() {
		
		List<Integer>A2=new ArrayList<Integer>();
		for(int i=0;i<arrListA1.size();i++) {
			int a=(arrListA1.get(i))*2;
			A2.add(a);
		}
		arrListA2.addAll(A2);
		return A2;
	}
	
	public  int retrieveEvenNumbers(int N) {
		if(arrListA1.contains(N)) 
			return N;
		return 0;
	}
}
