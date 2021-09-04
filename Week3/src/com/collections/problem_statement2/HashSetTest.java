package com.collections.problem_statement2;
import java.util.Scanner;

/**
 * @author Sangeethkumar
 *  1.Develop a java class with a instance variable Country  HashSet (H1)  add a method storeCountryNames(String CountryName) , the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
    2.Develop a method retrieveCountry(String CountryName) which iterates through the HashSet and returns the country if exist else return null.  
 */
public class HashSetTest {
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Country name : ");
			String str=sc.next();
			System.out.print("Search the country : ");
			String search=sc.next();
			Solution sl=new Solution();
			System.out.println("1.Country       :"+sl.storeCountryNames(str));
			System.out.println("2.Search result :"+sl.retrieveCountry(search));
            sc.close();
		}
}


