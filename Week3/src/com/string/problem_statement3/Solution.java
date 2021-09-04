package com.string.problem_statement3;
import java.io.File;
import java.util.*;


/**
 * @author Sangeethkumar
 *Write a program which creates a String “C:\IBM\DB2\PROGRAM\DB2COPY1.EXE”. It parses the string with the delimiter as ‘\’ and displays the String in the following format.
          1. Drive: c:\
          2. Folders: IBM || DB2 || PROGRAM 
          3. File: DB2COPY1.EXE
 */
public class Solution {

	public static void main(String[] args) {
		String string="C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE";
		File path = new File(string);
		String str=path.getParent();
		
		System.out.println("1.Drive :"+str.substring(0,3));
		
		String str1=str.replaceAll("\\\\", "||");
		String substring=str1.substring(4);
		
		System.out.println("2.Folder:"+substring);
		System.out.println("3.File  :"+path.getName());
		
		
	}

}
