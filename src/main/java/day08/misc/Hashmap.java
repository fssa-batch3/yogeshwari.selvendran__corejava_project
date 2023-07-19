package day08.misc;

import java.util.*;

public class Hashmap {
	public static void main(String[] args) {
		
		
		String arr[]= {"Prathuisha","Naresh","Prathuisha","Vishali","Nithilan","Prathuisha","Vishali"};
		Map<String,Integer> countMap =new  HashMap<String,Integer>();
		for(int i=0;i<arr.length;i++) {
			
			if(countMap.get(arr[i])==null) {
				countMap.put(arr[i], 1);
			}
			else {
				int count=countMap.get(arr[i]);
				count++;
				countMap.put(arr[i], count);
				
				
			}
			
		}
		System.out.println(countMap);
}
}
