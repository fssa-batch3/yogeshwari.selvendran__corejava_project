package day06.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCityArrayList {
	
//	We check  the valide city names 
	@Test
	public void testvalidate() {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		
		List<String> uniqueCityList = CityArrayList.removeDuplicate(cityList);
		Assertions.assertEquals(3, uniqueCityList.size());
		Assertions.assertTrue(uniqueCityList.contains("Chennai"));
		Assertions.assertTrue(uniqueCityList.contains("Bangalore"));
		Assertions.assertTrue(uniqueCityList.contains("Mumbai"));
	}
	
//	We pass the invalid city name and catch the Exception
	
	@Test
	public void testInvalidate() {
		
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		
		try {
			List<String> uniqueCityList = CityArrayList.removeDuplicate(cityList);
			Assertions.fail("restInvalidaye failed");
		}
		catch(IllegalArgumentException e) {
			Assertions.assertEquals("Array contains dublicate cities", e.getMessage());
		}
		
		List<String> cityList1 = new ArrayList<String>();
		try {
			List<String> uniqueCityList = CityArrayList.removeDuplicate(cityList);
			Assertions.fail("restInvalidaye failed");
		}
		catch(IllegalArgumentException e) {
			Assertions.assertEquals("Array can't be empty", e.getMessage());
		}
	}
	
	
}
