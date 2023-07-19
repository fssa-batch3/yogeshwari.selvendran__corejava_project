package day08.practice;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class UserCount {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String [] arr = {"Ram","Spider","Superman","hello","Ram","Spider","hey","hello"};
	Map<String,Integer> count =new  HashMap<String,Integer>();
 	for(int i=0; i<arr.length;i++) {
 		if(count.get(arr[i])==null) {
			count.put(arr[i], 1);
		}
		else {
			int countnum=count.get(arr[i]);
			countnum++;
			count.put(arr[i], countnum);
		}
	}
 	for(String arrayElement : count.keySet()) {
 		Integer countnum= count.get(arrayElement);
 	System.out.println(arrayElement +": "+countnum);
 	}
 	
}

}
