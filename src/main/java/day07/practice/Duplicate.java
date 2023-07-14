package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

/*
 * Question#1: Create an ArrayList<Integer> of numbers with duplicate entries.
 *  Use an HashSet<Integer> to remove the duplicates and display the Unique values
 */
public class Duplicate {

public static void main(String[] args) {
	
//	Create a  ArrayList integer
	ArrayList<Integer> numbers = new ArrayList<Integer>();
//	Add the List of the numbers with duplication
	numbers.add(1);
	numbers.add(3);
	numbers.add(5);
	numbers.add(5);
	numbers.add(7);
//	Print the ArrayList of Integer number without hasset
	System.out.println("Array List :"+ numbers);
	
//Create a HasSet integer
	HashSet<Integer> numerset = new HashSet<Integer>();
//	Add the Set of  numbers with duplication
	numerset.add(1);
	numerset.add(3);
	numerset.add(5);
	numerset.add(5);
	numerset.add(7);
//	Print the HashSet of Integer number without duplication
	System.out.println("Unique values :"+ numerset);

}
}
