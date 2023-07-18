package day09.practice;
import java.util.Collections;
import java.util.*;
/*
 * Using the ArrayList<Integer> sort a list of integers read from the user
 * Sample Input: 
 * Enter numbers: 8 9 45 12 1*
 * Sample Output: 
 * Sorted list: 1 8 9 12 45*
 */

public class ShortNum {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the size of the array maximum 10");
      int listCount = s.nextInt();
  	ArrayList <Integer> numbers = new ArrayList<>();
      for(int i=0; i<listCount; i++) {
    	  System.out.println("Enter the List of the array");
    	  numbers.add(s.nextInt());
      }

//	while(listCount<=10) {
//		System.out.println("Enter the List of the array");
	//  numbers.add(s.nextInt()); 
//		
//		
//	}
	
	Collections.sort(numbers);
	
	for(Integer result : numbers) {
		System.out.print(result+" ");
	}
	
}


}
