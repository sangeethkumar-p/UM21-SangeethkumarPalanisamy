package com.collections.problem_statement2;
import java.util.*;

class Solution {
	public HashSet<String>Country=new HashSet<String>();
	public HashSet<String>storeCountryNames(String CountryName){
		Country.add(CountryName);
		return Country;
	}
	public String retrieveCountry(String CountryName) {
		if(Country.contains(CountryName))
			return CountryName;
		return null;
	}
}
