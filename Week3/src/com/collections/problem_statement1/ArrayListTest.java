package com.collections.problem_statement1;
import java.util.Scanner;

/**
 * @author Sangeethkumar
 * 1.Develop a java class with a method storeEvenNumbers(int N) using ArrayList to store even numbers from 2 to N, where N is a integer which is passed as a parameter to the method storeEvenNumbers().  The method should return the ArrayList (A1) created. 
   2.In the same class create a method printEvenNumbers()which iterates through the arrayList A1 in step 1,  and It should multiply each number with 2 and display it in format 4,8,12….2*N. and add these numbers in a new ArrayList (A2). The new ArrayList (A2) created needs to be returned.
   3.Create a method retrieveEvenNumber(int N)  parameter is a number N. This method should search the arrayList (A1) for the existence of the number ‘N’ passed.  If exists it should return the Number else return zero.
      Hint:  Use instance variable for storing the ArrayList A1 and A2.

 */
public class ArrayListTest {
	public static void main(String args[]) {
		Solution sl=new Solution();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number        :");
		int N=sc.nextInt();
		System.out.print("Enter element to search :");
		int search=sc.nextInt();
		System.out.println("1.Even numbers between 2 to "+N+"=>\n"+sl.storeEvenNumbers(N));
		System.out.println("2.Even numbers multiply by 2 =>\n"+sl.printEvenNumbers());
		System.out.println("3.Your search results =>\n"+sl.retrieveEvenNumbers(search));
	    sc.close();
	}
}
