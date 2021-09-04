package com.collections.problem_statement3;

/**
 * @author Sangeethkumar
 *Problem Statement 3:
      1.Develop a java class with a instance variable CountryMap  HashMap (M1)  add a method storeCountryCapital(String CountryName, String capital) , the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).
        Key- Country	            Value - Capital
            India	                         Delhi
            Japan	                         Tokyo

     2.Develop a method retrieveCapital(String CountryName) which returns the capital for the country passed from the Map M1 created in step 1.
     3.Develop a method retrieveCountry(String capitalName) which returns the country for the capital name passed from the Map M1 created in step 1.
     4.Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.
            Key - Capital	Value – Country
                   Delhi	        India
                   Tokyo	        Japan
     5.Develop a method which iterates through the map M1 and creates a ArrayList with all the Country names stored as keys. This method should return the ArrayList.
 */
public class HashMapTest {
	public static void main(String[] args) {
		Solution sl=new Solution();
		System.out.println("1.Country=Capital->hashmap1 :"+sl.storeCountryCapital("India","Delhi"));
		System.out.println("2.Country=Capital->hashmap1 :"+sl.storeCountryCapital("Japan","Tokyo"));
		System.out.println("3.search result for capital :"+sl.retrieveCapital("Delhi"));
		System.out.println("4.search result for country :"+sl.retrieveCountry("India"));
		System.out.println("5.Capital=Country->HashMap2 :"+sl.hashMap());
		System.out.println("6.Display Countries->arrList:"+sl.countryNames());
	}

}
