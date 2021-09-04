package com.string.problem_statement2;


/**
 * @author Sangeethkumar
 * 1.Write a program which creates a StringBuffer “This is StringBuffer” and performs the following. 
   2.Adds the string ”- This is a sample program” to existing string and display it.
   3.Inserts the string “Object” into the existing string at 21st postion and display it.
   4.Reverses the entire string and displays it.
   5.Replaces the word “Buffer” with “Builder” and display it.

 */
public class Solution {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("This is StringBuffer");
		String str=sb.toString();
		System.out.println(" 1. "+str);
		sb.append("- This is a sample program");
		System.out.println(" 2. "+sb.toString());
		sb.insert(21, "Object");
		System.out.println(" 3. "+sb.toString());
		System.out.println(" 4. "+sb.reverse());
		String str1= str.replace("Buffer", "Builder");
		System.out.println(" 5. "+str1);
	}

}
