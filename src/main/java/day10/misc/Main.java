package day10.misc;
class Divider{
	public static int divider(int a, int b)throws IllegalArgumentException{
		if(b==0) {
			throw new IllegalArgumentException("input can't be 0");
		}
		int c = a/b;
		return c;
	}
}
public class Main {
public static void main(String[] args) {
	Divider.divider(5, 0);
	System.out.println();
}
}
