package day06.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        
        Set<String> uniqueCities = new HashSet<String>(cityList);

        for (String city : uniqueCities) {
        	Cities.add(city);
        }

        System.out.println("Unique cities: " + Cities);
    }
}
