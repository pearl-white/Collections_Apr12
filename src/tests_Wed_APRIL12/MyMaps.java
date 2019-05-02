package tests_Wed_APRIL12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMaps {

	public static void main(String[] args) {
		
		Map<Integer,String>  zipcodes= new HashMap<>();
		zipcodes.put(20170, "Herndon");
		zipcodes.put(22102, "McLean");
		zipcodes.put(22302, "Alexandria");
		zipcodes.put(22033, "Fairfax");
		zipcodes.put(32189, "Orlando");
		
		System.out.println("Number of zipcodes: "+ zipcodes.size());
		System.out.println("22102 Present: "+ zipcodes.containsKey(22102));   //true
		System.out.println("22103 Present: "+ zipcodes.containsKey(22103));   //false		

		System.out.println("Orlando zipcodes are here: "+ zipcodes.containsValue("Orlando"));
		
		//print all zipcodes           keySet();   values();   entrySet();
		Set<Integer> zips=zipcodes.keySet(); 
		System.out.println("All zipcodes: "+ zipcodes.keySet());
		
		// print all cities:
		System.out.println("All cities: "+ zipcodes.values());
		
		//Find the city of 20170
		System.out.println("What city is 20170?: "+ zipcodes.get(20170));
		
		// read all of zipcodes with city names
		for (int zipCode: zips){
			System.out.println(zipCode+"-"+ zipcodes.get(zipCode) );
		}
		
		
		System.out.println("==========");
		
		// using entrySet();
		for (Map.Entry<Integer, String> zipAndCity : zipcodes.entrySet()){
			System.out.println(zipAndCity.getKey()+"-"+ zipAndCity.getValue());
		}
		
		
		
		
		
		
	}
	
}
