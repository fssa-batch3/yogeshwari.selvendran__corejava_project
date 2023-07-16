package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class CityArrayList {
    public static void main(String[] args) {
    	
        List<String> cityList = new ArrayList<String>();
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
        cityList.add("Mumbai");

        // Add logic to remove the duplicate Array and
        // store the unique city names in another ArrayList
        List<String> Cities = new ArrayList<String>();
        
//        Set<String> uniqueCities = new HashSet<String>(cityList);
//
//        for (String city : uniqueCities) {
//        	Cities.add(city);
//        }
        
        for(String city : cityList) {
        	if(Cities.contains(city)) {
        		continue;
        	}
        	else {
        		Cities.add(city);
        	}
        }

        System.out.println("Unique cities: " + Cities);
    }
        
     public static   List<String> removeDuplicate (List<String> cityList) throws IllegalArgumentException{
    	 List<String> Cities = new ArrayList<String>();
    	 if(cityList==null ||cityList.size()==0) {
    		 throw new IllegalArgumentException("Array can't be empty");
    	 }
    	 for(String city : cityList) {
         	if(!Cities.contains(city)) {
         		Cities.add(city);
         	}
         	else {
         		throw new IllegalArgumentException("Array contains dublicate cities");
         	}
         }
    return Cities;
}
}