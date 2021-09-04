package com.collections.problem_statement3;
import java.util.*;

public class Solution {
	public HashMap<String,String>CountryMap=new HashMap<String,String>();
	public HashMap<String,String>storeCountryCapital(String CountryName, String capital){
		CountryMap.put(CountryName, capital);
		return CountryMap;
	}
	public String retrieveCapital(String CapitalName) {
		if(CountryMap.containsValue(CapitalName)) {
			return CapitalName;
		}
		return null;
	}
	public String retrieveCountry(String CountryName) {
		if(CountryMap.containsKey(CountryName)) {
			return CountryName;
		}
		return null;
		
	}
	public HashMap<String,String> hashMap(){
		Set<Map.Entry<String, String>>entrySet=CountryMap.entrySet();
		
		HashMap<String,String>CountryMap2=new HashMap<String,String>();
		for(Map.Entry<String, String>entry:entrySet) {
		    CountryMap2.put(entry.getValue(), entry.getKey());
		}
		
		return CountryMap2;
	}
	public List<String>countryNames(){
		List<String>list=new ArrayList<String>(CountryMap.keySet());
		return list;
	}
}
