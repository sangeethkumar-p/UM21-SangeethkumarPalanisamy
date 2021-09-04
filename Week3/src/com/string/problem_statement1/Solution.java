package com.string.problem_statement1;

/**
 * @author Sangeethkumar
 *  1.Write a program which creates a String “Welcome to Java World” and performs the following 
    2.Returns the character at 5th position and display it.
    3.Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
    4.Concatenates “- Let us learn” to the above string and display it.
    5.Returns the position of the first occurrence of character ‘a’ and display it.
    6Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
    7.Returns string between 4th position and 10th position and display it.
    8.Returns the lowercase of the string and display it.

 */
public class Solution {
	public static void main(String args[]) {
		String str="Welcome to Java World";
		System.out.println("1. "+str);
		System.out.println("2. "+str.charAt(4));
		if(str.contains("Welcome")) {
			System.out.println("3. "+true);
		}else {
			System.out.println("4. "+false);
		}
		String str1=str.concat("- Let us learn");
		System.out.println("4. "+str1);
		System.out.println("5. "+str.indexOf('a'));
		System.out.println("6. "+str.substring(3, 10));
		System.out.println("7. "+str.toLowerCase());

		
		
	}

}
